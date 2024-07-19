import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ViewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmployeeDao employeeDao;

    public void init() throws ServletException {
        super.init();
        employeeDao = new EmployeeDao(); // Initialize EmployeeDao on servlet initialization
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && action.equals("delete")) {
            // Handle deletion action
            int employeeId = Integer.parseInt(request.getParameter("id"));
            int deleteCount = employeeDao.deleteEmployee(employeeId);

            if (deleteCount > 0) {
                // Employee deleted successfully, redirect to refresh employee list
                response.sendRedirect(request.getContextPath() + "/ViewServlet");
            } else {
                // Handle delete failure
                response.getWriter().println("Failed to delete employee");
            }
        } else {
            // Fetch all employees and forward to viewEmployees.jsp
            List<Employee> allEmployees = employeeDao.getAllEmployees();
            request.setAttribute("allEmployees", allEmployees);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/viewEmployees.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirect POST requests to doGet method
        doGet(request, response);
    }
}
