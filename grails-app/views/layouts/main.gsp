<!DOCTYPE html>
<html>
    <head>
        <title><g:layoutTitle default="Grails" /></title>
        <link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />
        <link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
        <g:javascript library="application" />
    </head>

<body>
<div id="sidebar">
    <ul>
        
        <li><g:link controller="userList" action="create" name="createNameList">CREATE USER</g:link></li>
        <br/>
        <li><g:link controller="pairingRecord" action="create" name="savePairingRecord">ENTER PAIRING RECORD</g:link></li>
        <br/>
    </ul>
</div>
<div>
    <div id="main-content"><g:layoutBody /></div>
</div>
</body>
</html>