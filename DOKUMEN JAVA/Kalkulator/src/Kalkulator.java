import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Kalkulator extends JPanel{
	
	JButton display;
	JPanel panel;
	double hasil;
	String lastcommand,a;
	boolean mulai;

	public Kalkulator()
	{
		setLayout(new BorderLayout());
		hasil=0;
		lastcommand="=";
		mulai=true;
		display=new JButton("0");
		display.setEnabled(false);
		add(display,BorderLayout.NORTH);
		ActionListener insert=new insertAction();
		ActionListener command=new commandAction();
		panel=new JPanel();
		panel.setLayout(new GridLayout(4,5));
		addbutton("sin",command);addbutton("7",insert);addbutton("8",insert);
		addbutton("9",insert);addbutton("/",command);
		addbutton("cos",command);addbutton("4",insert);addbutton("5",insert);
		addbutton("6",insert);addbutton("*",command);
		addbutton("tan",command);addbutton("1",insert);addbutton("2",insert);
		addbutton("3",insert);addbutton("+",command);
		addbutton("sqrt",command);addbutton("0",insert);addbutton(".",insert);
		addbutton("=",command);addbutton("-",command);
		add(panel,BorderLayout.CENTER);
	}

	void addbutton(String label,ActionListener listener)
	{
		JButton button=new JButton(label);
		button.addActionListener(listener);
		panel.add(button);
	}

	public void calculate(double x)
	{
		if(lastcommand.equals("+"))
			hasil+=x;
		else if(lastcommand.equals("-"))
			hasil-=x;
		else if(lastcommand.equals("*"))
			hasil*=x;
		else if(lastcommand.equals("/"))
			hasil/=x;
		else if(lastcommand.equals("="))
			hasil=x;
		else if(lastcommand.equals("sin"))
			hasil=Math.sin(Math.toRadians(x));
		else if(lastcommand.equals("cos"))
			hasil=Math.cos(Math.toRadians(x));
		else if(lastcommand.equals("tan"))
			hasil=Math.tan(Math.toRadians(x));
		else if(lastcommand.equals("sqrt"))
			hasil=Math.sqrt(x);
		display.setText(" "+hasil);
	}

	class insertAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String input=e.getActionCommand();
			if(mulai)
			{
				display.setText(" ");
				mulai=false;
			}
			display.setText(display.getText()+input);
		}
	}

	class commandAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String command=e.getActionCommand();
			if(mulai)
			{
			if(command.equals("-"))
			{
			display.setText(command);
			mulai=false;
			}
			else
			lastcommand=command;
			}
			else
			{
			calculate(Double.parseDouble(display.getText()));
			lastcommand=command;
			mulai=true;
			}
		}
	}
	}
		
	class kalkulatorframe extends JFrame
	{
	public kalkulatorframe()
		{
			setSize(375,260);
			setTitle("Demo Kalkulator Sederhana");
			setLocationByPlatform(true);
			Toolkit kit=Toolkit.getDefaultToolkit();
			Kalkulator panel=new Kalkulator();
			add(panel);
		}
	}
	
	class calculator
	{
	public static void main(String args[])
		{
		kalkulatorframe cf = new kalkulatorframe();
		cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cf.setVisible(true);
		}
	}