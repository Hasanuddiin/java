import javax.swing.*;
import java.awt.event.*;

public class DialogPesan{
	 JFrame frame;
	 public static void main(String[] args){
	 DialogPesan dp = new DialogPesan();
 }

 public DialogPesan(){
	 frame = new JFrame("Contoh Penggunaan Kotak Dialog Pesan");
	 JButton button = new JButton("Tekan");
	 button.addActionListener(new MyAction());
	 frame.add(button);
	 frame.setSize(450, 450);
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

 public class MyAction implements ActionListener{
   public void actionPerformed(ActionEvent e){
	 JOptionPane.showMessageDialog(frame,"Anda telah menekan tombol");
   }
  }
}