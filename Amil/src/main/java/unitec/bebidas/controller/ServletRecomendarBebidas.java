/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.bebidas.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import unitec.bebidas.model.Bebida;
import unitec.bebidas.model.ModeloBebidas;

/**
 *
 * @author T-107
 */
public class ServletRecomendarBebidas extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String tipo = request.getParameter("Bebida");
        ModeloBebidas bebidas = new ModeloBebidas();
        ArrayList<Bebida> recomendar = bebidas.recomendacion(tipo);
        System.out.println("Bebidas habidas:" + recomendar.size());
        request.setAttribute("bebidas", recomendar);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/recomendaciones.jsp");
        dispatcher.forward(request, response);
    }
}