<#include "security.ftl">

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">BRAutomatic</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/auth" >{{ 'SIGNIN' | translate }}</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/registration/">{{ 'REG' | translate }}</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/disk/all">{{ 'FD' | translate }}</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/disk/add">{{ 'AD' | translate }}</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/disk/taken">{{ 'TD' | translate }}</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/disk/taken/given">{{ 'GD' | translate }}</a>
            </li>
        </ul>
        <div class="navbar-text mr-3">${name}</div>
        <a href="/logout"><button class="btn btn-primary">{{ 'LOGOUT' | translate }}</button></a>
</nav>
<div class="btn-group" role="group" aria-label="Basic example">
    <button type="button" class="btn btn-secondary" ng-click="selectLang('en')">English</button>
    <button type="button" class="btn btn-secondary" ng-click="selectLang('ru')">Русский</button>
</div>
