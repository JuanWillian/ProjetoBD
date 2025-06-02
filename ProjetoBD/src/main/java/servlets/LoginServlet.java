package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmailDao;
import model.EmailModel;


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
		
		EmailDao dao = new EmailDao();
		List<EmailModel> list = dao.listarTodos();
		
		for (EmailModel emailModel : list) {
			if(emailModel.getEnderecoEmail().equals(email) && emailModel.getSenha().equals(password)) {
				RequestDispatcher redirecionar = request.getRequestDispatcher("telaPrincipal.jsp");
				redirecionar.forward(request, response);
			}
		}
	}

}
