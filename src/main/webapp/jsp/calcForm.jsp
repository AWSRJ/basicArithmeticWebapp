<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<h1>Enter numbers</h1>
<form action="<%=request.getContextPath()%>/AdditionServlet">
                        <table style="with: 50%">
                                <tr>
                                        <td>No. 1</td>
                                        <td><input type="text" name="no1" /></td>
                                </tr>
                                <tr>
                                        <td>No. 2</td>
                                        <td><input type="text" name="no2" /></td>
                                </tr></table>
                        <input type="submit" value="Add" /></form>
</body>
</html>
