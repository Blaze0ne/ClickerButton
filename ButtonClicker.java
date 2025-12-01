import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonClicker implements ActionListener{
    
        private int count = 0;

        private JLabel label;
        private JFrame frame;
        private JPanel panel;

        public ButtonClicker(){
                int count = 0;
    
                frame = new JFrame();

                JButton button = new JButton ("Click Me"); 
                button.setBounds(160, 100, 100, 40);
                button.addActionListener(this);

                label = new JLabel("0 clique"); 
                label.setBounds(200, 50, 70, 50);


                frame.add(button);
                frame.add(label);
                frame.setSize(400, 200);
                frame.setLayout(null);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }    
        public void actionPerformed(ActionEvent e) {
                count++;
                label.setText(count+" clique");
        }

        public static void main(String[] args) {
                new ButtonClicker();
        }
}
