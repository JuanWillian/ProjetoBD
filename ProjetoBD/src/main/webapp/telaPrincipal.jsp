<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Página Principal - Gestor</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.css" rel="stylesheet">
<style>
    body {
        background-color: #f8f9fa;
    }
    .table-wrapper {
        background: white;
        border-radius: 12px;
        box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        padding: 30px;
    }
    .table-title h2 {
        color: #343a40;
    }
    .btn-icon {
        font-size: 1.2rem;
        margin: 0 5px;
    }
    .modal-header {
        background-color: #dc3545;
        color: white;
    }
</style>
</head>
<body class="bg-secondary">
    <main class="d-flex">
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title mb-4">
                    <h2>Gerenciar <b>Solicitações</b></h2>
                </div>
                <table class="table table-bordered table-hover align-middle">
                    <thead class="table-light">
                        <tr>
                            <th>#</th>
                            <th>Nome</th>
                            <th>Email</th>
                            <th>Sala</th>
                            <th>Matrícula</th>
                            <th>Ações</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><input type="checkbox" class="form-check-input"></td>
                            <td>Nome do Usuário</td>
                            <td>email@exemplo.com</td>
                            <td>101 - Reuniões</td>
                            <td>123456</td>
                            <td>
                                <a href="#" class="text-success btn-icon" title="Aceitar"><i class="bi bi-check-circle-fill"></i></a>
                                <a href="#deletarSolicitacao" data-bs-toggle="modal" class="text-danger btn-icon" title="Excluir"><i class="bi bi-trash-fill"></i></a>
                            </td>
                        </tr>
                   
                    </tbody>
                </table>
            </div>
        </div>
    </main>

    <!-- Modal de deletar -->
    <div class="modal fade" id="deletarSolicitacao" tabindex="-1" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <form>
                    <div class="modal-header">
                        <h5 class="modal-title" id="modalLabel">Recusar Solicitação</h5>
                        <button type="button" class="btn-close btn-close-white" data-bs-dismiss="modal" aria-label="Fechar"></button>
                    </div>
                    <div class="modal-body">
                        <p>Tem certeza que deseja excluir esta solicitação?</p>
                        <p class="text-warning"><small>Essa ação não poderá ser desfeita.</small></p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                        <button type="submit" class="btn btn-danger">Excluir</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
