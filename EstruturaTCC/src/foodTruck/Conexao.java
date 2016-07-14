package foodTruck;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	static Connection con = null;
	
	//Método de conexão
	public static Connection conecta(){
		
		try{
				
		//Selecionar o JDBC - Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Conectar ao banco de dados
		con = DriverManager.getConnection("jdbc:mysql://localhost/finfood","root","");
		

		System.out.println("conecntou");
		}catch(Exception e){
			System.out.println("Falha ao conectar");
		}
		return con;
	}
}
