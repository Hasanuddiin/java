import java.util.Scanner;

public class Nested {
	// Mencari angka yang terkecil
	public static void main (String[] args) {
		int angka1, angka2, angka3, minimal = 0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Masukkan tiga angka :");
		angka1 = scan.nextInt();
		angka2 = scan.nextInt();
		angka3 = scan.nextInt();
		
		if(angka1 < angka2)
			if(angka1 < angka3)
				minimal = angka1;
			else
				minimal = angka3;
		else
			if(angka2 < angka3)
				minimal = angka2;
			else
				minimal = angka3;
		
		System.out.println("Angka terkecil adalah : " + minimal);
	}

}
