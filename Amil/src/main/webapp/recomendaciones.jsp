<%-- 
    Document   : recomendaciones
    Created on : 29/05/2015, 08:39:45 PM
    Author     : T-107
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Nuestras recomendaciones</title>
    </head>
    <body>
        <h1>Nosotros te recomendamos...</h1>
        <table>
            <c:forEach items = "${bebidas}" var = "bebida">
                <tr>
                    <td> ${bebida.tipo}</td>
                    <td> ${bebida.nombre}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
