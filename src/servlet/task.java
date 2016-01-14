package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Маргарита on 23.12.2015.
 */
@WebServlet(name = "task")
public class task extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double a = Double.valueOf(request.getParameter("a"));
        double b = Double.valueOf(request.getParameter("b"));
        double c = Double.valueOf(request.getParameter("c"));

        //int []digArray = convertStrToInt(digits.split("[,]"));

        if((b*b-4*a*c)>=0){
            double X1=rasX1(a, b,c);
            double X2=rasX2(a, b, c);
            request.setAttribute("index", String.valueOf(X1));
            request.setAttribute("index1", String.valueOf(X2));}
        else if((b*b-4*a*c)<0){
            request.setAttribute("index", "D<0");
            request.setAttribute("index1", "D<0");}

        request.setAttribute("a", String.valueOf(a));
        request.setAttribute("b", String.valueOf(b));
        request.setAttribute("c", String.valueOf(c));

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    private double rasX1(double a, double b,   double c){
        double result;
        result=(-b+Math.sqrt(b*b-4*a*c))/(2*a);

        return result;
    }

    private double rasX2(double a, double b,   double c){
        double result;
        result=(-b-Math.sqrt(b*b-4*a*c))/(2*a);

        return result;
    }

}
