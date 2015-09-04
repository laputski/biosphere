(function () {
    function StatisticsService($http, $resource) {
        Object.defineProperty(this, '$http', {writable: false, value: $http});
        Object.defineProperty(this, '$resource', {writable: false, value: $resource});
    }

    StatisticsService.prototype.loadStatistics = function () {
        return this.$http({method: 'GET', url: context + 'statistics/population'});
    };

    StatisticsService.prototype.loadStatisticsByPopulation = function (populationId) {
        return this.$http({method: 'GET', url: context + 'statistics/population/' + populationId});
    };

    StatisticsService.prototype.loadStatisticsByIndividual = function (individualId) {
        return this.$http({method: 'GET', url: context + 'statistics/individual/' + individualId});
    };

    StatisticsService.prototype.setParams = function (params) {
        return this.$http({method: 'POST', url: context + 'statistics/params', data: params});
    };

    StatisticsService.$inject = ['$http', '$resource'];
    biosphere.service("StatisticsService", StatisticsService);
}());