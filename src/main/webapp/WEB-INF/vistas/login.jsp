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
		<div class="login-box">
			<h2>Sistema Integral de Restaurante</h2>
			<form:form action="validar-login" method="POST" modelAttribute="datosLogin">
				<div class="user-box">
					<form:input path="email" id="email" type="email" />
					<label>Email</label>
				</div>
				<div class="user-box">
					<form:input path="password" type="password" id="password" />
					<label>Contrasena</label>
				</div>
				<div class="row">
					<button class="col-custom col-sm-4 noselect" Type="Submit"/>Ingresar</button>
					<button class="col-custom col-sm-4 noselect" Type="Submit"/><a href="registrar-usuario"	>Registrar</a></button>
				</div>
			</form:form>
		</div>
		<c:if test="${not empty error}">
			<h4><span>${error}</span></h4>
			<br>
		</c:if>
	</body>
</html>
