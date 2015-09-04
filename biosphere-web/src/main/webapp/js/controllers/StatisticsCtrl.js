(function () {
    var StatisticsCtrl = function StatisticsCtrl($log, $scope, StatisticsService) {
        Object.defineProperty(this, 'StatisticsService', {writable: false, value: StatisticsService});
        Object.defineProperty(this, 'selectedPopulation', {writable: true, value: 1});
        var self = this;
        StatisticsService.loadStatistics().success(function (populations) {
            self.populations = populations;
        });
        StatisticsService.loadStatisticsByPopulation(self.selectedPopulation).success(function (generations) {
            self.generations = generations;
        });

        $scope.$watch('selectedPopulation', function (newValue, oldValue) {console.log('selectedPopulation = '+newValue);
            if(newValue !== oldValue && newValue !== undefined) {
                StatisticsService.loadStatisticsByPopulation(newValue).success(function (generations) {
                    self.generations = generations;
                });
            }
        });

    };

    StatisticsCtrl.$inject = ['$log', '$scope', 'StatisticsService'];
    biosphere.controller('StatisticsCtrl', StatisticsCtrl);
}());