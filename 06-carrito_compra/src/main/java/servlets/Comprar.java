package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Item;

/**
 * Servlet implementation class Comprar
 */
@WebServlet("/Comprar")
public class Comprar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(); 
		List<Item> carrito = (List<Item>) session.getAttribute("carrito");
		
		//Es la primera vez que el usuario compra, aun no existe el atributo de sesion
		if (carrito == null) {
			carrito = new ArrayList<Item>();
			session.setAttribute("carrito", carrito);
		}
		//recuperamos datos del producto, creamos un objeto producto
		//y lo guardamos en el carrito
		String nom = request.getParameter("nombre");
		int    can = Integer.parseInt(request.getParameter("unidades"));
		double vlr = Double.parseDouble(request.getParameter("precio"));
					
		carrito.add(new Item(nom, can, vlr));		
		request.getRequestDispatcher("opciones.html").forward(request, response);
	}

}
