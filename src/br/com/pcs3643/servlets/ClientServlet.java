package br.com.pcs3643.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pcs3643.config.Parameters;
import br.com.pcs3643.models.Cliente;

/**
 * Servlet implementation class ClientServlet
 */
//@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String index = "/view/clients/index.jsp";
	private final String form = "/view/clients/form.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(request, response);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action") == null ? "" : ((String) request.getParameter("action"));
		String page = "/views/index.jsp";
		switch (action) {
		case Parameters.CRUD_OPERATIONS.CREATE:
			Cliente cliente = new Cliente();
			
			request.setAttribute("client", cliente);
			
			page = form;
			break;

		default:
			break;
		}
		
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(page);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
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
		
	}

}
