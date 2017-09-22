<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.pcs3643.config.Parameters; br.com.pcs3643.models.Cliente" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar cliente</title>

<% Cliente cliente = new Cliente(); %>
<%= cliente = (Cliente) request.getAttribute("client") %>

</head>
<body>
	
	<h1>Cadastrar cliente</h1>
	<form action="/clients" method="post">
		
		<div>Nome <input type="text" name="nome" value="<%= cliente.getNome() %>"></div>
		<div>CPF: <input type="text" name="cpf"></div>
		<div>Endereço: <input type="text" name="endereco"></div>
		<div>E-mail: <input type="text" name="email"></div>
		<div>Telefone: <input type="text" name="telefone"></div>
		
		<button value="Cadastrar" type="submit">Cadastrar</button>
	</form>

</body>
</html>