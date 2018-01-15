import java.sql.*;

public class DatabaseTes {
  public static void main(String args[]){
	String nama = "root";
	String password = "admin";
	String databaseurl = "jdbc:mysql://localhost:3307/mysql";
	Connection con = null;
	try{
	//cek driver Database MySQL
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(databaseurl,nama,password);
		Statement st = con.createStatement();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch(SQLException e) {
		con =null;
	} 
	
	if(con != null){
		System.out.println("Koneksi Berhasil dab!");
	} else {
		System.out.println("Koneksi Tidak Berhasil dab!");
	}
  }
}


/*
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseTes {
public static void main (String[]args) {
try {
Class.forName("com.mysql.jdbc.Driver");
}
catch (Exception ex) {
System.err.println("Error (1): "+ex); System.exit(1);
}

//Bentuk Koneksi

Connection koneksi=null;
try {
koneksi = DriverManager.getConnection ("jdbc:mysql://localhost:3307/mysql","root","admin");

System.out.println("Koneksi berhasil boss...");
}

catch (Exception ex) {
System.out.println("Error (2): "+ex);
System.exit(1);
}
}
}
*/

/*
import java.sql.*;

public class DatabaseTes {
public static void main(String[] args){
try{
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver berhasil ditemukan……");
try{
String url = "jdbc:mysql://localhost:3307/mysql";
String user = "root";
String password = "admin";
Connection koneksi = DriverManager.getConnection(url, user, password);
System.out.println("Buat Koneksi Sukses");
try{
String sql = "SELECT * FROM user";
Statement stat = koneksi.createStatement();
ResultSet set = stat.executeQuery(sql);
while(set.next()){
String judul = set.getString("Host");
System.out.println(judul);
}
System.out.println("Query Sukses");
} catch (Exception e){
System.out.println("Tidak bisa melakukan query");
}
} catch (SQLException ex){
System.out.println("Koneksi gagal ?");
System.out.println("SQLException: " + ex.getMessage());
}
} catch (Exception se){
System.out.println("Driver MySQL tidak ditemukan : " + se);
}
}
}*/