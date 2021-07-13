package com.example.pruebaWeb3;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Alumnas</h1>");
        for (int contador = 1; contador<11; contador++) {
            out.println("<i>"+contador+")"+ AlumnaDAO.getAlumnas()+ "</i><br/>");
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}