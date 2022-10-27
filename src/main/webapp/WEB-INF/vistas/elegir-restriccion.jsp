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
                    <img src="https://cdn-icons-png.flaticon.com/512/648/648486.png" alt="vegano">
                </figure>

                <form:form action="setear-vegano" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Vegano</button>
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
                    <img src="https://static.vecteezy.com/system/resources/previews/000/343/969/non_2x/vector-gluten-free-icon.jpg" alt="celiaco">
                </figure>
                <form:form action="setear-celiaco" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Celiaco</button>
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
                    <img src="https://cdn-icons-png.flaticon.com/512/723/723633.png" alt="vegetariano">
                </figure>
                <form:form action="setear-vegetariano" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Vegetariano</button>
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
                    <img src="https://img.freepik.com/vector-premium/icono-rojo-dibujos-animados-sal-sobre-fondo-blanco-ilustracion-vendimia-ilustracion-vector-aislado_100456-7604.jpg" alt="hipertenso">
                </figure>
                <form:form action="setear-hipertenso" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Hipertenso</button>
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
                    <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAhFBMVEX///8AAAD7+/s9PT03NzdWVlYwMDDz8/PIyMizs7PV1dVhYWH29vbv7+/o6OjHx8fBwcF0dHRqamrY2NgZGRmLi4ufn5+qqqpISEjd3d0UFBQhISFxcXFERETOzs6lpaWYmJiJiYmBgYElJSVYWFgMDAwqKipPT08yMjKxsbGSkpJlZWVLjA7dAAAQHElEQVR4nO1diXLqOgxla9mXFtoSypLSFij8//89vCW2JDsOdkrvvJyZO9NLIPGJZMmWZbnRqFGjRo0aNWrUqFHj/4RuMtj2BLbzyb1bExPd+U96Wa6aEIevp93sn2c62K0XiJqJ9sc/SzN5/Sogl+H9ada9d3PLYrv3Zaew2f1Dohzsv8vykyRH9266D0a795voCQx7925/EZKnAHocn7vWvUk4sD2G8uN4+atmZ7uMwo/h4y9ynMeRn8L5r+nq+DkqP4a3e3My8Bqd3xWP83vTyjAI8Q8uPP0RVS09fCmB2b3JXTEvMX55P7UZPvFEw4r1vfk1zj7N/FyfZ9vJKNe50SiZ/uy9RuaL5I7sri0tdBGr5zeHwRhPz8VOdPd7fBDmBW1b7jwE0Op9FGjtpXomFvw423Xs+w9M5mcnycO4QhYOuGzoKi3bqK1zzDCohEEBhvb2bG4y8uPUQfH33UbLbiGGt49FfuzK+tv2ptW2tWQZZt3tfTuN0nBfjGzv+rQNvrdVV18iNNwXo09LI6LMB8a2Hn6OcXcvtA50Cy6xAkk9i4qkke5fCEsfjGnuLOGeXzI3D+TDj3EjgdPq36IV9Ot9j/2Y7oZ8zi+4ftt0/iv6k+gxU+UDOIv2XPEQ/Vl96jGH6I8xMbYSrEKKA+oxFc80Hh0Mg6T42vwmnOmECiC8BjymEAUx+5ulKDo3wXFMBbkqjMHN3ASbzeebbqsZL8SRGj59BxOxoVtE8CaKO/MOkCNF8SkKHQI+kaOyFBW/r/lWOkCoq5Rxq8jxk8YboZSpU/weeNdSHIEcJ8RTKgkVj7wIlpFixi8bqGzblBwJp1GJnuI4yveInOd4SjHXT/1TUo6E9lQweiNeZGIJ1vhIUdnPIzL92464stI44gHcKSI1iRN6SJ99TIZrCqWo+D2Qrq2H5YiH4dEX37CiSEmRFN1StMtPAfVHwlHFNjboAdl0qSxFxe/LOTSBcsQj/sgxDTxnyttXiqLpH1zoqVCC4IgHjHHX+tHtP7SLJEXSnmf208sU9owxgLMJwUAi/DQue1JUmlYsP4XMd1x/0UNPiBk3QTcHYVGS4h7eRUTQLqVCxgOxfre8/nmBD4gYQH2D9x7Cb/hIsSU+7ZQaVP6I6VOnQdnTeOYUTdJwsMRDii318Wff98E7NQNmDPF6c7Tg4hbemerjxVJs5Z8vvDhq8yrOEHWWaBNFNDQju3ghRcbwS43JiuWo5LdMOooh6i2RMhnRBC2lv0cGODWKjOHD1aJKP/fu5Kjkdxzw4JBgiIQYKSqFXIXFSrc6boqS4ZVjoRx1fjpDJMQ40VNoZ+ye1k0xY1gkR5OfzhAJMYqtSUq8NydFjaGLo5LTMRv3aAzh4mIH/voWQBvtnDeQFPcEQ5uuYn4GQ+QTY6S/w1iXe5WXpPhCMaTkSPEzGKJIQwQ1hUq6cH+dNjdnkuGV46Mux8w/gHG5zhD65mU4Q2hJC2PqVikSDHM5Lma0/Bh0hg24PBw+h4KOvFDxaSm+WBjm/ZGWH4PB8AXcODh0CmOIG4/fWChaGOZypOTHYDCEvSY4rghnZV4LPxaKNoZKjjQ/wBC651VZRhDQV/hN7kiKHwvHAtz1ett2zWQII4uh/gImkHr+zJKPEoMh1CrvqZj9yTp8td6WUxSBYQvcMjBcA/u1t+WyUIzAEFr3QI8IA8H+Sk9TPNq+XoIhNA3eTSIBvE+ZrJkWSdEWPSrBEAaHw0wNyH9CESgXYIcRsLibEgzhjHxaplEIwPmkJX7at+ykoSmWYAgbFZSbAUc0/kMkGz9bi8owBB4MxWXLAC4w+wZzHfwsFMswBMbBar18AOcqfr9S/JZ4zdFKsQxDkL3xafudV1tvYNiXNrTTK9MXyzCEo5rStDSA2JbHxEJxaksL16c9P6JYhiEchoQE3IDGF24kU3xOWqi2T25ugxTLMITuIsQhgmXJAqvVX5nyk+j6UCzDEA6WQ/Y/gLiPc2FZ6WcHeeAxmZhuUgxhGLID4uJqlIH+gpSfgIcUQxiGBDLAmox1KgbtCwQtRT1hxMXwBBkCC109wyJ+DRvFn/wLLoafkCGoeRMyB/ZhmPFzLnUVSdHOkOu/mQIFVrmqZaj7dyfGZF/MpGhjKN+fOTIDMZJKGUp34tDPDF2nFGmGmf8xXR7Q0oj9EOWSySmgX1KEU4oUw8z/QP2IyBD4wxReV5PcjVcGEO00xGvDDNVYiOjf4A4ha91r81ZoTJNP423RXAMOiwoZWuUnv6wjJNcURF/RuJQxPMn1o6XH0ALMezSKJsNs/ECKB87LQ8alYOEJ7afg6RVZe4rkOCVD4YKizrDI/8B5ecjcAuzKRWuHarEl4+iQo5Ufp5gzdI7/OGC6ckh+G9xCYmOYt8umq4pfh874nymGbv0UALcoWLN1A841ocbrC2bKd1FynEl+jzN6c0Gz+c0Z+o2PQLqCdbTnAzjXhB3NXBLM4jOA40zGa07CcdEUWZ0C+Y42BeYfzHjCCrwADwZdPlz0VD5Ml+NMrn8eMsdsoyhQOP6Da3dh6dBgUzN0iHhZV8lRjQFULoKRc+mg6NZPDugswpbXQBgDqjy1cK0qPzDfofc/HTaKxfJr4JoxYZtLoIsGhplemldyfGgT8hOgI6l+S4EwuS0sjxaGhIENsSUf9LWx8YkaGFv2onqNocFgOXBjMNT51LxsTa/IOJL87LttfSiCn9y2q9PaFBATtjMUfnlla/H1tnSouJgi9NGheV9wI4fZEV0Mi8JnG9rcFFKEpiF0VzAcZJkNCGHYwXmdXhRhklY5PhjwRZtaH8bwJoow/zK80AGsVm3Y5kCGFopOpwiLEIXvzocpSMYbDmVooeiaS0MlDS/JBxfrjFlwMMPSUoS9JmjqJIAyKsbgYmASUEmKMNE7aBFfAm6oSrVrERiWVFQYywqvvIXn+fpWnBgMS0kR1a24hRHVUgOarYnCsIwUoZ2JoaR4WKOtksRhaKmhSUgRbZmPU+YE3TZ/dCSGeHecRYqwCFesgkMwHTZvWyyGdDUhJEUk61gbEFGkOuuJ0Rj6SRHVUYu1iRS5xIN+JQ5DixSNCAV6C/Hqf6CyFEo7IjK0SFE3JWhGGa+IMp7JyWliTIYWKeYUUWeJWT8NbRSXUVixMmOBiyFKr2BwKyreyh2zggsWorABjOHB9iAHw+k3uXXQqahoN3JQNB8BCVGM3YQNsqyqWRshVmmoCjMOKeIVnRhD0hx4YCXsmHyxJEcLQ7XLiQyOWqWIdTQocZYALi0inKJaQyX2nJEMezIWvPhBlzhs5gYXf49djZ4ogSMnilk9HciRYDglK10ZoKve4TJKoWFSDFyhpgMvAY6IYU+uYiycFZDs1TUNVHASDU5ozhbuWiRHwFBV1FkVVXgqrF3IkEZkpkAYAe0xBEeDodLPlaX/6fCQYjVVTNf4QXrgDXHUGJbh1/ChWE2xXWqXj+6TMl2VNfQyhpl98ePXKFbUOFN7DOrVmjbbkKNkqLIwPOVnf1SO6GWZM1AFWoFb0jhyhtku5jL8GgVSrLBEK3UgJfS8WT2267+DzHV1+wcSDimmMahYQEbF0PgQuk6Hf3fAKsXYwzUT5OEMeLFI53iD/ARsUqz4mCuyVjJe/8nsaqF/d4BOEKu8KjtZK4lKS2IcS9lPiIQ8hjbkjn4YkYm+HSIDstUPqllBn1YStZSgBZZsn9jFi+nS4aU2It8MegoXt7TvnD7DI0I1Gi/gGo0cq3hhhQ/6CVWfGpDD5qqe41Sj3FoOYTn84nGIVm8cYSFhjKJeEu+/et6jleJ7oMVpWRT0dyXIYOmLTb8dQjaM7Mcptn/9xE6LRWXo3JjTOrbKr4rjQYoxcR3oV/rovKt9sfU/hspOQ3BiRJ/mIzEs1SEnqe0YMI5KjyVxoeDIksvMz3skr9Zz6gTueOA6qrYJsUwLhgHj2b7oNOHHGLURb0bicdjxaf+2HWNLOJrMUlfXU7hPF9RQoKk5z+X6nO52b/3dLj1/DDe+50D/gTOPvULUt+LrTxwjPyJCxZEQWostGrbVHD2+jnscXxhcx8DeiM5dTsi1o+trcXzxZxQ0x8TH9PvinmdxO5DE4rj79XmENyauk6w9cag+XhiE0S7Mrn7FzSGpBtubjc7j650OUS+N1uyGHrl4iZ0/UjGmhXMGHcfXf4yewKT/5JzXSmzO279rO4vR3e6erAfNr4Yv/eRfZpdjNO+9peeny8Ox3W5/Paz359f+4K4T2xo1atSoUaNGjRql8K/MCG/F6FhZNuzfAFtIjrk/68+BEfz6S4Ht6Jj+RiJeKQxm/Wk2qxuIqNh4muUkD9BabW+ah+ZbGfh/E5aykXAB9vKs5sm0P9Nn/Ml0OkJ3CCdCoyVjoQeRMZqKNDq2C0MWTEtRYl07v2iswb3x/6scrocsxK2Swp/Umhr/lWSUJ9R2XirRbK286ka1fiQXSEUUiSV2Gz8RW6/F30Yk41uUs5Lq0FS7FrRwspTqRr4PBiPbtIq4FWv/av/Bt+PtJcOuZCgaOIQMRYvFIq6xODUkGYpsoWex4Y9LaZK/UFDaIcrJjibY3jWeQj5ZCP3SGYrXDBm2Mjr8d/Pkiglvf5diyLPkmbq22vIPdSrQJGPI/9jmn8XEXD21MfnmK18GQ/7KIUPWiT6a5i6zH6VimCFbSRadtquetRI3SE2GXDfCjs+hwBTmXV+zzBmyDnohGB6vzm7cNMpJ9jK1xQxzBo3kmVeXZsJiQl8AhudqOiLP8Vo9vynLrsmQCaaHGDJyP6ziRF7jjfertEEyZEoKdk0+sxNWWML+wGDYXQSevGJBnoy4ngCGrQs3j4Bhyr+Qan2Gd8x11nqToeZ2tK+nXGX3iuFlOBwyk1fNloR5bvB7JsNul7cOMDzwhMKkme/i2eSGkWaYNnT8iK88yNtqlvS7qo1Pk/6TdIotg+GYZ3/x3N78ywPZ406Za2ekFspXkwzN2u4b0T/78pU2dVQYL5/wVLY+YMj+97A2GLIL6/1+31Fm4Wy0DDFkfTRLxWdjQyb99vUGa9lB+c+vDmfAnlzFtov9SWZHvAl1MhmqLV/59/U3ztozU+otb5d1JmaRvhQDcfGLfdM4xaelWRr2LirYd8GUaJsxfIMMlXPOvm/uWZIjOC2DhF0XOXmp7ICM81H7xLhBX/cWq0omlRPVQj6iSBBDWWYs+z6rEDAZXcFb3uN1UL/3a459Ivf3P80nyYuSHX9CezZJPvgTmO3+aLE7JIJ6fvt27JoYAmLwIoa/l0bGcK0Ybg2GTPXke2YmZw+2oTXMDXwikNE3Plk3M7e+4Y8yGFaxHV8b+fNOII04+3SUvYKsmkei6eRVukNQ4Yl9nKflqwzSfIZ15kqg7vbGpbzI9v8+NauZXDQm5+OKmTdhIJIlL4A8Pj6qUdnltMyf+3K4qD+nneWkMXvJkU7y+30vP/IftX6Gn1eX+cKuJ+1OlnhyeXy96kK7Lf386PIYVsO7Ro0aNWrUqFGjRo0a0fEfZuLSw6EDsc0AAAAASUVORK5CYII=" alt="diabetico">
                </figure>
                <form:form action="setear-diabetico" method="POST">
                    <div class="row">
                        <button class="noselect" Type="Submit"/>Diabetico</button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>
