<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Information</title>
</head>
<body>

<table border="1">
  <tr bgcolor="gray">
    <th>Employee_ID</th>
    <th>Employee_Name</th>
    <th>DOB</th>
  </tr>

<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AJAX", "root", "spectratec@22");
    Statement stmt = con.createStatement();
    int employee_id = Integer.parseInt(request.getParameter("empid"));
    
    ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE WHERE EMPID=" + employee_id);

    if (!rs.next()) {
        out.println("<tr><td colspan='3'>No data found</td></tr>");
    } else {
        do {
            out.println("<tr><td>");
            out.println(rs.getInt("EMPID") + "</td><td>" + rs.getString("EMPNAME") + "</td><td>" + rs.getString("DOB") + "</td></tr>");
        } while (rs.next());
    }
    con.close();
} catch (Exception e) {
    out.println("Error: " + e.getMessage());
}
%>

</table>

</body>
</html>
