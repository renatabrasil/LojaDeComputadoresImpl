<body>
	
	<br/><br/><br/>


	<h2>Contato do usuário</h2>
	<p>CPF: <strong>${param.cpf }</strong></p>
	<form action="${pageContext.request.contextPath}/ServletExemplo"
		method="post">
		Telefone: <input type="text" name="telefone" /> <input type="submit" value="ensada" />
	</form>

</body>
</html>