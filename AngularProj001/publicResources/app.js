var MyHomeApp = angular.module('HomeApp', ['ngRoute']);

MyHomeApp.config(function($routeProvider) {
        $routeProvider.
            when('/login', {
                templateUrl: '../partials/login.html'
            }).
            when('/contactus', {
                templateUrl: '../partials/contactus.html'
            }).
            when('/home', {
                templateUrl: '../partials/home.html',
                controller: 'HomeCtrl'
            }).
            when('/', {
                templateUrl: '../partials/home.html',
                controller: 'HomeCtrl'
            }).
            otherwise({
                redirectTo: '/home',
                controller: 'HomeCtrl'
            });
    });

