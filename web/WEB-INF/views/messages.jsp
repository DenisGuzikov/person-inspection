<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Questions</title>
</head>
<body>
<table>
    <tr>
        <td>MESSAGE</td>

    </tr>
    <c:forEach items="${allMessages}" var="message" varStatus="status">
        <tr>
            <td>${message}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>