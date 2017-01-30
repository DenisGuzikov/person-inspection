<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Questions</title>
</head>
<body>
<table>
    <tr>
        <td>ID</td>
        <td>question</td>
        <td>answer1</td>
        <td>answer2</td>
        <td>answer3</td>
        <td>answer4</td>
        <td>correctanswers</td>
    </tr>
    <c:forEach items="${allUsers}" var="user" varStatus="status">
        <tr>
            <td>${user.id}</td>
            <td>${user.login}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.email}</td>
            <td>${user.inspectionStatus}</td>
            <td>${user.accountStatus}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
