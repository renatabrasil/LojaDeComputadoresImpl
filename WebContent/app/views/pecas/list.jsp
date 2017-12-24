<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="br.com.pcs3643.config.Parameters, br.com.pcs3643.models.Peca, java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Peças cadastrados</title>

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

			<div class="col-lg-11">
				<br/><br/><br/><br/>
				<h1>Peças cadastradas</h1>
				
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
				
				<a class="btn btn-primary" href="${pageContext.request.contextPath}/pecas?action=<%=Parameters.CRUD_OPERATIONS.CREATE%>">Cadastrar cliente</a>
				<table class="table">
					<tr>
						<th>#</th>
						<th style="text-align: center;">Tipo</th>
						<th>Nome</th>
						<th>Descrição</th>
						<th style="text-align: right;">Preço</th>
						<th></th>
					</tr>
					<tbody>
						<c:forEach var="peca" items="${pecas}" varStatus="id">
							<tr>
								<td>${id.count}</td>
								<td style="text-align: center;">${peca.tipoPeca}</td>
								<td>${peca.nome}</td>
								<td>${peca.descricao}</td>
								<td style="text-align: right;">${peca.preco}</td>
								<td style="text-align: center;">
									<a href="${pageContext.request.contextPath}/pecas?action=<%=Parameters.CRUD_OPERATIONS.READ%>&id=${peca.id}">Detalhes</a>
									 | Editar | Excluir
								</td>
							</tr>
						</c:forEach>

					</tbody>
				</table>

			</div>

		</div>
	</div>



</body>
</html>