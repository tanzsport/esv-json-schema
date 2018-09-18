<#include "header.ftl">

<#include "menu.ftl">

    <div class="page-header">
        <h1><#escape x as x?xml>${content.title}</#escape></h1>
    </div>

    <p><em>${content.date?string("dd.MM.yyyy")}</em></p>

    <p>${content.body}</p>

    <p class="text-right"><small><em>zuletzt publiziert: ${published_date?string("dd.MM.yyyy, HH:mm")}</em></small></p>

<#include "footer.ftl">