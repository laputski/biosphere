"use strict";

var context = "/biosphere/";
var biosphere = angular.module('biosphere',
    [
        'ngRoute',
        'ngResource',
        'ui.router',
        'ui.bootstrap'
    ]);

biosphere.constant('context', context);