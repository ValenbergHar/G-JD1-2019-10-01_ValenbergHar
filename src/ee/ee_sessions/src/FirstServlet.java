import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/hello")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //
//        PrintWriter pw = response.getWriter();
//        pw.println("<html>");
//        pw.println("<h1>Belarus + " + name + "</h1>");
//        pw.println("<html>");



       // count of responce
        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");
        if (count == null){
            session.setAttribute("count", 1);
        count = 1;}
        else
        session.setAttribute("count", count + 1);
        PrintWriter pw = response.getWriter();
        pw.println("<html>");

        pw.println("<h1>Your count is: + " + count + "</h1>");
        //  pw.println("<h1>Belarus + " + name + "</h1>");
        pw.println("<html>");


        

        // перенаправление по ссылке
        //response.sendRedirect("http://www.google.com");
        //response.sendRedirect("/First.jsp");

        // перенаправление неявное
        // RequestDispatcher dispatcher = request.getRequestDispatcher("/First.jsp");
        //dispatcher.forward(request, response);
    }
}
