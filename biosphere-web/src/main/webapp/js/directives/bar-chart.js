(function (biosphere) {
    "use strict";

    function BarChart(element, configuration) {
        this.configure(element, configuration);
    }

    BarChart.prototype.configure = function (element, configuration) {
        this.element = element;
        this.config = configuration;
    };

    BarChart.prototype.render = function (data, selected) {
        var margin = {top: 40, right: 20, bottom: 30, left: 40},
            width = 500 - margin.left - margin.right,
            height = 300 - margin.top - margin.bottom;

        var formatPercent = d3.format(".0%");

        var x = d3.scale.ordinal().rangeRoundBands([0, width], .1);
        var y = d3.scale.linear().range([height, 0]);
        var xAxis = d3.svg.axis().scale(x).orient("bottom");
        var yAxis = d3.svg.axis().scale(y).orient("left").tickFormat(formatPercent);

        var tip = d3.tip()
            .attr('class', 'd3-tip')
            .offset([-10, 0])
            .html(function (d) {
                return "<strong>Average Fitness:</strong> <span style='color:red'>" + d.averageFitness + "</span>";
            });

        var svg = d3.select("#barChart").append("svg")
            .attr("width", width + margin.left + margin.right)
            .attr("height", height + margin.top + margin.bottom)
            .append("g")
            .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

        svg.call(tip);

        x.domain(data.map(function (d) {
            return d.populationId;
        }));
        y.domain([0, d3.max(data, function (d) {
            return d.averageFitness;
        })]);

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

        svg.selectAll(".bar")
            .data(data)
            .enter().append("rect")
            .attr("class", "bar")
            .attr("x", function (d) {
                return x(d.populationId);
            })
            .attr("width", x.rangeBand())
            .attr("y", function (d) {
                return y(d.averageFitness);
            })
            .attr("height", function (d) {
                return height - y(d.averageFitness);
            })
            .on('mouseover', tip.show)
            .on('mouseout', tip.hide)
            .on('click', function (d) {
                selected = d.populationId;
            });

    };

    biosphere.directive('barChart', function () {
        return {
            restrict: 'E',
            replace: true,
            scope: {
                data: '=',
                selected: '='
            },
            template: '<div id="barChart"></div>',
            link: function (scope, element) {
                scope.$watch('data', function (newValue, oldValue) {
                    if(newValue !== oldValue) {
                        scope.bar.render(scope.data, scope.selected);
                    }
                });
                var config = {};
                scope.bar = new BarChart(element[0], config);
            }
        }
    });

})(biosphere);