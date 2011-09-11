<html>
<head>
    <title>Show Pairing</title>
     <meta name="layout" content="main">
</head>
<body>
<div id = "pairingTable" style="position:absolute; top:130px; left: 350px">
    <h1>Pairing Details</h1>
   <table width=500px  border="5" class="show-pairing" id="showPairing">
        <thead>
        <tr>
            <th>User One</th>
            <th>User Two</th>
            <th>Times Paired</th>
        </tr>
        </thead>
        <tbody>

        <g:each in="${pairingList}" var="pair">
            <tr>
                <td><%=pair.user1%></td>
                <td><%=pair.user2%></td>
                <td><%=pair.noOfTimesPaired%></td>
            </tr>
        </g:each>
        <br>
        </tbody>
    </table>
    </div>
</body>
</html>