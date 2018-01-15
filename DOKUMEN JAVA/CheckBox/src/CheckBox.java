import javax.swing.JFrame;

public class CheckBox {
	public static void main (String args[])
	{
		JFrame frame = new JFrame ("Membuat tulisan ber-style");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new StyleCheckBox());
		
		frame.pack();
		frame.setVisible(true);
	}
}
