package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		Ficha ficha = (Ficha) request.getAttribute("ficha");
		out.println("<h1>Bienvenido "+ ficha.getUsuario() +" a mi página</h1>");
		out.println("<h1>Tienes "+ ficha.getEdad() +" años</h1>");
		out.println("<h1>Tu email es "+ ficha.getEmail() +"</h1>");
		out.println("<br/>");
		out.println("<a href='formulario.html'>volver</a>");
		out.println("</body></html>");
	}

}
