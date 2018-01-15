import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CounterPanel extends JPanel {
	private int hitung;
	private JButton tekan;
	private JLabel label;
	
	// constructor
	public CounterPanel()
	{
		hitung = 0;
		
		tekan = new JButton ("Tekan !");
		tekan.addActionListener(new ButtonListener());
		
		label = new JLabel("Tekan: " + hitung);
		
		add(tekan);
		add(label);
		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 40));
	}
	
	// listener untuk tekan button
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			hitung++;
			label.setText("Tekan: " + hitung);
		}
	}
}
