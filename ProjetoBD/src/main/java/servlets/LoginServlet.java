package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CargoDao;
import dao.CriarSolicitacaoDao;


@WebServlet(urlPatterns = {"/LoginServlet", "/SolicitanteServlet"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	String email = "www";
	String password = "www";
	
    public LoginServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPostLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getServletPath();
		
		if(acao.equals("/LoginServlet")) {
			 email = request.getParameter("email");
			 password = request.getParameter("password");
			
			CargoDao dao = new CargoDao();
			String cargo = dao.verificaCargo(email, password);
			
				if(cargo.equals("GESTOR")) {
					RequestDispatcher redirecionar = request.getRequestDispatcher("telaPrincipal.jsp");
					redirecionar.forward(request, response);
				}else if(cargo.equals("SOLICITANTE")) {
					//Redireciona para a tela de usuario
				}else {
					RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
					redirecionar.forward(request, response);
				}
		}
	}
	
	protected void doPostSolicitante(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException, SQLException {
		
		String acao = request.getServletPath();
		
		if(acao.equals("/SolicitanteServlet")) {
			
			String dataReserva = request.getParameter("");
			String horarioInicio = request.getParameter("");
			String horarioFim = request.getParameter("");
			String nomeEspaco = request.getParameter("");
			
			CriarSolicitacaoDao dao = new CriarSolicitacaoDao();
			dao.cadastrarSolicitacao(email, password, dataReserva, horarioInicio, horarioFim, nomeEspaco);
			dao.cadastraAuditoria(email, password);
		}
	}

	
}
