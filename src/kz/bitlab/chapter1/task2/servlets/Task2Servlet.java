package kz.bitlab.chapter1.task2.servlets;

import kz.bitlab.chapter1.task2.db.DBManager;
import kz.bitlab.chapter1.task2.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/task2")
public class Task2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        ArrayList<User> allUsers = DBManager.getAllUsers();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<table cellpadding = '10px'>");
        out.print("<thead>");
        out.print("<tr><th>NAME</th><th>SURNAME</th><th>DEPARTMENT</th><th>SALARY</th></tr>");
        out.print("</thead>");
        out.print("<tbody>");
        for (User a : allUsers){
            out.print("<tr>");
            out.print("<td>"+a.getName()+"</td>");
            out.print("<td>"+a.getSurname()+"</td>");
            out.print("<td>"+a.getDepartment()+"</td>");
            out.print("<td>"+a.getSalary()+"</td>");
            out.print("</tr>");
        }
        out.print("</tbody>");
        out.print("</table>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

    }
}
