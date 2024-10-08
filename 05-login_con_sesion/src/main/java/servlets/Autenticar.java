package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Ficha;

/**
 * Servlet implementation class Autenticar
 */
@WebServlet("/Autenticar")
public class Autenticar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		RequestDispatcher rd;
		if(user.equals("admin")&&pwd.equals("admin")) {
			
			Ficha ficha = new Ficha(user, 38, "test@test.com");
			//Obtenemos el objeto HttpSession y guardamos en el la ficha de usuario
			HttpSession sesion = request.getSession();
			sesion.setAttribute("ficha", ficha);
			
			rd=request.getRequestDispatcher("menu.html");
			
		}else { 
			
			rd=request.getRequestDispatcher("Error");
			
		}
		rd.forward(request, response);
		
	}

	
}
