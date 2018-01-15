
public class Nested1 {
	public static void main(String[] args) {
		final int MAKS_BARIS = 20;
		
		for(int baris=1; baris <= MAKS_BARIS; baris++)
		{
			for(int bintang=1; bintang <= baris; bintang++)
				System.out.print("*");			
			
			System.out.println();
		}
	}
}
