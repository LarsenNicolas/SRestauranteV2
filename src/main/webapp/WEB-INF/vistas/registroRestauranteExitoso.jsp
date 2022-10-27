<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="css/registroRestaurante.css" rel="stylesheet" >
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    <title>Restaurante Registro Exitoso</title>
</head>
<body>
<jsp:include page="background.jsp"/>
<%--//TODO pasar esto al include con un cif--%>
<div id="logout" class="logout-btn">
    <a href="login">Log out</a>
</div>
<main>
    <h2>Registro Exitoso!</h2>
    <h2>Se registro su Restaurante ${nombre}</h2>
    <button class="btn">Ir a Control de Mesas</button>
    <button class="btn">Ir a Menu</button>
    <button class="btn">Ir a Control de Personal</button>
</main>
</body>
</html>