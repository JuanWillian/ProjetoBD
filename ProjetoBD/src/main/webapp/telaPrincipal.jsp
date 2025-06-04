<%@page import="model.SolicitacaoModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Página Principal - Gestor</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.css"
	rel="stylesheet">
<link href="css/gestor.css" rel="stylesheet">
</head>
<body class="bg-secondary">
	<main class="d-flex">
		<div class="container">
			<div class="table-wrapper">
				<div class="table-title mb-4">
					<h2>
						Gerenciar <b>Solicitações</b>
					</h2>
				</div>
				<%
				String mensagem = (String) request.getAttribute("Erro");
				if (mensagem != null) {
				%>
				<div class="alert alert-light" role="alert">Não há nenhuma
					tarefa disponível</div>
				<%
				} else {
					List<SolicitacaoModel> solicitacoes = (List<SolicitacaoModel>) request.getAttribute("lista"); 
					
				%>
				<table class="table table-bordered table-hover align-middle">
					<thead class="table-light">
						<tr>
							<th>#</th>
							<th>Espaço</th>
							<th>Status</th>
							<th>Data</th>
							<th>Horário Início</th>
							<th>Horário Fim</th>
							<th>Ações</th>
						</tr>
					</thead>
					<tbody>
						<%
						for (SolicitacaoModel solicitacao : solicitacoes) {
						%>
						<tr>
							<td><%=solicitacao.getIdSolicitacao()%></td>
							<td><%=solicitacao.getIdEspacoFK()%></td>
							<td><%=solicitacao.getStatus()%></td>
							<td><%=solicitacao.getDataReserva()%></td>
							<td><%=solicitacao.getHorarioInicio()%></td>
							<td><%=solicitacao.getHorarioFim()%></td>
							<td><form method="post" action="aceitarSolicitacao"
									style="display: inline;">
									<input type="hidden" name="idSolicitacao"
										value="<%= solicitacao.getIdSolicitacao() %>" />
									<button type="submit"
										class="btn btn-link text-success btn-icon" title="Aceitar">
										<i class="bi bi-check-circle-fill"></i>
									</button>
								</form>

								<form method="post" action="RecusarSolicitacao"
									style="display: inline;">
									<input type="hidden" name="idSolicitacao"
										value="<%= solicitacao.getIdSolicitacao() %>" />
									<button type="submit" class="btn btn-link text-danger btn-icon"
										title="Excluir"
										onclick="return alert('Tem certeza que deseja excluir esta solicitação?');">
										<i class="bi bi-x-lg"></i>
									</button>
								</form></td>
						</tr>
						<%
						}
						%>
					</tbody>
				</table>


			</div>
		</div>
	</main>

	<!-- Modal de deletar -->
	<div class="modal fade" id="deletarSolicitacao" tabindex="-1"
		aria-labelledby="modalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<form>
					<div class="modal-header">
						<h5 class="modal-title" id="modalLabel">Recusar Solicitação</h5>
						<button type="button" class="btn-close btn-close-white"
							data-bs-dismiss="modal" aria-label="Fechar"></button>
					</div>
					<div class="modal-body">
						<p>Tem certeza que deseja excluir esta solicitação?</p>
						<p class="text-warning">
							<small>Essa ação não poderá ser desfeita.</small>
						</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-bs-dismiss="modal">Cancelar</button>

						<button type="submit" class="btn btn-danger">Excluir</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>