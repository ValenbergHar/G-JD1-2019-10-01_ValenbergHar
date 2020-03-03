package by.unlimit;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
			context.setAttribute(user, user);
		}
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out= response.getWriter();

		String name = request.getParameter("firstName");
		String surname = request.getParameter("secondName");
		
		
		out.println("<h3> Shalom from get!</h3>");
		out.println("Name: " + name+ "<br>");
		out.println("Surname: " + surname+ "<br>");
		out.close();
		
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
