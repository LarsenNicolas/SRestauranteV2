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
    <title>Solicitar Mesa</title>
</head>
<body>
<jsp:include page="background.jsp"/>
<%--//TODO pasar esto al include con un cif--%>
<div id="logout" class="logout-btn">
    <a href="login">Log out</a>
    <i class="fas fa-chevron-right"></i>
</div>
<main>
    <h2>Solicitar Mesa</h2>
    <div class="log-form">
        <form action="#" onsubmit="validar()" name="form">
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre">
            <br>
            <br>
            <label for="cantidadComensales">Cantidad de Comensales: </label>
            <input type="number" id="cantidadComensales" name="cantidadComensales">
            <br>
            <br>
            <input type="submit" value="Enviar" ><a href="reservaExitosa">Enviar</a>>
            <button id="pedirMesa">Pedir Mesa</button>

        </form>
    </div>
</main>
</body>
</html>