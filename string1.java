import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.String;
public class string1 extends JFrame implements ActionListener{
    JLabel data,result;
    JButton display;
    JTextField string1;
    string1(){
        data = new JLabel("data");
        string1 = new JTextField(20);
        display = new JButton("display");
        setSize(400,500 );
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(data); add(string1);
        add(display);
        display.addActionListener(this);
        result = new JLabel("");
        add(result);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        String s = string1.getText();
        int x = s.length();
        char firstChar = s.charAt(0);
            result.setText("Length of string: " + x + ", First character: " + firstChar);
           
        
    }    

    public static void main(String[] args) {
        string1 s = new string1();
    }
}

  
