<%--
  Created by IntelliJ IDEA.
  User: Nicolas
  Date: 10/15/2022
  Time: 5:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Mozo Home</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
    <jsp:include page="background.jsp"/>
    <div class = "container">
      <h1>Cliente Home</h1>
        <ul>
            <li>
                <a href="elegir-gusto">Elegir gustos</a>
            </li>
            <li>
                <a href="elegir-restriccion">Seleccionar restriccion alimentaria</a>
            </li>
        </ul>
    </div>
</body>
</html>
