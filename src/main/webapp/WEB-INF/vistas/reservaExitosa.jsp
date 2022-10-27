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
    <title>Mesa Asiganada</title>
</head>
<body>
<header>
    <h1>S.I.R.</h1>
    <h2>Sistema Integral de Restaurante</h2>
</header>
<main>
    <h2>Mesa Asignada</h2>
    <div>
        <p>Su mesa es la numero ${numeroDeMesa}</p>
    </div>
    <input type="submit" value="Enviar" >
    <button id="mostarMenu">Mostar Menu</button>
</main>
<footer>
    <h3>S.I.R. (Sistema Integral de Restaurante)</h3>
    <div>
        <h3>Creadores: </h3>
        <p>Bringa Juan Manuel -</p>
        <p>Galvan Florencia -</p>
        <p>Larsen Nicolas -</p>
    </div>
</footer>
</body>
</html>