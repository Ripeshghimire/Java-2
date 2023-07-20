import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class database extends JFrame implements ActionListener{
	JTextField tn,ta,tg;
	JButton btn;
	public database() {
		tn = new JTextField(30);
		ta = new JTextField(30);
		tg = new JTextField(30);
		btn = new JButton("Click here");
		setLayout(new FlowLayout());
		add(tn);
		add(ta);
		add(tg);
		add(btn);
		setLocationRelativeTo(null);
		btn.addActionListener(this);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
 	public void actionPerformed(ActionEvent aee) {
		String loc,un,pwd;
		loc = "jdbc:mysql://localhost:3306/test";
		un ="root";
		pwd ="";
		try {
			System.out.println("Inserting data");
			Connection c = DriverManager.getConnection(loc,	 un, pwd);
			Statement stmt = c.createStatement();
		stmt.execute("insert into customers(cname,address,gender)"
	+ "values('"+tn.getText()+"','"+ta.getText()+"','"+tg.getText()+"')");
			/*ResultSet rs = stmt.executeQuery("select cname,address from customers");
			while(rs.next()) {
				System.out.println("ncadgame: "+rs.getString(1)+" Address: "+rs.getString(2));
			}*/
		}catch(SQLException se) {
			System.out.println(se.getMessage());
	}
}
	public static void main(String[] aaa) {		
		new database();
	}
}
