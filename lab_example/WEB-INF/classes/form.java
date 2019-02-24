 import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class form extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
       String i = request.getParameter("email");
       String j = request.getParameter("name");
	   PrintWriter out = response.getWriter();
	   out.println("<html>");
        out.println("<head>");
        out.println("<title>Post</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>EMAIL " + i +"</h1>");
        out.println("<h1>NAME " + j +"</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}