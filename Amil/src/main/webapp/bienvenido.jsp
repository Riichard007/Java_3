<%-- 
    Document   : bienvenido
    Created on : 26/05/2015, 08:56:12 PM
    Author     : T-107
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Elite-Technologies</title>
    </head>
    <body>
        <h1>Bienvenido a la página de administración!</h1>
        <h2>Guardar usuario</h2>
        <form action="guardar-usuario" method="post">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nombre"></td>
                </tr>
                <tr>
                    <td>e-mail</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td>Login</td>
                    <td><input type="text" name="login"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Guardar usuario"></td>
                </tr>
            </table>
        </form>        
    </body>
</html>
