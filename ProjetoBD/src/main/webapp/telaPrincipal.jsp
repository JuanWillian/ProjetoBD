<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Pagina Principal - Gestor</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
</head>
<body class="d-flex justify-content-center">
	<main>
		<!-- Pesquisem as classes do bootstrap, facilita na estilização pra não ter que usar muito css -->
		<!-- estilizem mais isso, não sou mt bom fznd front end e design de tela -->
	<div class="container p-5">
		<form>
			<div class="table-wrapper">
				<div class="table-title">
					<header>
						<div class="row ">
							<div class="col-sm-6">
								<h2 class="text-light">
									Gerenciar <b>Solicitações </b>
								</h2>
							</div>

						</div>
					</header>
				</div>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							
							<th>Nome</th>
							<th>Email</th>
							<th>Sala</th>
							<th>Matricula</th>
							<th>Ações</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><span class="custom-checkbox"> <input
									type="checkbox" id="checkbox" value="checkbox1"> <label
									for="checkbox"></label>
							</span></td>
							<td>nome do usuario</td>
							<td>email dele</td>
							<td>sala q quer reservar</td>
							<td>matricula?</td>
							<td>
								<!--  Add botao de aceitar solicitação, um check azul do bootstrap icons fica legal -->
								<a href="#deletarSolicitacao" class="delete" data-toggle="modal"><i
									class="bi bi-trash"></i></a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</form>
	</div>
		<!-- Modal de deletar-->
		<div id="deletarSolicitacao" class="modal fade">
			<div class="modal-dialog">
				<div class="modal-content">
					<form>
						<div class="modal-header">
							<h4 class="modal-title">Recusar solicitação</h4>
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
						</div>
						<div class="modal-body">
							<p>Certeza que quer deletar?</p>
							<p class="text-warning">
								<small>Essa ação não pode ser desfeita.</small>
							</p>
						</div>
						<div class="modal-footer">
							<input type="button" class="btn btn-default" data-dismiss="modal"
								value="Cancelar"> <input type="submit"
								class="btn btn-danger" value="Deletar">
						</div>
					</form>
				</div>
			</div>
		</div>
	</main>
</body>
</html>