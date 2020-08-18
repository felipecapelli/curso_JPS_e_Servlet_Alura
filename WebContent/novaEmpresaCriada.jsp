<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<!-- NÃO VAI MAIS USAR ESSE JSP PQ AGORA DEPOIS QUE CADASTRA VAI DIRETO PARA O LISTAEMPRESAS.JSP (DEIXEI DE EXEMPLO) -->
	<c:if test="${ not empty empresa }">	
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
	<c:if test="${ empty empresa }">	
		Nenhuma empresa cadastrada
	</c:if>
</body>
</html>