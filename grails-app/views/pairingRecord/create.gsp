<html>
<head>
    <title>Enter Pairing Record</title>
    <meta name="layout" content="main">
</head>
<body>
<div style="position:absolute; top:130px; left: 350px">
    <h1>Pairing Details</h1>
    <g:form controller="pairingRecord" action="save" method="POST">

        <label>User One Name</label>
        <g:textField name="user1" id="user1-id"/>
        <br>
        <br>

        <label>User Two Name</label>
        <g:textField name="user2" id="user2-id"/>
        <br>
        <br>

        <label>No Of Times Paired</label>
        <g:textField name="noOfTimesPaired" id="no-of-times-paired"/>
        <br>
        <br>

        <button type="submit" id="create-user">Save</button>
    </g:form>
    </div>
</body>
</html>