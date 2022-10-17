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
</head>
<body>
    <div class = "container">
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
            <form:form action="setear-rol" method="POST" modelAttribute="rolUsuario">
                <h3 class="form-signin-heading">Taller Web I</h3>
                <hr class="colorgraph"><br>

                <select name="rolUsuario" id="rolUsuario">
                    <option value="Administrador">Administrador</option>
                    <option value="Mozo">Mozo</option>
                    <option value="Cliente">Cliente</option>
                </select>

                <button class="btn btn-lg btn-primary btn-block" Type="Submit"/>Seleccionar rol</button>
            </form:form>
            <a href="registrar-usuario"	>Registrarme</a>
            <%--Bloque que es visible si el elemento error no esta vacio	--%>
            <c:if test="${not empty error}">
                <h4><span>${error}</span></h4>
                <br>
            </c:if>
            ${msg}
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>
