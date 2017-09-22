<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.pcs3643.config.Parameters" %>   
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página Inicial</title>
</head>
<body>
<h1>Loja de Computadores</h1>

<ul>
	<li><a href="<%=request.getContextPath()%>/clients?action=<%= Parameters.CRUD_OPERATIONS.CREATE %>">Cadastrar cliente</a></li>
	<li>Realizar pedido</li>
	<li>Gerar Relatório de vendas</li>
</ul>
</body>
</html>