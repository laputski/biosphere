biosphere.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {

    $stateProvider.state({
        name: 'environment',
        url: '/environment',
        controllerAs: 'environmentCtrl',
        controller: 'EnvironmentCtrl',
        templateUrl: context + 'views/environment.html',
        accessRights: 'common_view'
    });

    $stateProvider.state({
        name: 'statistics',
        url: '/statistics',
        controllerAs: 'statisticsCtrl',
        controller: 'StatisticsCtrl',
        templateUrl: context + 'views/statistics.html',
        accessRights: 'common_view'
    });

    $urlRouterProvider.otherwise("/statistics");

}]);