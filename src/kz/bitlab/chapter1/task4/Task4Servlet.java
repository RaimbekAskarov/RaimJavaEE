package kz.bitlab.chapter1.task4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/task4")
public class Task4Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" " +
            "rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" "
                + "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<form action = '/task4' method = 'post'> ");
        out.print("<table  cellpadding = '5px'>");
        out.print("<tbody>");
        out.print("<tr><td> NAME : </td><td><input type='text' name='user_name'></td></tr>");
        out.print("<tr><td> SURNAME : </td><td><input type='text' name='user_surname'></td></tr>");
        out.print("<tr><th>FOOD : </th><th><select name = 'food'><option>Burger - 2000 KZT</option>");
        out.print("<option>Pizza - 3000 KZT</option>");
        out.print("<option>Doner - 1200 KZT</option>");
        out.print("</select></th></tr>");
        out.print("<tr><td><button>ORDER</button></td></tr>");
        out.print("</tbody>");
        out.print("</table>");
        out.print("</form>");

        out.print("</body>");
        out.print("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        String food = request.getParameter("food");
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.print("<h1>"+name+" "+surname+" ordered "+food+"</h1>");
    }
}
