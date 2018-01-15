import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleCheckBox extends JPanel {
	private JLabel kataku;
	private JCheckBox bold, italic;
	
	// mengatur panel yang di atasnya terdapat komponen label serta checkbox mengatur style font 
	public StyleCheckBox()
	{
		kataku = new JLabel("Katakan dengan style");
		kataku.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		bold = new JCheckBox("Bold");
		bold.setBackground(Color.cyan);
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.cyan);
		
		StyleListener listener = new StyleListener();
		bold.addItemListener(listener);
		italic.addItemListener(listener);
		
		add(kataku);
		add(bold);
		add(italic);
		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(400, 100));
	}
	
	// menunjukkan aksi ketika checkbox di pilih
	private class StyleListener implements ItemListener
	{
		// merubah style pada label teks
		public void itemStateChanged (ItemEvent event)
		{
			int style = Font.PLAIN;
			
			if(bold.isSelected())
				style = Font.BOLD;
			
			if(italic.isSelected())
				style += Font.ITALIC;
			
			kataku.setFont(new Font("Arial", style, 35));
		}
	}
}
