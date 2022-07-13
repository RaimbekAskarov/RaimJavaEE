package kz.bitlab.chapter1.task7.servlets;

import kz.bitlab.chapter1.task7.db.DBManager;
import kz.bitlab.chapter1.task7.model.Footballer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/task7")
public class Task7Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList <Footballer> footballers = DBManager.getAllFootballers();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" " +
                "rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" "
                + "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<form action = '/addfootballer' method = 'post'> ");
        out.print("<table cellpadding = '10px'>");
        out.print("<tbody>");
        out.print("<tr><td>NAME : </td><td><input type = 'text' placeholder = 'Insert name' name = 'name'></td></tr>");
        out.print("<tr><td>SURNAME : </tx><td><input type = 'text' placeholder='Insert surname' name ='surname'>" +
                "</td></tr>");
        out.print("<tr><td>CLUB : </td><td><input type = 'text' placeholder = 'Insert club' name = 'club'></td></tr>");
        out.print("<tr><td>SALARY : </td><td><input type = 'text' placeholder = 'Insert salary' name = 'salary'>" +
                "</td></tr>");
        out.print("<tr><td>TRANSFER PRICE : </td><td><input type = 'text' placeholder = 'Insert transfer price' " +
                "name = 'price'></td></tr>");
        out.print("<tr><td><button>Add footballer</button></td></tr>");
        out.print("</tbody>");
        out.print("</table>");
        out.print("</form>");

        for (Footballer f : footballers){
            out.print("<h2>"+f.getName()+" "+f.getSurname()+"</h2>");
            out.print("<p >"+"Club: "+f.getClub()+"</p>");
            out.print("<p>"+"Salary: "+f.getSalary()+" EUR"+"</p>");
            out.print("<p>"+"Transfer price: "+f.getTransferPrice()+" EUR"+"</p>");
        }

        out.print("</body>");
        out.print("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }
}
