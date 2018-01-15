import java.util.Scanner;

public class Kondisional2 {
	/**
	 * @param args
	 * Penggunaan kondisional If-else
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan Nilai Anda : ");
		
		data = sc.nextInt();
		
		if (data >= 80)
			System.out.println("Nilai Anda : Excellent");
		else if (data >= 70 && data <80)
			System.out.println("Nilai Anda : Good");
		else if (data >= 60 && data < 70)
			System.out.println("Nilai Anda : Cukup");
		else
			System.out.println("Nilai Anda : Kurang");
	}
}
