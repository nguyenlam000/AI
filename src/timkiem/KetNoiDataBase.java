package timkiem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiDataBase {
	
		Connection kn = null;
		
		String url = "jdbc:mysql://localhost:3306/csdl-ai";
		String username ="root";
		String password = "";
	 public Connection ketNoi() {
		 
		 try {
			Class.forName("com.mysql.jdbc.Driver");
	        // khoi tao ket noi den database
				kn = DriverManager.getConnection(url, username, password);
							  
				 // kn.close();
			  		
		} catch (ClassNotFoundException e) {
			System.out.println("ket noi khong thanh cong");
		} catch (SQLException e) {
			System.out.println("Co loi xay ra" +e.getMessage());
		}
		 return kn;
	 }
}
