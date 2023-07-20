import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class rockpaper extends JFrame implements ActionListener {
    JTextField t1;
    JButton play;
    JLabel output;

    rockpaper() {
        t1 = new JTextField(20);
        play = new JButton("Play");
        output = new JLabel("Output");
        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(t1);
        add(play);
        add(output);
        play.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user_choice = t1.getText().toLowerCase();
        String[] computer_choice = {"rock", "paper", "scissors"};
        Random r = new Random();
        int length = r.nextInt(computer_choice.length);
        String compute_choice = computer_choice[length];

        if (user_choice.equals("rock") && compute_choice.equals("rock")) {
            output.setText("Same choice");
        } else if (user_choice.equals("rock") && compute_choice.equals("paper")) {
            output.setText("computer wins "  + compute_choice +  "user choice loses " + user_choice);
        } else if (user_choice.equals("rock") && compute_choice.equals("scissors")) {
            output.setText("computer loses "  + compute_choice +  "user choice wins" + user_choice);
        } else if (user_choice.equals("paper") && compute_choice.equals("paper")) {
            output.setText("Same choice");
        } else if (user_choice.equals("paper") && compute_choice.equals("rock")) {
            output.setText("computer loses "  + compute_choice +  "user choice wins " + user_choice);
        } else if (user_choice.equals("paper") && compute_choice.equals("scissors")) {
            output.setText("computer wins "  + compute_choice +   "user choice loses " + user_choice);
        } else if (user_choice.equals("scissors") && compute_choice.equals("scissors")) {
            output.setText("Same choice");
        } else if (user_choice.equals("scissors") && compute_choice.equals("rock")) {
            output.setText("computer wins "  + compute_choice +  "user choice loses " + user_choice);
        } else if (user_choice.equals("scissors") && compute_choice.equals("paper")) {
            output.setText("computer loses "  + compute_choice +  "user choice wins " + user_choice);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new rockpaper();
            }
        });
    }

}
