import java.sql.*;
class DataBaseDemo{
        public static void main(String[]args){
                try{
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","");
                    Statement st = c.createStatement();
                    String sql = "Create table Info(id varchar(20),name varchar(20), symbol_No varchar(40), email varchar(40),phone varchar(40),address varchar(20));";
                    int k = st.executeUpdate(sql);
                    System.out.println("creaded"+k);
                }catch(Exception e){
                        System.out.print("connectionError");
                        e.printStackTrace();
                }
        }
}