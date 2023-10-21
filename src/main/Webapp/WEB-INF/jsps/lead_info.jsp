<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Details</title>
</head>
<body>
<h2>Lead Details</h2>
  <pre>
    FirstName:${lead.firstName}<br/>
     LastName:${lead.lastName}<br/>
      Email:${lead.email}<br/>
       Mobile Number:${lead.mobile}<br/>
        Source:${lead.source}<br/>
  </pre>
  
  <form action="sendEmail" method="post">
  <input type="hidden" name="email" value="${lead.email}"/>
  <input type="submit" value="send email"/>
  </form>
  <form action="convertLead" method="post">
  <input type="hidden" name="id" value="${lead.id}"/>
  <input type="submit" value="convert"/>
  </form>

</body>
</html>