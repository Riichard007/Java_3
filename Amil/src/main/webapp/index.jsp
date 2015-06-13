<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elite-Technologies</title>
    </head>
    <body>
        <h1>Ingresa tus datos:</h1>
        <!-- 
        Soy un comentario xD  
        Es un scriptlet
        Inicia el formuliario
        -->
        <%-- 
            int edad = 20;
            out.println("Tu edad es: " + edad);
        --%>        
        <form action="autenticar" method="post">
            <br>Login<br>
            <input type="text" name="login">
            <br>Password<br>
            <input type="password" name="password"><br>
            <input type="submit" value="ingresar"><br>
        </form>
    </body>
</html>