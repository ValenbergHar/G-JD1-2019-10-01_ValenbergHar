
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGet
 */
@WebServlet("/servletget")
public class ServletGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String oneString = request.getParameter("one");
		String twoString = request.getParameter("two");
		response.getWriter()
				.write("<html>" + "<head></head>" + "<body>" + "one = " + oneString + " two = " + twoString
						+ "<form action ='servletget' method = 'get'>" + "<input type = 'text' name = 'one'/>"
						+ "<input type = 'text' name = 'two'/>" + "<input type = 'submit' name = 'submit'/>" + "</form>"
						+ "</body>" + "</html>");

//		Cookie[] cookies = request.getCookies();
//		for (Cookie cookie : cookies) {
//			System.out.println(cookie.getName());
//			System.out.println(cookie.getValue());
//		 }
	}

}
