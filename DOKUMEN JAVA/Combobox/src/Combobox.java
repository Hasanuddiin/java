import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Combobox {
  JComboBox combo;
  JTextField txt;
  JLabel label;
  
  public static void main(String[] args) {
	  Combobox b = new Combobox();
  }

  public Combobox(){
	  String course[] = {"BCA","Mandiri","BNI","BRI","Danamon","BPD"};
	  JFrame frame = new JFrame("Contoh membuat komponen ComboBox");
	  JPanel panel = new JPanel();
	  label = new JLabel("Pilih nama bank :");
	  combo = new JComboBox(course);
	  combo.setBackground(Color.white);
	  combo.setForeground(Color.red);
	  txt = new JTextField(10);
	  
	  panel.add(label);
	  panel.add(combo);
	  panel.add(txt);
	  frame.add(panel);
	  
	  combo.addItemListener(new ItemListener(){
		  public void itemStateChanged(ItemEvent ie){
			 String str = (String)combo.getSelectedItem();
			 txt.setText(str);
		  }
  });
	  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(400,200);
  frame.setVisible(true);
  }
}