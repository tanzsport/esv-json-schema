	<!-- Fixed navbar -->
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="<#if (content.rootpath)??>${content.rootpath}<#else></#if>">ESV API</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
              <li><a href="<#if (content.rootpath)??>${content.rootpath}<#else></#if>index.html">Home</a></li>
              <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Schema <b class="caret"></b></a>
                  <ul class="dropdown-menu">
                      <li><a href="<#if (content.rootpath)??>${content.rootpath}<#else></#if>schema/definitionen.html">Definitionen</a></li>
                      <li><a href="<#if (content.rootpath)??>${content.rootpath}<#else></#if>schema/validator.html">Validator</a></li>
                  </ul>
              </li>
            <!--
            <li><a href="<#if (content.rootpath)??>${content.rootpath}<#else></#if>${config.feed_file}">Subscribe</a></li>
            -->
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
    <div class="container">