import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /*request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        if(name!=null && !name.trim().isEmpty()){
            response.getWriter().write("<strong>Hello " + name+" ЎўўЎЎў</strong>");
        }else {
            response.getWriter().write("<strong>Hello world ЎўўЎЎў</strong>");
        }
        */

        String bigData = "BIG DATA";
        request.setAttribute("key", bigData);
        response.setContentType("text/html");
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
