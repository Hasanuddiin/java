import javax.swing.*;

public class Layout {
	//membuat tab untuk berbagai macam jenis layout
	public static void main(String args[]) {
		JFrame frame = new JFrame("Contoh Demo Layout Manager");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tp = new JTabbedPane();
		// membagi tab panel		
		tp.addTab ("Intro", new IntroPanel());
		tp.addTab("Flow", new FlowPanel());
		tp.addTab("Border", new BorderPanel());
		tp.addTab("Grid", new GridPanel());
		tp.addTab("Box", new BoxPanel());
		
		frame.getContentPane().add(tp);
		
		frame.pack();
		frame.setVisible(true);		
	}
}
