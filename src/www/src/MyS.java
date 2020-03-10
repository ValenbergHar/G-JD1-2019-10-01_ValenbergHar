import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyS
 */
@WebServlet("/MyS")
public class MyS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public MyS() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// protected void doGet(HttpServletRequest request,
	// HttpServletResponse response) throws ServletException, IOException {
	// response.setContentType("text/html");
	// PrintWriter writer = response.getWriter();
	// String id = request.getParameter("id");
	// try {
	// writer.println("<h2>Id:" + id + "</h2>");
	// } finally {
	// writer.close();
	// }
	// }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String name = request.getParameter("username");
		String age = request.getParameter("userage");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String[] courses = request.getParameterValues("courses");

		try {
			writer.println("<p>Name: " + name + "</p>");
			writer.println("<p>Age: " + age + "</p>");
			writer.println("<p>Gender: " + gender + "</p>");
			writer.println("<p>Country: " + country + "</p>");
			writer.println("<h4>Courses</h4>");
			for (String course : courses)
				writer.println("<li>" + course + "</li>");
		} finally {
			writer.close();
		}
	}

}
