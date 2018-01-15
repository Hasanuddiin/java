import java.util.Scanner;

public class Kondisional1 {

	/**
	 * @param args
	 * Penggunaan kondisional If
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int batas = 18;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Masukkan umur Anda :");
		int umur = scan.nextInt();
		
		System.out.println ("Anda memasukkan umur = " + umur);
		
		if (umur < batas) 
			System.out.println ("Umur Anda belum mencukupi");				

	}
}
