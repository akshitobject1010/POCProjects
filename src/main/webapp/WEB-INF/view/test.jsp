<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<body>
<table style="width:100%">
  <tr>
    <th>Message</th>
    <th>Id</th> 
    <th>UserName</th>
    <th>Date</th>
  </tr>
  <tr>
    <th>${add.message}</th>
    <th>${add.id}</th>
    <th>${add.username}</th>
    <th>${add.date}</th>
  </tr>
</table>


<h2>i am in view File JSP</h2>
</body>
</html>