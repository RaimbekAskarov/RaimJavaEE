package kz.bitlab.chapter1.task7.servlets;

import kz.bitlab.chapter1.task7.db.DBManager;
import kz.bitlab.chapter1.task7.model.Footballer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addfootballer")
public class AddFootballerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String club = request.getParameter("club");
        int salary = Integer.parseInt(request.getParameter("salary"));
        int transferPrice = Integer.parseInt(request.getParameter("price"));

        Footballer footballer = new Footballer();
        footballer.setName(name);
        footballer.setSurname(surname);
        footballer.setClub(club);
        footballer.setSalary(salary);
        footballer.setTransferPrice(transferPrice);

        DBManager.addFootballer(footballer);

        response.sendRedirect("/task7");
    }
}