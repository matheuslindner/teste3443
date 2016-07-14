package foodTruck;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class LogoImagem {

	public static Image imagem(){
		URL url = Janela0ModeloJanelaParaTodos.class.getResource("/recurso/logo.png");
	    ImageIcon imagemTitulo = new ImageIcon(url);
	    return imagemTitulo.getImage();
	}
	
	public static ImageIcon imageIcon(){
		URL url = Janela0ModeloJanelaParaTodos.class.getResource("/recurso/logo.png");
	    ImageIcon imagemTitulo = new ImageIcon(url);
	    return imagemTitulo;
	}
}
