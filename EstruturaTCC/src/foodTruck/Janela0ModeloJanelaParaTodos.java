package foodTruck;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Component;

public class Janela0ModeloJanelaParaTodos extends JFrame {

	public Janela0ModeloJanelaParaTodos(){
		getContentPane().setBackground(Color.WHITE);
		//Criando a janela
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		getContentPane().setLayout(null);
		this.setIconImage(LogoImagem.imagem());


		//botao cadastrar
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setBounds(170, 10, 120, 25);
		btnCadastrar.setBorder(null);
		
		
		
		
		
		btnCadastrar.setBorder(new BotaoRedondo(18));
		getContentPane().add(btnCadastrar);
		btnCadastrar.setBorder(new BotaoRedondo(18));
		
		btnCadastrar.addActionListener(new ActionListener() {
			
		
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
			Janela3CadastroEmpresa obj = new Janela3CadastroEmpresa();
				
			}
		});

		

		//Botão para a area restrita
		JButton areaRestrita = new JButton("Area restrita");
		areaRestrita.setBackground(Color.WHITE);
		areaRestrita.setBounds(670, 10, 120, 25);
		getContentPane().add(areaRestrita);

		areaRestrita.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JanelaLoguin jl = new JanelaLoguin();
				jl.Login();
			}
		});

	}
		//Btn redondo
	private static class BotaoRedondo implements Border {
	
	    private int radius;


	    BotaoRedondo (int radius) {
	        this.radius = radius;
	    }


	    public Insets getBorderInsets(Component c) {
	       
	    	return new Insets(this.radius+2, this.radius+2, this.radius+4, this.radius);
	   
	    }


	    public boolean isBorderOpaque() {
	        return true;
	    }


	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}
}


