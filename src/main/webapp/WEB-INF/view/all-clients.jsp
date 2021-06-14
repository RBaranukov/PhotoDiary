<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>
    All Clients
</h2>
<br>

<table>
    <tr>
        <th>NameSurname</th>
        <th>Communication</th>
        <th>PhoneNumber</th>
        <th>Cost</th>
        <th>Conditions</th>
        <th>Notes</th>
        <th>Advertising_source</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="client" items="${allClients}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="clientId" value="${client.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteClient">
            <c:param name="clientId" value="${client.id}"/>
        </c:url>


        <tr>
            <td>${client.nameSurname}</td>
            <td>${client.communication}</td>
            <td>${client.phoneNumber}</td>
            <td>${client.cost}</td>
            <td>${client.conditions}</td>
            <td>${client.notes}</td>
            <td>${client.advertising_source}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href = '${updateButton}'"/>
                <input type="button" value="Delete"
                       onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>

</table>

<br>

<input type="button" value="Add"
       onclick="window.location.href = 'addNewClient'"/>



</body>
</html>