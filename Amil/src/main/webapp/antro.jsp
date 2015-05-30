<%-- 
    Document   : antro
    Created on : 26/05/2015, 09:42:00 PM
    Author     : T-107
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido a nuestra página de recomendaciones!</h1>
        <form action = "recomendar" method = "GET">
            <p>Escoge una bebida:</p>
                <select name = "Bebida">
                    <option>Cerveza</option>
                    <option>Vodka</option>
                    <option>Vino</option>
                    <option>Whisky</option>
                </select><br><br>
                <input type = "submit" value = "Ver recomendaciones">
        </form>                
    </body>
</html>
