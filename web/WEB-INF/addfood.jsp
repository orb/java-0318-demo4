<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Example</title>
    </head>
    <body>
        <h1>Add New Food</h1>


    <c:if test="${not empty error}">      
        <h2><c:out value="${error}" /><h2>
    </c:if>

    <form method="POST" action="/itdepends/addfood">
        <input type="text" name="food" placeholder="Enter a new food" />
        <input type="submit" value="Add!" />         
    </form>
</body>
</html>
