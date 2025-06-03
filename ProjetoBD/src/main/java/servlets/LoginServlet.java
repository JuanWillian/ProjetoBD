package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CargoDao;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
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
