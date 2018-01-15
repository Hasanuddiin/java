
public class Konversi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long a = 123;
		long a = 998877665544332211L;
	    int b = (int) a; // proses konversi narrowing conversion
	    short c = (short) a;
	    char d = (char) a;

	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);	    
	}
}
