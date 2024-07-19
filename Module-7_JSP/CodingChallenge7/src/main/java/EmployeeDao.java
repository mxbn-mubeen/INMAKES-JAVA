import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    private Connection con;
    private PreparedStatement ps;

    public EmployeeDao() {
        con = DBConnection.getConnection();
    }

    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM EMPLOYEE");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("ID"));
                employee.setName(rs.getString("NAME"));
                employee.setPassword(rs.getString("PASSWORD"));
                employee.setEmail(rs.getString("EMAIL"));
                employee.setCountry(rs.getString("COUNTRY"));

                allEmployees.add(employee);
            }

            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle or log the exception properly
        } finally {
            // Close PreparedStatement here if needed
        }

        return allEmployees;
    }

    public Employee getEmployeeById(int id) {
        Employee employee = null;

        try {
            ps = con.prepareStatement("SELECT * FROM EMPLOYEE WHERE ID = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                employee = new Employee();
                employee.setId(rs.getInt("ID"));
                employee.setName(rs.getString("NAME"));
                employee.setPassword(rs.getString("PASSWORD"));
                employee.setEmail(rs.getString("EMAIL"));
                employee.setCountry(rs.getString("COUNTRY"));
            }

            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle or log the exception properly
        } finally {
            // Close PreparedStatement here if needed
        }

        return employee;
    }

    public int updateEmployee(Employee employee) {
        int count = 0;

        try {
            ps = con.prepareStatement("UPDATE EMPLOYEE SET NAME=?, PASSWORD=?, EMAIL=?, COUNTRY=? WHERE ID=?");
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getPassword());
            ps.setString(3, employee.getEmail());
            ps.setString(4, employee.getCountry());
            ps.setInt(5, employee.getId());

            count = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle or log the exception properly
        } finally {
            // Close PreparedStatement here if needed
        }

        return count;
    }

    public int deleteEmployee(int id) {
        int count = 0;

        try {
            ps = con.prepareStatement("DELETE FROM EMPLOYEE WHERE ID = ?");
            ps.setInt(1, id);

            count = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle or log the exception properly
        } finally {
            // Close PreparedStatement here if needed
        }

        return count;
    }
}
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    private Connection con;
    private PreparedStatement ps;

    public EmployeeDao() {
        con = DBConnection.getConnection();
    }

    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM EMPLOYEE");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("ID"));
                employee.setName(rs.getString("NAME"));
                employee.setPassword(rs.getString("PASSWORD"));
                employee.setEmail(rs.getString("EMAIL"));
                employee.setCountry(rs.getString("COUNTRY"));

                allEmployees.add(employee);
            }

            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle or log the exception properly
        } finally {
            // Close PreparedStatement here if needed
        }

        return allEmployees;
    }

    public Employee getEmployeeById(int id) {
        Employee employee = null;

        try {
            ps = con.prepareStatement("SELECT * FROM EMPLOYEE WHERE ID = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                employee = new Employee();
                employee.setId(rs.getInt("ID"));
                employee.setName(rs.getString("NAME"));
                employee.setPassword(rs.getString("PASSWORD"));
                employee.setEmail(rs.getString("EMAIL"));
                employee.setCountry(rs.getString("COUNTRY"));
            }

            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle or log the exception properly
        } finally {
            // Close PreparedStatement here if needed
        }

        return employee;
    }

    public int updateEmployee(Employee employee) {
        int count = 0;

        try {
            ps = con.prepareStatement("UPDATE EMPLOYEE SET NAME=?, PASSWORD=?, EMAIL=?, COUNTRY=? WHERE ID=?");
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getPassword());
            ps.setString(3, employee.getEmail());
            ps.setString(4, employee.getCountry());
            ps.setInt(5, employee.getId());

            count = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle or log the exception properly
        } finally {
            // Close PreparedStatement here if needed
        }

        return count;
    }

    public int deleteEmployee(int id) {
        int count = 0;

        try {
            ps = con.prepareStatement("DELETE FROM EMPLOYEE WHERE ID = ?");
            ps.setInt(1, id);

            count = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle or log the exception properly
        } finally {
            // Close PreparedStatement here if needed
        }

        return count;
    }
}
