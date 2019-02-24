import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
class ui_one extends JFrame{
	JLabel lname;
	JTextField jtfname;
	JLabel lgender;
	JRadioButton gen1,gen2;
	ButtonGroup bg;
	JLabel lhobby;
	JCheckBox chk1,chk2,chk3;
	JLabel lcountry;
	JComboBox jcb;
	JLabel lplaces;
	JList lst;
	JButton jb;
	String str="";
	public ui_one(){
		lname = new JLabel("Name");lname.setBounds(40,40,100,30);
		jtfname = new JTextField(30);jtfname.setBounds(150,40,100,30);
		lgender = new JLabel("Gender");lgender.setBounds(40,90,100,30);
		gen1 = new JRadioButton("Male");gen1.setBounds(150,90,90,30);chk1 = new JCheckBox("Reading");chk1.setBounds(120,130,70,30);
		gen2 = new JRadioButton("FeMale");gen2.setBounds(260,90,90,30);
		bg = new ButtonGroup();
		bg.add(gen1);
		bg.add(gen2);
		lhobby = new JLabel("Hobbies");lhobby.setBounds(40,130,70,30);
		chk1 = new JCheckBox("Reading");chk1.setBounds(120,130,90,30);
		chk2 = new JCheckBox("Roaming");chk2.setBounds(220,130,90,30);
		chk3 = new JCheckBox("Eating");chk3.setBounds(310,130,90,30);
		lcountry = new JLabel("Country");lcountry.setBounds(40,170,70,30);
		String[] s = {"Nepal","USA","China","Sweden"};
		jcb = new JComboBox<String> (s); jcb.setBounds(120,170,70,30);
		lplaces = new JLabel("Places"); lplaces.setBounds(40,210,70,30);
		String[]  ss= {"Thankot","Bhaktapur","Banepa"};
		lst = new JList<String> (ss);lst.setBounds(120,210,80,100);
		jb = new JButton("Click Me!");jb.setBounds(120,320,80,30);
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		add(lname); add(jtfname);
		add(lgender);add(gen1);add(gen2);
		add(lhobby);add(chk1);add(chk2);add(chk3);
		add(lcountry);add(jcb);
		add(lplaces);add(lst);
		add(jb);

		jcb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				str +=" "+ jcb.getItemAt(jcb.getSelectedIndex());	
				jb.setText(""+s);
			}
		});
		lst.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e){
				str += " "+lst.getSelectedValue();
			}
		});
	}
	public static void main(String[] ppp){
		ui_one u = new ui_one();
	}
}