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
    <title>Elija Rol</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="css/base.scss" rel="stylesheet" >
    <link href="css/rol.scss" rel="stylesheet" >
</head>
<body>
    <jsp:include page="background.jsp"/>
    <div class="flip-card-container" style="--hue: 220">
        <div class="flip-card">

            <div class="card-front">
                <figure>
                    <div class="img-bg"></div>
                    <img src="https://www.wikihow.com/images_en/thumb/5/52/Be-a-Waiter-Step-1-Version-2.jpg/v4-460px-Be-a-Waiter-Step-1-Version-2.jpg" alt="Mozo">
                    <figcaption>Soy mozo</figcaption>
                </figure>

<%--                <ul>--%>
<%--                    <li>Detail 1</li>--%>
<%--                    <li>Detail 2</li>--%>
<%--                </ul>--%>
            </div>

            <div class="card-back">
                <figure>
                    <div class="img-bg"></div>
                    <img src="https://www.wikihow.com/images_en/thumb/5/52/Be-a-Waiter-Step-1-Version-2.jpg/v4-460px-Be-a-Waiter-Step-1-Version-2.jpg" alt="Mozo">
                </figure>
                <form:form action="setear-rol-mozo" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Mozo</button>
                    </div>
                </form:form>
            </div>

        </div>
    </div>
    <!-- /flip-card-container -->

    <!-- flip-card-container -->
    <div class="flip-card-container" style="--hue: 170">
        <div class="flip-card">

            <div class="card-front">
                <figure>
                    <div class="img-bg"></div>
                    <img src="https://static.vecteezy.com/system/resources/previews/006/903/981/non_2x/restaurant-waiter-serve-dish-to-customer-free-vector.jpg" alt="Image 2">
                    <figcaption>Cliente</figcaption>
                </figure>

<%--                <ul>--%>
<%--                    <li>Detail 1</li>--%>
<%--                </ul>--%>
            </div>

            <div class="card-back">
                <figure>
                    <div class="img-bg"></div>
                    <img src="https://static.vecteezy.com/system/resources/previews/006/903/981/non_2x/restaurant-waiter-serve-dish-to-customer-free-vector.jpg" alt="image-2">
                </figure>
                <form:form action="setear-rol-cliente" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Cliente</button>
                    </div>
                </form:form>
            </div>

        </div>
    </div>
    <!-- /flip-card-container -->

    <!-- flip-card-container -->
    <div class="flip-card-container" style="--hue: 350">
        <div class="flip-card">

            <div class="card-front">
                <figure>
                    <div class="img-bg"></div>
                    <img src="https://seminarioiiuntref.files.wordpress.com/2016/06/9116584-conjunto-de-administrador-de-dibujos-animados-divertido-foto-de-archivo.jpg?w=1200" alt="Brohm Lake">
                    <figcaption>Administrador</figcaption>
                </figure>
            </div>

            <div class="card-back">
                <!-- only if the image is necessary -->
                <figure>
                    <div class="img-bg"></div>
                    <img src="https://seminarioiiuntref.files.wordpress.com/2016/06/9116584-conjunto-de-administrador-de-dibujos-animados-divertido-foto-de-archivo.jpg?w=1200" alt="Brohm Lake">
                </figure>

                <form:form action="setear-rol-administrador" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Administrador</button>
                    </div>
                </form:form>

            </div>

        </div>
    </div>
<%--    <div class = "container">--%>
<%--        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">--%>
<%--            <form:form action="setear-rol" method="POST" modelAttribute="rolUsuario">--%>
<%--                <h3 class="form-signin-heading">Taller Web I</h3>--%>
<%--                <hr class="colorgraph"><br>--%>

<%--                <select name="rolUsuario" id="rolUsuario">--%>
<%--                    <option value="Administrador">Administrador</option>--%>
<%--                    <option value="Mozo">Mozo</option>--%>
<%--                    <option value="Cliente">Cliente</option>--%>
<%--                </select>--%>

<%--                <button class="btn btn-lg btn-primary btn-block" Type="Submit"/>Seleccionar rol</button>--%>
<%--            </form:form>--%>
<%--        </div>--%>
<%--    </div>--%>
</body>
</html>
