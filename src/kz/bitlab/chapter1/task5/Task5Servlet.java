package kz.bitlab.chapter1.task5;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/task5")
public class Task5Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" " +
            "rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" "
                + "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<form action = '/task5' method = 'post'> ");
        out.print("<table  cellpadding = '5px'>");
        out.print("<tbody>");
        out.print("<tr><th>FULL NAME : </th><th><input type = 'text' placeholder = 'Insert full name'+" +
                " name = 'fullname'></tr>");
        out.print("<tr><th>AGE : </th><th><input type = 'number' placeholder = 'Insert age' name = 'age'></tr>");
        out.print("<tr><th>GENDER : </th><th><input type = 'radio' name = 'gender' value ='Male'>Male  ");
        out.print("<input type = 'radio' name = 'gender' value = 'Female'>Female</th>");

        out.print("<tr><th><button>SEND</button></th></tr>");
        out.print("</tbody>");
        out.print("</table>");
        out.print("</form>");

        out.print("</body>");
        out.print("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fullname = request.getParameter("fullname");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        if (age>=18){
            if (gender.equals("Male"))
                out.print("<h1>"+" Hello Dear Mister "+fullname+"</h1>");
            else
                out.print("<h1>"+" Hello Dear Miss "+fullname+"</h1>");}
        else{
            if (gender.equals("Male"))
                out.print("<h1>"+" Hello Dude Mister "+fullname+"</h1>");
            else
                out.print("<h1>"+" Hello Dude Miss "+fullname+"</h1>");}
    }
}