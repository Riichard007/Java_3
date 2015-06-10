package com.unitec.amil;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAutenticar extends HttpServlet {
    /*
    request - entra la información
    response - sale la información
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        
        //Creamos un model
        Usuario u = new Usuario();
        
        //Ajustamos su login y password
        u.setLogin(login);
        u.setPassword(password);
        
        //Redireccionamos el servlet
        ModeloAutenticar modelo = new ModeloAutenticar();
        
        if(modelo.autenticar(u)){
            RequestDispatcher despachador = request.getRequestDispatcher("/bienvenido.jsp");
            despachador.forward(request, response);
        }else{
            RequestDispatcher despachador = request.getRequestDispatcher("/error.jsp");
            despachador.forward(request, response);
        }
    }
}