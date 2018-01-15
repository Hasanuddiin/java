import java.util.*;

public class Kondisional3 {
	// Bermain game tebak angka
	public static void main (String[] args) {
		final int maks = 15;
		int jawaban, tebak;
		
		Scanner scan = new Scanner (System.in);
		Random generator = new Random();
		
		jawaban = generator.nextInt(maks) + 1;
		
		System.out.print("Angka yang ada antara 1 dan 15 adalah : " + maks + ". Tebak berapa nilainya? ");
		
		tebak = scan.nextInt();
		
		if (tebak == jawaban) {
		System.out.println("Jawaban Anda benar");
		} 
		else {			
			System.out.println("Jawaban Anda salah");
			System.out.println ("Yang benar adalah " + jawaban);
			System.out.println("Terimakasih");
	    }
	}
}
