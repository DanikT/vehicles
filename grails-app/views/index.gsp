<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
<g:form controller="vehicle">
    <g:submitButton class="dropdown-item" name="Submit"
            value="View vehicle list" style="color:gray"/>
</g:form>
<sec:ifLoggedIn>
    <div>
        <g:form controller="user">
            <g:submitButton class="dropdown-item" name="Submit"
                    value="View user list" style="color:gray"/>
        </g:form>
    </div>
    <div>
        <g:form controller="logout">
            <g:submitButton class="dropdown-item" name="Submit"
                    value="Logout" style="color:gray"/>
        </g:form>
    </div>
</sec:ifLoggedIn>

</body>
</html>
