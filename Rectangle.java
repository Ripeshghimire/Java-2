import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rectangle extends JFrame implements ActionListener {
    JLabel length,breadth,height,Output;
    JRadioButton area,volume,perimeter;
    JTextField l,b,h,display;
    JButton calculate;
    Rectangle(){
        length = new JLabel("length");
        breadth = new JLabel("breadth");
        height = new JLabel("height");
        area = new JRadioButton("area");
        volume = new JRadioButton("volume");
        perimeter = new JRadioButton("perimeter");
        l = new JTextField(5);
        b = new JTextField(5);
        h = new JTextField(5);
        display = new JTextField(10);
        calculate = new JButton("calculate");
        ButtonGroup group = new ButtonGroup();
        group.add(area);
        group.add(volume);
        group.add(perimeter);
        Output = new JLabel("output");
        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(length);add(l);
        add(breadth); add(b);
        add(height);add(h);
        add(area); add(volume);add(perimeter);
        add(calculate);
        add(Output);
        add(display);
        calculate.addActionListener(this);
    } 
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        int a = Integer.parseInt(l.getText());
        int d = Integer.parseInt(b.getText());
        int c = Integer.parseInt(h.getText());
        if(area.isSelected()){
            display.setText("area is "+a*d);
        }
        if(volume.isSelected()){
            display.setText("volume is "+a*d*c);
        }
        if(perimeter.isSelected()){
            display.setText("permiter is "+2*(a+d));
        }
    }
    public static void main(String[] args) {
        Rectangle e1 = new Rectangle();
    
    }
   
}
