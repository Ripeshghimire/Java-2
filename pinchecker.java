import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
public class pinchecker extends JFrame implements ActionListener {
JLabel pin;
JTextField t1;
pinchecker(){
    pin = new JLabel("Pin");
    t1 = new JTextField(20);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
}
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
