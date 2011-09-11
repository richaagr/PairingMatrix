<html>
<head>
    <title>Display List</title>
    <meta name="layout" content="main">
</head>

<body>
<div id = "user-list-table" style="position:absolute; top:130px; left: 350px">
    <h1>User Details</h1>
    <table width=500px  border="5" class="show-list" id="showList">
        <thead>
        <tr>
            <th>User ID</th>
            <th>User Name</th>
        </tr>
        </thead>
        <tbody>

        <g:each in="${userList}" var="user">
            <tr>
                <td><%=user.userId%></td>
                <td><%=user.userName%></td>
            </tr>
        </g:each>
        <br>
        </tbody>
    </table>
</div>
</body>
</html>