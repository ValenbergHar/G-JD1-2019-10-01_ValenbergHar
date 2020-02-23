package by.unlimit;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = "/ParametrsServlet",loadOnStartup = 0)
public class ParametrsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("Initilization of servlet");
	}
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String user = request.getParameter("user");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (user !="" && user!=null) {
			session.setAttribute("user", user);
//			context.setAttribute("user", user);
		}
		session.setMaxInactiveInterval(5);
		
	//	String name = request.getParameter("firstName");
	//	String surname = request.getParameter("secondName");
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out= response.getWriter();
		out.println("Request parameter: " + user + "<br>");
		out.println("Session parameter: " + session.getAttribute("user") + "<br>");
//		out.println("Context parameter: " + context.getAttribute("user") + "<br>");		
		out.println("<a href='http://localhost:8080/WebApp/Parametrs.html'>Back<br>");
		out.close();
		
//		System.out.println("session in seconds: " + session.getMaxInactiveInterval());
		System.out.println(session.getMaxInactiveInterval());
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("firstName");
		String surname = request.getParameter("secondName");
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out= response.getWriter();
		out.println("<h3> Shalom from get!</h3>");
		out.println("Name: " + name);
		out.println("Surname: " + surname);
		out.close();
		
	}

}
