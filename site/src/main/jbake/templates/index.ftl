<#include "header.ftl">

<#include "menu.ftl">

	<div class="page-header">
		<h1>News</h1>
	</div>

	<#list posts as post>
		<#if (post.status == "published")>
			<a href="${post.uri}"><h2><#escape x as x?xml>${post.title}</#escape></h2></a>
			<p>${post.date?string("dd.MM.yyyy")}</p>
			<p>${post.body}</p>
		</#if>
	</#list>

	<p class="text-right">
		<small>Ältere Beiträge sind im <a href="${content.rootpath}${config.archive_file}">Archiv</a> zu finden.</small>
	</p>

<#include "footer.ftl">