<#include "security.ftl">

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">BRAutomatic</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/auth">Войти</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/registration/">Регистрация</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/disk/all">Свободные диски</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/disk/add">Добавить диск</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/disk/taken">Взятые диски</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/disk/taken/given">Отданные диски</a>
            </li>
        </ul>
        <div class="navbar-text mr-3">${name}</div>
        <a href="/logout"><button class="btn btn-primary">LOGOUT</button></a>
    </div>
</nav>
