
<!DOCTYPE html>
<%@page import="java.net.URLEncoder"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main</title>
<!------------************** Adicionando Links ------------>
<%@ include file="Links.jsp"%>
<%@ page import="com.jarvis.entity.*,com.jarvis.DAO.*, java.util.*"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!-------------------Criando a sessão do usuario ------------------------->
<%
LOGIN usuario = (LOGIN) session.getAttribute("usuario");
if (usuario == null) {
	String msg = "Usuario ou senha invalidos";
	response.sendRedirect("Login.jsp?msg="+URLEncoder.encode(msg,"UTF-8"));
} else {
	out.print("Bem vindo, + " + usuario.getDT_EMAIL() + " <br/> ");
}
%>

<!-------------------Buscando informação do Exercícios------------------------->

<%
EXERCICIODAO dao = DaoFactory.getEXERCICIODAO();
List<EXERCICIO> exercicios;
exercicios = dao.buscarPorID(usuario.getCD_USUARIO());


%>
</head>

<body>







	<!------------ Adicionando NavBar ------------>

	<nav>
		<%@ include file="NavBar.jsp"%>
	</nav>


	<!------------ Adicionando Menu Lareal ------------>


	<div class="container-fluid px-0">
		<div class="row">
			<div
				class="col-md-2 align-self-center order-md-2 order-1 mb-md-0 mb-4 Esp-10px">

				<div class="container-fluid px-4 backgroundColor ">
					<form action="main.jsp" method="post">
						<div class="mb-3">
							<h3 class="text-center">Cadastrar atividade</h3>
							<label for="exampleInputEmail1" class="form-label">Data </label>
							<input type="text" name="data" class="form-control"
								id="exampleInputEmail1" aria-describedby="dataatividade">
							<div id="dataatividade" class="form-text">.</div>
						</div>
						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label">Horário</label>
							<input type="text" name="Horário" class="form-control"
								id="exampleInputPassword1">
						</div>
						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label">Intensidade</label>
							<input type="text" name="Horário" class="form-control"
								id="exampleInputPassword1">
						</div>
						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label">Duracao</label>
							<input type="text" name="Horário" class="form-control"
								id="exampleInputPassword1">
						</div>
						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label">Calorias</label>
							<input type="text" name="Horário" class="form-control"
								id="exampleInputPassword1">
						</div>
						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label">Observação</label>
							<input type="text" name="Horário" class="form-control"
								id="exampleInputPassword1">
						</div>
						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label">Tipo de Exercício</label>
							<input type="text" name="Horário" class="form-control"
								id="exampleInputPassword1">
						</div>
						<div class="Esp-10px">

							<button type="submit" class="btn btn-primary btn-conf">Cadastrar
							</button>

						</div>

					</form>
				</div>
			</div>
				<div
		class="col-md-9 align-self-center order-md-2 order-1 mb-md-0 mb-4 Esp-10px">
		<div class="container-fluid px-4  ">
			<table  class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Codigo</th>
					<th scope="col">DATA</th>
					<th scope="col">HORÁRIO</th>
					<th scope="col">INTENSIDADE </th>
					<th scope="col">DURACAO</th>
					<th scope="col">CALORIAS</th>
					<th scope="col">OBSERVACAO</th>
					
					
					
				</tr>
			</thead>
			<tbody>
			
			<!------------ Adicionando L�gica get da tabela ------------>
			<% 
			for 
			
			(EXERCICIO c : exercicios) {
				
			
			%>
				<tr>
					<th scope="row">1</th>
					<td><%=c.getDT_REGISTRO() %></td>
					<td><%=c.getNM_HORA() %></td>
					<td><%=c.getINTENSIDADE()%></td>
					<td><%=c.getDURACAO() %></td>
					<td><%=c.getCALORIAS() %></td>
					<td><%=c.getOBSERVACAO()%></td>
					
									
					
					
				</tr>

			<% } %>
			</tbody>
			</table>

		</div>





	</div>
		</div>
	</div>
</body>
</html>