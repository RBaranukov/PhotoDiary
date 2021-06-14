<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>
    Client Info
</h2>
<br>

<form:form action="saveClient" modelAttribute="client">

    <form:hidden path="id"/>

    NameSurname <form:input path="nameSurname"/>
    <br>
    Communication <form:input path="communication"/>
    <br>
    Phone_number <form:input path="phoneNumber"/>
    <br>
    Cost <form:input path="cost"/>
    <br>
    Conditions <form:input path="conditions"/>
    <br>
    Notes <form:input path="notes"/>
    <br>
    Advertising_Source <form:input path="advertising_source"/>

    <input type="submit" value="OK">

</form:form>
</body>
</html>