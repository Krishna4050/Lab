package javadatabase;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*; 

public class ui_ii extends JFrame implements ActionListener {
	JRadioButton rd1,rd2,rd3,rd4;
	ButtonGroup bg;
	JButton btn;
	JLabel lid,laddress,lcontactno;
	JTextField tid,taddress,tcontactno;
	JPanel jp;
	public ui_ii() {
		rd1 = new JRadioButton("Insert");
		rd2 = new JRadioButton("Delete");
		rd3 = new JRadioButton("Update");
		rd4 = new JRadioButton("Select");
		bg = new ButtonGroup();
		jp = new JPanel();
		lid = new JLabel("Enter Id");
		tid = new JTextField(10);
		laddress = new JLabel("Enter Address");
		taddress = new JTextField(10);
		lcontactno = new JLabel("Enter Number");
		tcontactno = new JTextField(10);
		jp.add(lid);
		jp.add(tid);
		jp.add(laddress);
		jp.add(taddress);
		jp.add(lcontactno);
		jp.add(tcontactno);
		add(jp);
		bg.add(rd1);bg.add(rd2);bg.add(rd3);		bg.add(rd4);
		btn = new JButton("Click Me!");
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(rd1);
		add(rd2);
		add(rd3);
		add(rd4);
		add(btn);
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		try{  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/fmis","root","");  			  
			Statement stmt=con.createStatement();  
			String sql="";
			int pid = Integer.parseInt(tid.getText());
			if(rd1.isSelected()) {
				sql = "insert into person(pid,name,gender,address,contactno) values("+pid+",'rrr','f','mm','555')";
				stmt.execute(sql);
			}
			else if(rd2.isSelected()) {
				sql = "Delete from person where pid="+pid;
				stmt.execute(sql);
			}
			else if(rd3.isSelected()) {
				String add,num;
				add=taddress.getText();
				num=tcontactno.getText();
				if(add.length()>0 && num.length()>0) {
				sql = "Update person set address='"+add+"', Contactno='"+num+"' where pid="+pid;
				}
				else if(add.length()>0) {
					sql="Update person set address='"+add+"' where pid="+pid;
				}
				else if(num.length()>0) {
					sql="Update person set Contactno='"+num+"' where pid="+pid;
				}
				stmt.execute(sql);
			}
			else {
				sql = "select * from person where pid = "+pid;
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.println("Name: "+rs.getString(2)+" Address:"+rs.getString(4));
				}
			}
		}catch(SQLException se) {
			System.out.println("Error: "+se.getMessage());
		}
		
	}
	public static void main(String[] op) {
		ui_ii u = new ui_ii();
	}
}
