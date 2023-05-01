import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class factorial extends JFrame implements ActionListener {
    JLabel num1,factorial ; 
    JTextField fnum1,display;
    JButton btn;
    factorial(){
        num1 = new JLabel("num1");
        factorial = new JLabel("factorial");
        fnum1 = new JTextField(20);
        btn = new JButton("display");
        display = new JTextField(20);
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(num1); add(fnum1);
        add(factorial);add(display);
        add(btn);
        btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(fnum1.getText());
        int c = 1;
        for(int i = 1 ; i<=a;i++){
            c = c * i;
        }
        display.setText("factorial of the given number is "+c);
    }
    public static void main(String[] args) {
     new factorial();   
    
    }
}
