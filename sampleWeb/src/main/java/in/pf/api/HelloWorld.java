package in.pf.api;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
		  name = "AnnotationExample",
		  description = "Example Servlet Using Annotations",
		  urlPatterns = {"/hello"}
		)
public class HelloWorld extends HttpServlet {	
	private static final long serialVersionUID = -4324468309589296828L;

	@Override
    protected void doGet(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
    	doPost(request,response);
    }
    
    @Override
    protected void doPost(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<p>Call from scm trigger url</p>");
    }
}
