import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class abc implements ActionListener{
	JFrame f;
	JLabel jl;
	JTextField jt;
	JButton jb;
	public abc(){
		f = new JFrame("J Pa Yo Thya Hi");
		jl = new JLabel("Enter a Number");
		jt = new JTextField(40);
		jb = new JButton("Clicke Me!");

		/*f.setLayout(new FlowLayout());
		f.setSize(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		f.add(jl);
		f.add(jt);
		f.add(jb);

		jb.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae){
		int a = Integer.parseInt(jt.getText());
		jb.setText(""+a);
	}
	public static void main(String [] ooo){
		abc a = new abc();
		a.setLayout(new FlowLayout());
		a.setSize(300,200);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}