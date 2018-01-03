package br.com.pcs3643.servlets;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pcs3643.config.Parameters;
import br.com.pcs3643.dao.ClientDAO2;
import br.com.pcs3643.dao.VendedorDAO;
import br.com.pcs3643.models.Cliente;
import br.com.pcs3643.models.Vendedor;

/**
 * Servlet implementation class VendedorServlet
 */
@WebServlet("/vendedores")
public class VendedorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String index = "/app/views/vendedores/index.jsp";
	private final String form = "/app/views/vendedores/form.jsp";
	private final String list = "/app/views/vendedores/list.jsp";
	private final String show = "/app/views/vendedores/show.jsp";
	
	private int id;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendedorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action") == null ? "" : ((String) request.getParameter("action"));
		action = action.isEmpty() && request.getAttribute("action") != null ? (String) request.getAttribute("action") : action;
		String page = "/app/views/index.jsp";
		
		id = request.getParameter("id") == null ? 0 : Integer.parseInt(request.getParameter("id")); 
		
		try {
			VendedorDAO vendedorDAO = new VendedorDAO();
			
			switch (action) {
			case Parameters.CRUD_OPERATIONS.CREATE:
				Vendedor vendedor = new Vendedor();
				
				request.setAttribute("vendedor", vendedor);
				
				page = form;
				break;
			case Parameters.CRUD_OPERATIONS.ALL:
				List<Vendedor> vendedores = vendedorDAO.getAll();
				
				request.setAttribute("vendedores", vendedores);
				
				page = list;
				
				break;
			case Parameters.CRUD_OPERATIONS.READ:
//				vendedor = vendedorDAO.read(id);
//				request.setAttribute("vendedor", vendedor);
				
				page = show;
				
				break;
				
			default:
				break;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(page);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String senhaConfirmacao = request.getParameter("senha_confirmacao");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNome(nome);
		vendedor.setEmail(email);
		vendedor.setEndereco(endereco);
		vendedor.setTelefone(telefone);
		vendedor.setLogin(login);
		vendedor.setSenha(senha);
		vendedor.setSenhaConfirmacao(senhaConfirmacao);
		
		request.setAttribute("vendedor", vendedor);
		
		try {
			VendedorDAO vendedorDAO = new VendedorDAO();
			vendedorDAO.create(vendedor);
			
			request.setAttribute("action", Parameters.CRUD_OPERATIONS.ALL);
			doGet(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(form);
			requestDispatcher.forward(request, response);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
