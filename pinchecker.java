import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
public class pinchecker extends JFrame implements ActionListener {
JLabel pin;
JTextField t1;
JButton btn;
pinchecker(){
    pin = new JLabel("Pin");
    t1 = new JTextField(20);
    btn = new JButton("Enter");
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    setSize(400, 500);
    add(pin); add(t1);
    add(btn);
    btn.addActionListener(this);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        int count = 0 ;
        while(true){
            if(e.getSource() == btn){
                count = count + 1 ;
            }
        }
    }
    public static void main(String[] args) {
        new pinchecker();
    }
}
