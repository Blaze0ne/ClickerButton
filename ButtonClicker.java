import javax.swing.*;


public class ButtonClicker{

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton (" Click Me");
		button.setBounds(150, 200, 220, 50);
		
		JLabel number = new JLabel("00");
		number.setBounds(200, 50, 50, 50);
		
		frame.add(button);
		frame.add(number);
		frame.setSize(400, 200);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}	
}
