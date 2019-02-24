import javax.swing.*;
import java.awt.*;
class jfk extends JFrame{
	JLabel jl,j2;
	public jfk(){
		jl = new JLabel("Fantastic Seven");
		j2 = new JLabel("SEa of Love");
		setVisible(true);
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(jl,BorderLayout.NORTH);
		add(j2,BorderLayout.SOUTH);
	}
	public static void main(String[] KCMIT){
		jfk j = new jfk();
		j.setSize(500,300);
	}
}