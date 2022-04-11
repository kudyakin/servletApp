package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/saveServlet")
public class SaveServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        String carmark = request.getParameter("carmark");
        String carmodel = request.getParameter("carmodel");
        String enginevolume = request.getParameter("enginevolume");
        String drive = request.getParameter("drive");
        String year = request.getParameter("year");

        Employee employee = new Employee();

        employee.setCarmark(carmark);
        employee.setCarmodel(carmodel);
        employee.setEnginevolume(enginevolume);
        employee.setDrive(drive);
        employee.setYear(year);

        //out.println(employee.toString());
        //out.println(EmployeeRepository.getConnection());

        int status = EmployeeRepository.save(employee);
        //out.println(status);

        if (status > 0) {
            out.print("Record saved successfully!");
        } else {
            out.println("Sorry! unable to save record");
        }
        out.close();
    }
}
