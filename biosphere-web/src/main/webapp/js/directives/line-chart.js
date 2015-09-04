(function (biosphere) {
    "use strict";

    function LineChart(element, configuration) {
        this.configure(element, configuration);
    }

    LineChart.prototype.configure = function (element, configuration) {
        this.element = element;
        this.config = configuration;
    };

    LineChart.prototype.render = function (data) {
        var margin = {top: 20, right: 20, bottom: 30, left: 50},
            width = 500 - margin.left - margin.right,
            height = 300 - margin.top - margin.bottom;

        var x = d3.time.scale()
            .range([0, width]);

        var y = d3.scale.linear()
            .range([height, 0]);

        var xAxis = d3.svg.axis()
            .scale(x)
            .orient("bottom");

        var yAxis = d3.svg.axis()
            .scale(y)
            .orient("left");

        var line = d3.svg.line()
            .x(function (d) {
                return x(d.generationId);
            })
            .y(function (d) {
                return y(d.averageFitness);
            });

        var svg = d3.select("#lineChart").append("svg")
            .attr("width", width + margin.left + margin.right)
            .attr("height", height + margin.top + margin.bottom)
            .append("g")
            .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

        x.domain(d3.extent(data, function (d) {
            return d.generationId;
        }));
        y.domain(d3.extent(data, function (d) {
            return d.averageFitness;
        }));

        svg.append("g")
            .attr("class", "x axis")
            .attr("transform", "translate(0," + height + ")")
            .call(xAxis);

        svg.append("g")
            .attr("class", "y axis")
            .call(yAxis)
            .append("text")
            .attr("transform", "rotate(-90)")
            .attr("y", 6)
            .attr("dy", ".71em")
            .style("text-anchor", "end")
            .text("Average Fitness");

        svg.append("path")
            .datum(data)
            .attr("class", "line")
            .attr("d", line);

    };

    biosphere.directive('lineChart', function () {
        return {
            restrict: 'E',
            replace: true,
            scope: {
                data: '='
            },
            template: '<div id="lineChart"></div>',
            link: function (scope, element) {
                scope.$watch('data', function (newValue, oldValue) {
                    if(newValue !== oldValue) {
                        scope.bar.render(scope.data);
                    }
                });
                var config = {};
                scope.bar = new LineChart(element[0], config);
            }
        }
    });

})(biosphere);