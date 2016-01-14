package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;


/**
 * Created by Маргарита on 22.12.2015.
 */
public class blabla extends javax.servlet.http.HttpServlet {

    static String currentPath = "index.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        if(!currentPath.equals("index.jsp")){
            currentPath = "index.jsp";
            //request.getRequestDispatcher("/index.jsp").forward(request, response);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(request,response);
        }
        {



        }
    }
}