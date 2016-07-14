package foodTruck;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;


public class Janela1MenuUSUARIO extends Janela0ModeloJanelaParaTodos {

	
	
	public Janela1MenuUSUARIO(){
		setForeground(Color.RED);
		getContentPane().setBackground(Color.RED);
		setSize(800, 400);
	
		JComboBox<String> comboBairro = new JComboBox<>();
		comboBairro.setBounds(297, 178, 230, 40);
		comboBairro.addItem("Escolha um bairro");
		
		//Try/Catch
		try{
			//Preparar a conexão com o banco de dados
			Statement stmt = conexao().createStatement();
			
			//SQL
			String sql = "SELECT nomeBairro FROM bairros";
			
			//Listar cada elemento
			ResultSet rs = stmt.executeQuery(sql);
			
			//Laço
			while(rs.next()){
				comboBairro.addItem(rs.getString("nomeBairro"));
			}
		
		
		}catch(Exception erro){
			System.out.println("Falha"+erro);
		}
		
		//Criar evento no combo Bairro.
		comboBairro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Capturar selecionado 
				int indiceBairro = comboBairro.getSelectedIndex();
				
				
				
			}
		});
		
		
		
		
		
		getContentPane().add(comboBairro);
		
	}
	
	//Método de conexão
		public static Connection conexao(){

			Connection conectar = null;
			
			//Tentar realizar uma conexão com o banco de dados
			try{

				//Selecionar o driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//Selecionando a base de dados e o servidor
				conectar = DriverManager.getConnection("jdbc:mysql://localhost/finfood","root","");
				
			//Classe de conexгo nгo encontrada
			}catch(Exception erro){
				System.out.println("Falha ao conectar");
			}
			return conectar;
			

		}
}
