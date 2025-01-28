<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP Tags</h1>
	<!-- Declaration Tag -->
	
	<%! int a=10;
		String name="Dinga";
		
		public String welcome(){
			return "Welcome to JSP Page";
		}
	%>
	
	<!-- Expression Tag -->
	<h2>a : <%=a %></h2>
	
	<h2>Name : <%=name %></h2>
	
	<%=welcome()%>
	
	<!-- Scriptlet Tag -->
	<%
	   int b=10;
	
		String userName = request.getParameter("userName");
		
		String userEmail = request.getParameter("userEmail");
	%>
	
	<h2>The Form Data Is</h2>
	 <h3>UserName : <%=userName %></h3>
	 <h3>UserEmail : <%=userEmail %></h3>
</body>
</html>