import javax.swing.*;
import javax.swing.JFrame;

public class Grapik1 {
	// ---------------------- 
	// menampilkan frame
	// ----------------------
	public static void main(String[] args) {
		//int Push;
		
		JFrame frame = new JFrame ("Push Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CounterPanel panel = new CounterPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);		
	}
}
