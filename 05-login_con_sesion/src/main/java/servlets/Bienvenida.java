package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Ficha;

/**
 * Servlet implementation class Bienvenida
 */
@WebServlet("/Bienvenida")
public class Bienvenida extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //tipo de formato de respuesta
		PrintWriter out=response.getWriter(); //construimos página de respuesta
		out.println("<html><body>");
		//Recuperamos la ficha de usuario almacenada en sesion
		HttpSession sesion = request.getSession();
		Ficha ficha = (Ficha) sesion.getAttribute("ficha");
		out.println("<h1>Bienvenido "+ ficha.getUsuario() +" a mi página</h1>");
		out.println("<h1>Tienes "+ ficha.getEdad() +" años</h1>");
		out.println("<h1>Tu email es "+ ficha.getEmail() +"</h1>");
		out.println("<br/>");
		out.println("<h1>Has elegido la opción "+request.getParameter("opcion")+"</h1>");
		out.println("<br/>");
		out.println("<a href='formulario.html'>volver</a>");
		out.println("</body></html>");
	}

}
