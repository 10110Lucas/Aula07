package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import model.Pais;
import service.PaisService;

/**
 * Servlet implementation class ManterPaisController
 */
@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pAcao = request.getParameter("acao");
		PaisService ps = new PaisService();
		
		if(pAcao.equals("Criar")) {
			
			String pNome      =                request.getParameter("nome");
			long   pPopulacao = Long.parseLong(request.getParameter("populacao"));
			double pArea =  Double.parseDouble(request.getParameter("area"));
	
			// instanciar o javabean
			Pais pais = new Pais();
			pais.setNome     (pNome);
			pais.setPopulacao(pPopulacao);
			pais.setArea     (pArea);
	
			// instanciar o service
			ps.criar(pais);
			pais = ps.carregar(pais.getId());
	
	        //enviar para o jsp
	        request.setAttribute("pais", pais);
	        request.getRequestDispatcher("Pais.jsp").forward(request, response);
	        
		}
		else {
			List <Pais> paises = ps.listar();
			request.setAttribute("paises", paises);
			request.getRequestDispatcher("Listar.jsp").forward(request, response);
		}
		
	}
}