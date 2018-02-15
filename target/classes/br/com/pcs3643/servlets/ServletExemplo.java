package br.com.pcs3643.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class ServletExemplo
 */
@WebServlet("/ServletExemplo")
public class ServletExemplo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExemplo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
//		
		/*String nome = request.getParameter("nome");
		String nusp = request.getParameter("nusp");
		
		out.print("\nNome: "+nome);
		out.print("\nNUSP: "+nusp);*/
//		
		
//		System.out.println("Nome:"+request.getParameter("nome"));
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/app/prova.jsp");
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String cpf = request.getParameter("cpf");
//		PrintWriter out = response.getWriter();
//		
//		out.append()
		request.getParameter("telefone");
		request.getAttribute("cpf");
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/app/prova1.jsp");
		requestDispatcher.forward(request, response);
	}

}
