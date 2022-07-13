package kz.bitlab.chapter1.task6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/task6")
public class Task6Servlet extends HttpServlet {

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
        out.print("<form action = '/task6' method = 'post'> ");
        out.print("<table  cellpadding = '5px'>");
        out.print("<tbody>");
        out.print("<tr><td> FULLNAME : </td><td><input type='text' name='full_name'></td></tr>");
        out.print("<tr><td> EXAM POINTS : </td><td><input type='number' name='exam_points'></td></tr>");

        out.print("<tr><td><button>Submit</button></td></tr>");
        out.print("</tbody>");
        out.print("</table>");
        out.print("</form>");

        out.print("</body>");
        out.print("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name = request.getParameter("full_name");
        int points = Integer.parseInt(request.getParameter("exam_points"));
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        if (points>90){
            out.print("<h1>"+name+" "+" got A for exam! "+"</h1>");
        }
        else if (points>75){
            out.print("<h1>"+name+" "+" got B for exam! "+"</h1>");
        }
        else if (points>50){
            out.print("<h1>"+name+" "+" got C for exam! "+"</h1>");
        }
        else if (points>25){
            out.print("<h1>"+name+" "+" got D for exam! "+"</h1>");
        }
        else {
            out.print("<h1>"+name+" "+" got E for exam! "+"</h1>");
        }

    }
}
