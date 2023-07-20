//  import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class conversion extends JFrame implements ActionListener {
//     JLabel Metre_Distance,Output;
//     JTextField metre; 
//     JRadioButton mile,kilometer,centimeter;
//     JTextField display;
//     JButton convert;
//     conversion(){
//         Metre_Distance = new JLabel("Distance(in metre)");
//         Output = new JLabel("Output");
//         metre = new JTextField(20);
//         mile = new JRadioButton("mile");
//         kilometer = new JRadioButton("km");
//         centimeter = new JRadioButton("cm");
//         display = new JTextField(20);
//         convert = new JButton("convert");
//         setSize(400,500);
//         setVisible(true);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new FlowLayout());
//         add(Metre_Distance); add(metre);
//         add(mile); add(kilometer); add(centimeter);
//         add(Output); add(display);
//         add(convert);
//         convert.addActionListener(this);
//     }
//     @Override
//     public void actionPerformed(ActionEvent e) {
//         // TODO Auto-generated method stub
//         //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
//         int x = Integer.parseInt(metre.getText());
//         if(mile.isSelected()){
//             double mile =  0.000621371 * x ;
//             display.setText(mile+"miles");
//         }else if(kilometer.isSelected()){
//             double kilo =  0.001 * x ;
//             display.setText( kilo+"km");
//         }else{
//             double cm  =  100 * x;
//             display.setText(cm+"cm " );
//         }
//     }
//     public static void main(String[] args) {
//         conversion c = new conversion();
//     }
// }
