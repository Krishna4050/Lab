import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class math extends JFrame implements ActionListener,ItemListener{
	JLabel num1, num2,strings;
	JTextField jfnum1,jfnum2;
	JRadioButton jrb2,jrb1,jrb3;
	ButtonGroup bg;
	JButton jb;
	public math(){

		num1 = new JLabel("Entere Num1"); num1.setBounds(40,40,100,30);
		num2 = new JLabel("Entere Num2"); num2.setBounds(40,80,100,30);
		jfnum1 = new JTextField(20);	  jfnum1.setBounds(150,40,40,30);
		jfnum2 = new JTextField(20);	  jfnum2.setBounds(150,80,40,30);
		jb = new JButton("Get Shortly!"); jb.setBounds(100,160,100,30);
		jrb1 = new JRadioButton("Squared"); jrb1.setBounds(40,120,80,30);
		jrb2 = new JRadioButton("Ratios");jrb2.setBounds(130,120,80,30);
		jrb3 = new JRadioButton	("Alternate");jrb3.setBounds(220,120,80,30);
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);

		strings = new JLabel("");			strings.setBounds(40,200,200,30);
		add(num1);
		add(num2);
		add(jfnum1);
		add(jfnum2);
		add(jrb1); jrb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
		
			}	
		});
		add(jrb2);
		add(jrb3);
		add(jb); jb.addActionListener(this);
		add(strings);
		setLayout(null);
		setVisible(true);
		setSize(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void itemStateChanged(ItemEvent evvvv){
		System.out.println("Ka ki le ka hi");		
	}
	public void actionPerformed(ActionEvent ae){
		int s = Integer.parseInt(jfnum1.getText());
		int e = Integer.parseInt(jfnum2.getText());
		String ss = "";

		if(jrb1.isSelected()){
			for(int i = s;i<=e;i++){
			ss += " "+(i*i);	
		}	
		}
		else if(jrb2.isSelected()){
			for(int i=s;i<=e;i++)
				ss += i+"/"+s+"+";
		}
		
		strings.setText(ss);
		System.out.println(""+ss);
	}
	public static void main(String[] argsssss){
		math m = new math();
	}
}