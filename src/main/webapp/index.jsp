<%@ page import="com.example.pruebaWeb3.Alumna" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    Alumna a = new Alumna("juli","back");
%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Alumna: "+ a.getNombre() %>
<h2><%= "Curso: " + a.getCurso()%>
<br/>
<a href="hello-servlet">Listado de alumnas</a>

</body>
</html>