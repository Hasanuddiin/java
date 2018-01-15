import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogPesanKonfirm{
  JButton button;
  public static void main(String[] args){
  DialogPesanKonfirm md = new DialogPesanKonfirm();
  }

  public DialogPesanKonfirm(){
  JFrame frame = new JFrame("Kotak Dialog Pesan dan Konfirm");
  button = new JButton("Tunjukkan kotak dialog pesan OK");
  button.addActionListener(new MyAction());
  JPanel panel = new JPanel();
  panel.add(button);
  button = new JButton("Tunjukkan kotak dialog pesan \"Ok/Cancel\" ");
  button.addActionListener(new MyAction());
  panel.add(button);
  button = new JButton("Tunjukkan kotak dialog \"Yes/No/Cancel\" ");
  button.addActionListener(new MyAction());
  panel.add(button);
  frame.add(panel);
  frame.setSize(380, 380);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public class MyAction implements ActionListener{
  public void actionPerformed(ActionEvent ae){
  String str = ae.getActionCommand();
  if(str.equals("Tunjukkan kotak dialog pesan OK")){
  JOptionPane.showMessageDialog(null, "Kotak dialog pesan sederhana.", "Test", 1);
  }
  else if(str.equals("Tunjukkan kotak dialog pesan \"Ok/Cancel\" ")){
  if(JOptionPane.showConfirmDialog(null, "Ini kotak dialog pesan \"Ok/Cancel\".", "Test", JOptionPane.OK_CANCEL_OPTION) == 0)
  JOptionPane.showMessageDialog(null, "Anda klik tombol \"Ok\" ", "Test", 1);
  else
  JOptionPane.showMessageDialog(null, "Anda klik tombol \"Cancel\" ","Test", 1);
  }  
  else if(str.equals("Tunjukkan kotak dialog \"Yes/No/Cancel\" ")){
  JOptionPane.showConfirmDialog(null, "Ini kotak dialog pesan \"Yes/No/Cancel\".");
  }
  }
  }
}