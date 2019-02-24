 import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class add extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
       String i = request.getParameter("num1");
       String j = request.getParameter("num2");
	   int input1 = Integer.parseInt(i);
	   int input2 = Integer.parseInt(j);
	   PrintWriter out = response.getWriter();
	   out.println("<html>");
        out.println("<head>");
        out.println("<title>Post</title>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("<h1>Sum " + (input1+input2) +"</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}