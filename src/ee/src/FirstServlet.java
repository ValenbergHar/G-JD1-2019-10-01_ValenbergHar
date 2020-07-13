import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/hello")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1>Belarus + " + name + "</h1>");
        pw.println("<html>");

// перенаправление по ссылке
        //response.sendRedirect("http://www.google.com");
        //response.sendRedirect("/First.jsp");

        // перенаправление неявное
        RequestDispatcher dispatcher = request.getRequestDispatcher("/First.jsp");
        dispatcher.forward(request, response);
    }
}
