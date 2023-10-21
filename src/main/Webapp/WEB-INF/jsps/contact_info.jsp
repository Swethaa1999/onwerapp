<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Lead Details</title>
</head>
<body>
<h2>Contact Lead Details</h2>
  <pre>
    FirstName:${contact.firstName}<br/>
     LastName:${contact.lastName}<br/>
      Email:${contact.email}<br/>
       Mobile Number:${contact.mobile}<br/>
        Source:${contact.source}<br/>
  </pre>
  
  <form action="sendEmail" method="post">
  <input type="hidden" name="email" value="${contact.email}"/>
  <input type="submit" value="send email"/>
  </form>
  <form action="listallcontacts" method="post">
  <input type="hidden" name="id" value="${contact.id}"/>
  <input type="submit" value="convert"/>
  </form>

</body>
</html>