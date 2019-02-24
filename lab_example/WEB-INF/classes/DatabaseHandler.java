import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DatabaseHandler extends HttpServlet
{ 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
    {
		String name = request.getParameter("name");
		String symbol_Number = request.getParameter("SN");
		String email = request.getParameter("email");
		String phone = request.getParameter("PN");
		String address = request.getParameter("AN");
	
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","");
			Statement st = con.createStatement();
			st.execute("insert into info(id, name, symbol_no,email,phone,address)" +" values(' ','name','Symbol','email','phone','address')");
			}
		catch(Exception e)
		{
            System.out.print("connectionError");
            e.printStackTrace();
        }
	}
}

/* public DatabaseHandler(){
	c = .......

}

public void insertStudent(Student s){
	
	//insert
}
public ResultSet search(String name){
	//search 
	//return result set
}


}*/