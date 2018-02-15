package br.com.pcs3643.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pcs3643.config.Parameters;
import br.com.pcs3643.dao.ClientDAO;
import br.com.pcs3643.models.Cliente;

/**
 * Servlet implementation class ClientServlet
 */
//@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final static String FORM = "/app/views/clients/form.jsp";
	private final static String LIST = "/app/views/clients/list.jsp";
	private final static String SHOW = "/app/views/clients/show.jsp";
	private final static String MAIN_PARAMETER = "action";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter(MAIN_PARAMETER) == null ? "" : ((String) request.getParameter(MAIN_PARAMETER));
		action = action.isEmpty() && request.getAttribute(MAIN_PARAMETER) != null ? (String) request.getAttribute(MAIN_PARAMETER) : action;
		String page = "/app/views/index.jsp";
		
		int id = request.getParameter("id") == null ? 0 : Integer.parseInt(request.getParameter("id")); 
		
		try {
			ClientDAO clienteDAO = new ClientDAO();
			
			switch (action) {
			case Parameters.CRUD_OPERATIONS.CREATE:
				Cliente cliente = new Cliente();
				
				request.setAttribute("cliente", cliente);
				
				page = FORM;
				break;
			case Parameters.CRUD_OPERATIONS.ALL:
				List<Cliente> clientes = clienteDAO.getAll();
				
				request.setAttribute("clientes", clientes);
				
				page = LIST;
				
				break;
			case Parameters.CRUD_OPERATIONS.READ:
				cliente = clienteDAO.read(id);
				request.setAttribute("cliente", cliente);
				
				page = SHOW;
				
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
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCPF(cpf);
		cliente.setEmail(email);
		cliente.setEndereco(endereco);
		cliente.setTelefone(telefone);
		
		Map<String, String> messages = validate(cliente);
		
		request.setAttribute("mensagens", messages);
		request.setAttribute("client", cliente);
		if (messages.isEmpty())
		{
			try {
				ClientDAO clienteDAO = new ClientDAO();
				clienteDAO.create(cliente);
				
				messages.put(HttpServletResponse.SC_OK+"", Parameters.VALIDATION_MESSAGES.SUCCESS);
				
				request.setAttribute(MAIN_PARAMETER, Parameters.CRUD_OPERATIONS.ALL);
				doGet(request, response);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(FORM);
				requestDispatcher.forward(request, response);
			}
		} 
		else
		{
			RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(FORM);
			requestDispatcher.forward(request, response);
		}
		
		
		
	}
	
	protected Map<String, String> validate(Cliente cliente)
	{
		Map<String, String> messages = new HashMap<>();
		
		if (cliente.getCPF().trim().isEmpty())
			messages.put("CPF", Parameters.VALIDATION_MESSAGES.BLANK_FIELD);
		if (cliente.getEmail().trim().isEmpty())
			messages.put("E-mail", Parameters.VALIDATION_MESSAGES.BLANK_FIELD);
		if (cliente.getEndereco().trim().isEmpty())
			messages.put("Endereço", Parameters.VALIDATION_MESSAGES.BLANK_FIELD);
		if (cliente.getNome().trim().isEmpty())
			messages.put("Nome", Parameters.VALIDATION_MESSAGES.BLANK_FIELD);
		if (cliente.getTelefone().trim().isEmpty())
			messages.put("Telefone", Parameters.VALIDATION_MESSAGES.BLANK_FIELD);
		
		return messages;
	}

}
