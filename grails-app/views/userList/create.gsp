<html>
<head>
    <title>Create User</title>
    <meta name="layout" content="main">
</head>
<body>
<div style="position:absolute; top:130px; left: 350px">
    <h1> User Details</h1>
    <g:form controller="userList" action="save" method="POST">

        <label>User Id</label>
        <g:textField name="id" id="user-id"/>
        <br>
        <br>

        <label>User Name</label>
        <g:textField name="name" id="user-name"/>
        <br>
        <br>

        <button type="submit" id="create-user">Create</button>
    </g:form>
    </div>
</body>
</html>