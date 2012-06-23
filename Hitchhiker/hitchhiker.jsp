<html>
<body>

Hello, <%= request.getParameter("userName") %>!

<%
  if ((boolean)session.getAttribute("isUserAdmin")) {
%>
  <a href="/admin">Check out the admin area!</a>
<%
  }
%>

</body>
</html>
