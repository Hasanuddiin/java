import java.awt.*;
import javax.swing.*;

public class IntroPanel extends JPanel {
	//isi panel dengan label nama
	public IntroPanel()
	{
		setBackground(Color.cyan);
		
		JLabel label1 = new JLabel ("Pilih tab untuk melihat contoh berbagai jenis " + "layout manager");
		
		add(label1);		
	}
}
