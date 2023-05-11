import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class generator extends JFrame implements ActionListener {
JLabel password,user; 
JTextField p1,p2;
JButton btn;
    generator(){
        password = new JLabel("Password");
        user = new JLabel("User");
        p1 = new JTextField(15);
        btn = new JButton("generate");
        p2 = new JTextField(10);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(user);add(p2);
        add(password);add(p1);
        add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ee){
        String uppercase = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
        String lowercase = ("abcdefghijklmnopqrstuvwxyz");
        String specialchars = {"!@#$%^&*()_+-=[]{};:,.<>?"};
        String numbers = {"1234567890"};
        String allchars = uppercase + lowercase + specialchars + numbers;
        String password = "";
        int number = Integer.parseInt(p2.getText());
        Random rand = new Random();
        for(int i = 1; i<=number;i++){
            
        }
        p1.setText(password.toString());
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new generator();
            }
        });
    }
}