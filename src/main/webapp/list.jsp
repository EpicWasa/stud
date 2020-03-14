<%--
  Created by IntelliJ IDEA.
  User: EpicWasa
  Date: 14.03.2020
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<html>
<head>
    <title>Title</title>

</head>
<body>


<table>
    <thead><td>Studied</td><td>Begin date</td><td>Dead Line</td></thead>
    <jsp:useBean id="notes" scope="request" type="ua.hackaton.PlanList"/>
    <c:forEach var="n" items="${notes.nodes}">
        <tr>
            <td>${n.studied}</td>
            <td>${n.beginDate}</td>
            <td>${n.deadline}</td>
            <td>${n.details}</td>
        </tr>
    </c:forEach>
</table>

<form method="post" id="form" action="${pageContext.request.contextPath}/list">
    <input type="text" name="studied" placeholder="what to study?" />
    <input type="text" name="deadline" placeholder="yyyy-mm-dd" />
    <input type="text" name="details" placeholder="details"/>
    <input type="submit" form="form" />
</form>
</body>
</html>
