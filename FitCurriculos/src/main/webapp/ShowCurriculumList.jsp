<%@page import="fitCurriculoModels.Curriculo"%>
<%@ page import ="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="atext/html; charset=ISO-8859-1">
		<title>FITCurriculos</title>
	</head>
	<body>
			<%
				List<Curriculo> lista = 
					(List<Curriculo>) request.getAttribute("ListaCurriculos");
			
				for(Curriculo cur : lista)	
					out.println( cur.getDonoCurriculo() + "<br/>");
			%>
	</body>
</html>