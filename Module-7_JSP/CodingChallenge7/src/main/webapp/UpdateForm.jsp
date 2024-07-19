<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
</head>
<body>
    <h1>Update Employee</h1>
    <form action="EditServlet" method="post">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="txtName"></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="txtPassword"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="email" name="txtEmail"></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td>
                    <select name="country">
                        <option value="India">India</option>
                        <option value="Russia">Russia</option>
                        <option value="China">China</option>
                        <option value="UK">UK</option>
                        <option value="USA">USA</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="EDit&save">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
