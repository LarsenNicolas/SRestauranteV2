<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="css/form.scss" rel="stylesheet" >
</head>
<body>
<jsp:include page="background.jsp"/>
<div class = "container">
    <div class="login-box">
        <h2>Registrate</h2>
        <form:form action="validar-registro" method="POST" modelAttribute="datosLogin">
            <div class="user-box">
                <form:input path="email" id="email" type="email" />
                <label>Email</label>
            </div>
            <div class="user-box">
                <form:input path="password" type="password" id="password" />
                <label>Contrasena</label>
            </div>
            <div class="col-unica">
                <button class="noselect" Type="Submit"/>Registrar</button>
            </div>
        </form:form>
    </div>
    <c:if test="${not empty error}">
        <h4><span>${error}</span></h4>
        <br>
    </c:if>
</div>

<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>