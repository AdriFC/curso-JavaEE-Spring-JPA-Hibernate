package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import beans.Contacto;
import modelo.AgendaContactos;

/**
 * Servlet implementation class BuscarAction
 */
@WebServlet("/BuscarAction")
public class BuscarAction extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AgendaContactos gcontactos=new AgendaContactos();
		//recupera el par�metro que contiene la parte del nombre a buscar
		String cad=request.getParameter("textoNombre");
		List<Contacto> contactos=gcontactos.buscarContactos(cad);
		PrintWriter out=response.getWriter();
		response.setContentType("text/plain");
		//envía como respuesta el resultado de la transformación
		out.println(convertirJSON(contactos));
	}
	//utilizando JSON simple, transforma la lista de objetos Contacto
	//en un array de objetos JSON
	private String convertirJSON(List<Contacto> contactos) {
		JSONArray array=new JSONArray();
		if(contactos!=null) {
			for(Contacto c:contactos) {
				JSONObject obj=new JSONObject();
				obj.put("nombre", c.getNombre());
				obj.put("email", c.getEmail());
				obj.put("telefono", c.getTelefono());
				array.add(obj);
			}
		}
		
		return array.toJSONString();
	}

}
