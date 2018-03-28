
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Menu</title>
    </head>
    <body>
        <h1>The menu</h1>
        
        <ul>
        <c:forEach var="menuItem" items="${menuItems}">
            <li><c:out value="${menuItem.name}" /></li>
        </c:forEach>
        </ul>
        
        <a href="/itdepends/addfood">Add a new item</a>
    </body>
</html>
