<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome home</h1>

<form:form method="POST" action="/sendmessage" 
  modelAttribute="helloWorld">
    <form:input path="message" type="text"/>

    <input type="submit" value="Submit" />
</form:form>
<%-- <form action="sendmessage" method="post" modelAttribute="helloWorld">
<input type="text" value="message">
<input type="submit" value="send">
</form> --%>
</body>
</html>