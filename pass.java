// import javax.swing.*;
// import javax.swing.text.DefaultStyledDocument.ElementSpec;
// import java.awt.*;
// import java.awt.event.*;

// public class pass extends JFrame implements ActionListener {
//     JLabel pass,repass,display;
//     JTextField f1,f2;
//     JButton btn;
//     pass(){
//         pass = new JLabel("pass");
//         repass = new JLabel("retype");
//         f1= new JTextField(20);
//         f2 = new JTextField(20);
//         display = new JLabel();
//         btn = new JButton("check");
//         setSize(400, 500);
//         setVisible(true);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new FlowLayout());
//         add(pass);add(f1);
//         add(repass);add(f2);
//         add(display);
//         add(btn);
//         btn.addActionListener(this);
//         }
//     @Override
//     public void actionPerformed(ActionEvent ae){
//         if(f1.getText().equals(f2.getText())){
//             display.setText("welcome to the page");
//         }
//         else{
//             display.setText("please try again");
//         }
//     }
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable(){
//             public void run(){
//                 new pass();
//             }
//         });
            
//         }
//     }

