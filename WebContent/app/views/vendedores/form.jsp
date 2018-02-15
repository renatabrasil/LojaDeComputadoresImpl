<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="br.com.pcs3643.config.Parameters, br.com.pcs3643.models.Vendedor, java.util.HashMap, java.util.List, java.util.Map"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar vendedor</title>

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
			
			<div class="col-lg-8">
				<br/><br/><br/><br/>
				
				<h1>Cadastrar vendedor</h1>
	
				<p>Sistema > Cadastrar Vendedor</p>
				
				<c:if test="${mensagens != null && not empty mensagens }">
					<div class="alert alert-info alert-dismissible" role="alert">
						<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						<h5>Erro(s) encontrado(s):</h5>
						<ul>
							<c:forEach var="mensagem" items="${mensagens}">
							    <li>${mensagem.key} : ${mensagem.value} </li>
							</c:forEach>
						</ul>
					</div>
				</c:if>
	
				<h4>
					<a
						href="${pageContext.request.contextPath}/vendedores?action=<%= Parameters.CRUD_OPERATIONS.ALL %>">Listar
						Vendedores</a>
				</h4>
	
				<form action="${pageContext.request.contextPath}/vendedores" method="post">
					<div>
						Nome <input type="text" name="nome"
							value="${vendedor.nome }">
					</div>
					<div>
						Endereço: <input type="text" name="endereco" value="${vendedor.endereco}">
					</div>
					<div>
						E-mail: <input type="text" name="email" value="${vendedor.email}">
					</div>
					<div>
						Telefone: <input type="text" name="telefone" value="${vendedor.telefone}">
					</div>
					<hr/>
					<div>
						login: <input type="text" name="login" value="${vendedor.login}">
					</div>
					<div>
						Senha: <input type="password" name="senha" value="${vendedor.senha}">
					</div>
					<div>
						Repetir senha: <input type="password" name="senha_confirmacao" value="${vendedor.senhaConfirmacao}">
					</div>
	
					<button value="Cadastrar" type="submit" class="btn btn-primary">Cadastrar</button>
				</form>
			
			</div>
			
			
		</div>
	</div>



	<script
  src="https://code.jquery.com/jquery-3.2.1.min.js"
  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
  crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
		integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
		crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
		integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
		crossorigin="anonymous"></script>

</body>
</html>