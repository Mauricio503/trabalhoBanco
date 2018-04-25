package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Conta;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import dao.ContaDAO;
import dao.ContaDAOMongo;

@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		String usuario = request.getParameter("usuario");

		if (nome.equals("") && senha.equals("") && usuario.equals("")) {
			response.getWriter().append("Favor preencher todos os campos!!");
		} else {
			MongoClient mongo = new MongoClient();
			DB db = mongo.getDB("contas");

			ContaDAO contaDAO = new ContaDAOMongo(db);

			Conta conta = new Conta();
			conta.setNome(nome);
			conta.setSenha(senha);
			conta.setUsuario(usuario);

			mongo.close();
		
			
			getServletContext().getRequestDispatcher("/cadastroSucesso.jsp").forward(request, response);
		}

	}

}
