<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.pcs3643.config.Parameters, br.com.pcs3643.models.Cliente, java.util.List" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clientes cadastrados</title>

<% List<Cliente> clientes = (List<Cliente>) request.getAttribute("clientes"); %>
</head>
<body>

<h1>Clientes cadastrados</h1>

<table>
	<tr>
		<th>#</th>
		<th>Nome</th>
	</tr>
	<tbody>
		<% for (Cliente cliente : clientes) { %>
			<tr>
				<td></td>
				<td><%= cliente.getNome() %></td>
			</tr>
		<% } %>
	</tbody>
</table>

</body>
</html>