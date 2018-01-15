import javax.swing.*;
import java.awt.event.*;

public class DialogInput {
  public static void main(String[] args){
  JFrame frame = new JFrame("Contoh Penggunaan Dialog Input");
  JButton button = new JButton("menunjukkan Kotak Dialog Input");
  button.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae){
  String str = JOptionPane.showInputDialog(null, "Masukkan teks : ", 
"Input", 1);
  if(str != null)
  JOptionPane.showMessageDialog(null, "Anda telah memasukkan teks : " + str, 
"Input", 1);
  else
  JOptionPane.showMessageDialog(null, "Anda menekan tombol Cancel.", 
"Input", 1);
  }
  });
  JPanel panel = new JPanel();
  panel.add(button);
  frame.add(panel);
  frame.setSize(380, 380);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
}