import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class hello extends JFrame implements ActionListener {
    JLabel name; JTextField fname;
    JLabel output; JTextField op;
    JButton click;
    hello(){
        name=new JLabel("NAme");
        fname=new JTextField(20);
        output=new JLabel("OUTPUT");
        op=new JTextField(20);
        click=new JButton("CLICK");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(name);add(fname);
        add(output);add(op);
        add(click);
        click.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        String s = fname.getText();
        if(e.getSource() == click ){
            op.setText("hello my name is "+s);
        }
    }
    public static void main(String[] args) {
        hello s = new hello();
    }
}
