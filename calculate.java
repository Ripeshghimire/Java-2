// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// class calculate extends JFrame implements ActionListener{
//     JLabel x , y,resultLabel;
//     JButton sum;
//     JTextField num1 ,num2;
//     calculate(){
//         x = new JLabel("x");
//         y = new JLabel("y");
//         num1 = new JTextField(20);
//         num2 = new JTextField(20);
//         sum = new JButton("Sum");
//         setSize(400,500);
//         setVisible(true);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new FlowLayout());
//         add(x); add(num1);
//         add(y); add(num2);
//         add(sum);
//         sum.addActionListener(this);
//         resultLabel = new JLabel(""); // Instantiate the result label
//         add(resultLabel); // Add the result label to the frame
//     }
// @Override
// public void actionPerformed(ActionEvent e) {
//     // TODO Auto-generated method stub
//    // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
//    int a =Integer.parseInt(num1.getText());
//    int b = Integer.parseInt(num2.getText());
//    if(e.getSource()==sum){
//     int sum = a + b ;
//     resultLabel.setText("Sum is " + sum); 
//    }
// }
// public static void main(String[] args) {
//     calculate c1 = new calculate();
// }
//}
