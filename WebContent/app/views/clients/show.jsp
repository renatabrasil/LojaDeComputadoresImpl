<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="br.com.pcs3643.config.Parameters, br.com.pcs3643.models.Cliente, java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loja de Computadores</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">

</head>
<body>

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="#">Loja de Computadores</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Sobre</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Serviços</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Contato</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<div class="container">

		<div class="row">

			<div class="col-lg-10">
				<br/><br/><br/><br/>
				<h1>Detalhes do cliente</h1>
				
				<c:if test="${mensagens != null && not empty mensagens }">
					<div class="alert alert-info alert-dismissible" role="alert">
						<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						<ul>
							<c:forEach var="mensagem" items="${mensagens}">
							    <li>${mensagem.value} </li>
							</c:forEach>
						</ul>
					</div>
				</c:if>
				
				<div class="card card-outline-secondary my-4">
            <div class="card-header">
              Informações
            </div>
            <div class="card-body">
              <p><strong>Nome:</strong> ${cliente.nome }</p>
              <p><strong>CPF:</strong> ${cliente.CPF }</p>
              <p><strong>E-mail:</strong> ${cliente.email }</p>
              <p><strong>Endereço:</strong> ${cliente.endereco }</p>
              <p><strong>Telefone:</strong> ${cliente.telefone }</p>
              <hr>
              <a href="#" class="btn">Voltar</a>
            </div>
          </div>

			</div>

		</div>
	</div>



</body>
</html>