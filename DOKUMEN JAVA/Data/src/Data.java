
public class Data {

	/**
	 * @param args
	 * Contoh penggunaan beberapa tipe data
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* penggunaan tipe data bilangan bulat*/
		byte a = -45;
		short b = 15000;
		int c = 135000, d;
		
		d = a + b + c;
		
		System.out.println("Hasil penjumalahan = " + d);
		
		/* penggunaan tipe data pecahan*/
		double panjang = 19.5;
		double lebar = 4.13;
		double luas;
		
		luas = panjang * lebar;
		System.out.println("Hasil luas persegi panjang adalah = " + luas);
		
		/* penggunaan tipe data char */
		
		char karakter1 = 89;
		char karakter2 = 'D';
		System.out.println("Tampilan dari karakter pertama = " + karakter1);
		System.out.println("Tampilan dari karakter kedua   = " + karakter2);
		
		karakter2++;
		System.out.println ("Tampilan karakter kedua selanjutnya = " + karakter2);
		
	}

}
