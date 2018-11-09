var app = angular.module('BR', ['pascalprecht.translate'])

    .config(function ($translateProvider) {
        $translateProvider.translations('en', {
            SIGNIN: 'Sign in',
            REG: 'Registration',
            FD: 'Free disks',
            AD: 'Add disk',
            TD: 'Taken disks',
            GD: 'Given disks',
            LOGOUT: 'LOGOUT'
        });
        $translateProvider.translations('ru', {
            SIGNIN: 'Войти',
            REG: 'Регистрация',
            FD: 'Свободные диски',
            AD: 'Добавить диск',
            TD: 'Взятые диски',
            GD: 'Отданные диски',
            LOGOUT: 'ВЫЙТИ'
        });
        $translateProvider.preferredLanguage('en');
    })

    .controller('BRController', function ($scope, $translate) {
        $scope.selectLang = function (lang) {
            $translate.use(lang);
        }
    });