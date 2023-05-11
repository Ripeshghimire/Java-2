import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class database extends JFrame  {
    JButton btn;
    public database(){
        btn = new JButton("Click here");
        add(btn);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new database();
        String loc, un,pwd;
        lc = "";
        un ="root";
        pwd = "";
        try{
            Connection c = DriverManager.getConnection(loc, un, pwd);
            Statement stmt = c.createStatement();
            stmt.execute("insert into customers(name,address,gender)"+"values('ripesh','kapan','Male')");
        }catch(SQLException se){
            System.out.println(se.getMessage());
        }
    }
}
