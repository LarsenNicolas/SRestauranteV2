<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    <title>Restaurante Registro</title>
</head>
<body>
<jsp:include page="background.jsp"/>
<header>
    <h1>S.I.R.</h1>
    <h2>Sistema Integral de Restaurante</h2>
</header>
<main>
    <h2>Registrar Restaurante</h2>
    <div class="log-form">
        <form action="#" onsubmit="validar()" name="form">
            <label for="administrador">Administrador:</label>
            <input type="text" id="administrador" name="administrador">
            <br>
            <br>
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre">
            <br>
            <br>
            <label for="especialidad">Especialidad: </label>
            <input type="text" id="especialidad" name="especialidad">
            <br>
            <br>
            <label for="cantidadMesas">Cantidad de Mesas: </label>
            <input type="number" id="cantidadMesas" name="cantidadMesas">
            <br>
            <br>
            <label for="cantidadMozos">Cantidad de Mozos: </label>
            <input type="number" id="cantidadMozos" name="cantidadMozos">
            <br>
            <br>
            <label for="direccion">Direccion: </label>
            <input type="text" id="direccion" name="direccion">
            <br>
            <br>
            <div class="condiciones">
                <label for="condiciones">Acepto Términos y Condiciones:</label>
                <input type="checkbox" name="condiciones" id="condiciones">
            </div>
            <br>
            <input type="submit" value="Enviar" >
            <button id="ir-a-menu">Ir a Menu</button>
            <div id="mensaje" class="error">

            </div>
        </form>
    </div>
</main>
<footer>
    <h3>S.I.R. (Sistema Integral de Restaurante)</h3>
    <div>
        <h3>Creadores: </h3>
        <p>Bringa Juan Manuel -</p>
        <p>Galvan Florencia -</p>
        <p>Juhal Lorena -</p>
        <p>Larsen Nicolas -</p>
        <p>Rementario Brenda</p>
    </div>
</footer>
</body>
</html>

