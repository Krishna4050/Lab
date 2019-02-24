import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton  extends JFrame implements ActionListener
			{		
					JTextField txt;
					JRadioButton add, mul;
					ButtonGroup Sum;
					JLabel Result;
					public RadioButton()
					{
						setLayout(new FlowLayout());
						txt = new JTextField(30);
						add = new JRadioButton("Add");
						mul = new JRadioButton("Multi");
						Result = new JLabel();
						
						Sum = new ButtonGroup();
						add(txt);
						Sum.add(add);
						Sum.add(mul);
						add(add);
						add(mul);
						add(Result);
						add.addActionListener(this);
						mul.addActionListener(this);
						setSize(200,200);
						setVisible(true);
					}

				public static void main(String[]args)
					{
						new RadioButton();
					}
				public void actionPerformed(ActionEvent e)
					{
						String a = txt.getText();
						String[] array = a.split(",");
						int ans=0; int anss=1;
						for(int i=0; i<array.length;i++)
						{
							if(add.isSelected())
						{
							ans=ans+Integer.parseInt(array[i]);
						

}
						else {
								anss=anss*Integer.parseInt(array[i]);
							}
}
						
						Result.setText("Sum = " + ans + " Prod = " + anss);
					
			}
}