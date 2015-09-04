(function (biosphere) {
    "use strict";

    function Environment(element, configuration) {
        this.configure(element, configuration);
    }

    Environment.prototype.configure = function (element, configuration) {
        this.element = element;
        this.config = configuration;
    };

    Environment.prototype.render = function (data) {
        var width = 500,
            height = 300;

        var n = 50,
            m = 12,
            degrees = 180 / Math.PI;

        var individuals = d3.range(n).map(function () {
            var x = Math.random() * width,
                y = Math.random() * height;
            return {
                vx: Math.random() * 2 - 1,
                vy: Math.random() * 2 - 1,
                path: d3.range(m).map(function () {
                    return [x, y];
                }),
                count: 0
            };
        });

        var svg = d3.select("#environment").append("svg")
            .attr("width", width)
            .attr("height", height);

        var g = svg.selectAll("g")
            .data(individuals)
            .enter().append("g");

        var head = g.append("ellipse")
            .attr("rx", 0.5)
            .attr("ry", 0.5);

        g.append("path")
            .datum(function (d) {
                return d.path.slice(0, 5);
            })
            .attr("class", "tail");

        var tail = g.selectAll(".tail");

        d3.timer(function () {
            for (var i = -1; ++i < n;) {
                var individual = individuals[i],
                    path = individual.path,
                    dx = individual.vx,
                    dy = individual.vy,
                    x = path[0][0] += dx,
                    y = path[0][1] += dy,
                    speed = Math.sqrt(dx * dx + dy * dy),
                    count = speed * 10,
                    k1 = -5 - speed / 3;

                // Bounce off the walls.
                if (x < 0 || x > width) individual.vx *= -1;
                if (y < 0 || y > height) individual.vy *= -1;

                // Swim!
                for (var j = 0; ++j < m;) {
                    var vx = x - path[j][0],
                        vy = y - path[j][1],
                        k2 = Math.sin(((individual.count += count) + j * 3) / 300) / speed;
                    path[j][0] = (x += dx / speed * k1) - dy * k2;
                    path[j][1] = (y += dy / speed * k1) + dx * k2;
                    speed = Math.sqrt((dx = vx) * dx + (dy = vy) * dy);
                }
            }

            head.attr("transform", function (d) {
                return "translate(" + d.path[0] + ")rotate(" + Math.atan2(d.vy, d.vx) * degrees + ")";
            });
            tail.attr("d", function (d) {
                return "M" + d.join("L");
            });
        });

    };

    biosphere.directive('environment', function () {
        return {
            restrict: 'E',
            replace: true,
            scope: {
                data: '='
            },
            template: '<div id="environment"></div>',
            link: function (scope, element) {
                scope.$watch('data', function (newValue, oldValue) {
                    scope.bar.render(scope.data);
                });
                var config = {};
                scope.bar = new Environment(element[0], config);
            }
        }
    });

})(biosphere);