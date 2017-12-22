package br.com.pcs3643.servlets;

import java.io.IOException;
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
import br.com.pcs3643.dao.PecaDAO;
import br.com.pcs3643.models.Cliente;
import br.com.pcs3643.models.Peca;

/**
 * Servlet implementation class PecasServlet
 */
@WebServlet("/pecas")
public class PecasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String index = "/app/views/pecas/index.jsp";
	private final String form = "/app/views/pecas/form.jsp";
	private final String list = "/app/views/pecas/list.jsp";
	private final String show = "/app/views/pecas/show.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PecasServlet() {
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
		
		int id = request.getParameter("id") == null ? 0 : Integer.parseInt(request.getParameter("id")); 
		
		try {
			PecaDAO pecaDAO = new PecaDAO();
			
			switch (action) {
			case Parameters.CRUD_OPERATIONS.CREATE:
				Peca peca = new Peca();
				
				request.setAttribute("peca", peca);
				
				page = form;
				break;
			case Parameters.CRUD_OPERATIONS.ALL:
				List<Peca> pecas = pecaDAO.getAll();
				
				request.setAttribute("pecas", pecas);
				
				page = list;
				
				break;
			case Parameters.CRUD_OPERATIONS.READ:
//				peca = clienteDAO.read(id);
//				request.setAttribute("cliente", cliente);
				
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
		doGet(request, response);
	}

}
