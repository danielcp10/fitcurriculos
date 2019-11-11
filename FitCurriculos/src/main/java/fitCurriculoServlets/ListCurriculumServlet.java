package fitCurriculoServlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fitCurriculoModels.Curriculo;

@WebServlet(urlPatterns={"/ShowCurriculumList"})
public class ListCurriculumServlet extends HttpServlet {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	List<Curriculo> listaCurriculos;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("Entrou doGet list");
		Curriculo c1 = new Curriculo("Danilo", 1);
		Curriculo c2 = new Curriculo("Carla", 2);
		Curriculo c3 = new Curriculo("Julian", 3);
		listaCurriculos = new ArrayList<Curriculo>();
		listaCurriculos.add(c1);
		listaCurriculos.add(c2);
		listaCurriculos.add(c3);
		
		//req.setAttribute("Login", req.getParameter("Login"));
		req.setAttribute("ListaCurriculos", listaCurriculos);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("ShowCurriculumList.jsp");
		dispatcher.forward(req, resp);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
				
		//resp.getWriter().print("Seja bem vindo, " + login +".");
		
		//Curriculo curriculo = new Curriculo();

		/*String antiga = resp.getCharacterEncoding();
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print(mensagem + "\nCodificação anterior: " + antiga +
				"\nCondificação atual: " + resp.getCharacterEncoding());*/
	}

	
	

}
