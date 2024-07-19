import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;

public class EditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && action.equals("edit")) {
            // Handle edit action
            int employeeId = Integer.parseInt(request.getParameter("id"));

            // Fetch employee data by ID from DAO
            EmployeeDao employeeDao = new EmployeeDao();
            Employee employee = employeeDao.getEmployeeById(employeeId);

            // Forward employee data to edit form
            request.setAttribute("employee", employee);
            request.getRequestDispatcher("/editEmployee.jsp").forward(request, response);
        } else if (action != null && action.equals("save")) {
            // Handle save action
            String updatedName = request.getParameter("txtName");
            String updatedPassword = request.getParameter("txtPassword");
            String updatedEmail = request.getParameter("txtEmail");
            String updatedCountry = request.getParameter("country");
            int employeeId = Integer.parseInt(request.getParameter("id"));

            // Create an updated Employee object
            Employee updatedEmployee = new Employee();
            updatedEmployee.setId(employeeId);
            updatedEmployee.setName(updatedName);
            updatedEmployee.setPassword(updatedPassword);
            updatedEmployee.setEmail(updatedEmail);
            updatedEmployee.setCountry(updatedCountry);

            // Update employee in database via DAO
            EmployeeDao employeeDao = new EmployeeDao();
            int updateCount = employeeDao.updateEmployee(updatedEmployee);

            if (updateCount > 0) {
                // Employee updated successfully, redirect to ViewServlet
                response.sendRedirect(request.getContextPath() + "/ViewServlet");
            } else {
                // Handle update failure
                response.getWriter().println("Failed to update employee");
            }
        } else if (action != null && action.equals("delete")) {
            // Handle delete action
            int employeeId = Integer.parseInt(request.getParameter("id"));

            // Delete employee from database via DAO
            EmployeeDao employeeDao = new EmployeeDao();
            int deleteCount = employeeDao.deleteEmployee(employeeId);

            if (deleteCount > 0) {
                // Employee deleted successfully, redirect to ViewServlet
                response.sendRedirect(request.getContextPath() + "/ViewServlet");
            } else {
                // Handle delete failure
                response.getWriter().println("Failed to delete employee");
            }
        }
    }
}
