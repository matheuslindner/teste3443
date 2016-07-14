package foodTruck;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQL {
	public boolean verificarLoginAdm(String login,String senha){
		Connection con = null;
		//Pegar senha e usuario do bd
		String sql = "SELECT usuarioMestreJedi FROM METRE_JEDI WHERE senhaMestreJedi = ?  and usuarioMestreJedi = ?";	
		
		try {
			//Conexao
			con = Conexao.conecta();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, senha);
			stmt.setString(2, login);
			ResultSet rs = stmt.executeQuery();
			return rs.isBeforeFirst() ? true : false;
		} catch (Exception e) {
			System.err.println( e.getMessage());
			return false;

		}

		
		
	}
		
	public boolean verificarLoginDono(String login,String senha){
		
		Connection con = null;
		String sql = "SELECT usuarioProprietario FROM PROPRIETARIOS WHERE senhaProprietario = ?  and usuarioProprietario = ?";
		// Criar a Query
		try {
			//Conexao
			con = Conexao.conecta();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, senha);
			stmt.setString(2, login);
			ResultSet rs = stmt.executeQuery();
			return rs.isBeforeFirst() ? true : false;
		} catch (Exception e) {
			System.err.println( e.getMessage());
			return false;
		}
	}	
		
	public void logar() {

		JanelaLoguin obj = new JanelaLoguin();

	}
}
