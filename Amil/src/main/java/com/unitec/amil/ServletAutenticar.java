package com.unitec.amil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String ip = request.getRemoteAddr();
        Date fecha = Calendar.getInstance().getTime();
        
        //Buscar aquí el usuario cuyo login y passwowrd se proporcioaron,
        //una vez buscado, verificar su id, supongamos que es 1
        
       Usuario u1 = new Usuario();
       u1.setIdUsuario(1);
              
       //Después de esto, guardar la sesión con la clase Administración
       Administracion a = new Administracion();
       a.setFecha(fecha);
       a.setIdUsuario(u1);
       a.setIp(ip);
       DAOAdministracion daoa = new DAOAdministracion();
        try {
            daoa.guardar(a);
        } catch (Exception ex) {
            
        }
        
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