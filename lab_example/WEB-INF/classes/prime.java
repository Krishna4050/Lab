 import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class prime extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
       String j = request.getParameter("num1");
	   int a = Integer.parseInt(j);
	   int count = 0;
	   PrintWriter out = response.getWriter();
	   out.println("<html>");
        out.println("<head>");
        out.println("<title>Post</title>");
        out.println("</head>");
        out.println("<body>");
        for(int i = 0; i<=a; i++ ){
		count = 0;
		for(int k =2; k<=i/2; k++){
			if(i%k==0){
				count++;
				break;
			}
		}
		
		if(count==0){
			out.println(i);
		}
        }
        out.println("</body>");
        out.println("</html>");
    }
}