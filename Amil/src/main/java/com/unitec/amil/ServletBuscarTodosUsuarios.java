package com.unitec.amil;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletBuscarTodosUsuarios extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Vamos a crear un objeto que nos servirá para mapear un ArrayList de Java a un objeto JSON
        
        ObjectMapper mapper = new ObjectMapper();
        DAOUsuario daou = new DAOUsuario();
        try {
            List<Usuario> usuarios = daou.buscarTodos();
            out.println(mapper.writeValueAsString(usuarios));
        } catch (Exception ex) {
            
        }
    }
}