package escuchadores;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class EscuchadorAplicacion
 *
 */
@WebListener
public class EscuchadorAplicacion implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { 
         
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         
    	ServletContext context = arg0.getServletContext();
    	context.setAttribute("megusta", 0);
    	
    }
	
}
