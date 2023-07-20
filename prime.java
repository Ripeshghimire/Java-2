// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// public class prime extends JFrame implements ActionListener{
//     JLabel num,output;
//     JTextField fnum,display;
//     JButton find;
//     prime(){
//         num = new JLabel("number");
//         output = new JLabel("output");
//         fnum = new JTextField(20);
//         display = new JTextField(20);
//         find = new JButton("find");
//         setSize(400, 500);
//         setVisible(true);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new FlowLayout());
//         add(num);add(fnum);
//         add(find);
//         add(output);add(display);
//         find.addActionListener(this);
//     }
// @Override
//     public void actionPerformed(ActionEvent ar){
//         int a = Integer.parseInt(fnum.getText());
//         int c=0;
//         for(int i = 1; i<=a;i++){
//             if(a%i == 0){
//                 c++;
//             }
//         }
        
//         if(c<=2){
//             display.setText(a+"is a prime number");
//         }
//         else{
//             display.setText(a+"is a composite number");
//         }
//     }
// public static void main(String[] args) {
//     new prime();
// }
// }
