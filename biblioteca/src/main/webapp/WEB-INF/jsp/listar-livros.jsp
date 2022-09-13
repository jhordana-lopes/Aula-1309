<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Lista de Livros</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ISBN</th>
				<th>Nome</th>
				<th>Autor</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${livros}" var="livro">
				<tr>
					<td>${livro.isbn}</td>
					<td>${livro.nome}</td>
					<td>${livro.autor}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>