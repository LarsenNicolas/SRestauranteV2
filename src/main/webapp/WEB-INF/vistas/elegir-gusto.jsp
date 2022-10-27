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
    <title>Elija gusto</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="css/base.scss" rel="stylesheet" >
    <link href="css/gusto.scss" rel="stylesheet" >
</head>
<body>
<jsp:include page="background.jsp"/>

    <div class="flip-card-container" style="--hue: 220">
        <div class="flip-card">

            <div class="card-front">
                <figure>
                    <div class="img-bg"></div>
                    <img src="https://images.ecestaticos.com/_cg6AD-a8L0toabkQSJiN6frVY4=/0x118:2269x1393/1600x900/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2F8b5%2Fc1d%2F016%2F8b5c1d0163f7a26de81530b12e1e3a02.jpg" alt="Dulce">
                </figure>

                <form:form action="setear-gusto-dulce" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Dulce</button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    <div class="flip-card-container" style="--hue: 170">
        <div class="flip-card">
            <div class="card-front">
                <figure>
                    <div class="img-bg"></div>
                    <img src="https://www.clarin.com/img/2022/05/27/la-hamburguesa-mucho-mas-que___0HXb0UR0v_2000x1500__1.jpg" alt="salado">
                </figure>
                <form:form action="setear-gusto-salado" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Salado</button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    <div class="flip-card-container" style="--hue: 170">
        <div class="flip-card">
            <div class="card-front">
                <figure>
                    <div class="img-bg"></div>
                    <img src="https://dietasi.com/wp-content/uploads/2015/08/Comida-picante.jpg" alt="picante">
                </figure>
                <form:form action="setear-gusto-picante" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Picante</button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    <div class="flip-card-container" style="--hue: 350">
        <div class="flip-card">
            <div class="card-front">
                <figure>
                    <div class="img-bg"></div>
                    <img src="https://i.pinimg.com/originals/54/d0/ce/54d0ce8f4c47e4bfece97605739bbf27.jpg" alt="agridulce">
                </figure>
                <form:form action="setear-gusto-agridulce" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Agridulce</button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    <div class="flip-card-container" style="--hue: 350">
        <div class="flip-card">
            <div class="card-front">
                <figure>
                    <div class="img-bg"></div>
                    <img src="https://blog.contraelcancer.es/wp-content/uploads/2020/03/iStock-1017706758-mod.jpg" alt="saludable">
                </figure>
                <form:form action="setear-gusto-saludable" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Saludable</button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>
