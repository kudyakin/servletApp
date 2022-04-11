package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/putServlet")
public class PutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);

        String carmark = request.getParameter("carmark");
        String carmodel = request.getParameter("carmodel");
        String enginevolume = request.getParameter("enginevolume");
        String drive = request.getParameter("drive");
        String year = request.getParameter("year");

        Employee employee = new Employee();
        employee.setId(id);
        employee.setCarmark(carmark);
        employee.setCarmodel(carmodel);
        employee.setEnginevolume(enginevolume);
        employee.setDrive(drive);
        employee.setYear(year);

//        employee.setCountry(request.getParameter("country"));

        int status = EmployeeRepository.update(employee);

        if (status > 0) {
            response.sendRedirect("viewServlet");
        } else {
            out.println("Sorry! unable to update record");
        }
        out.close();
    }
}
