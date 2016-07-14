package foodTruck;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;


public class SplashPrincipal extends JFrame {
	private static JProgressBar progressBar = new JProgressBar();
	private JPanel contentPane;

	public static void main(String[] args) {
		SplashPrincipal sp = new SplashPrincipal();
		sp.setVisible(true);
		carregar();
		sp.dispose(); 
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try{

					Janela1MenuUSUARIO obj = new Janela1MenuUSUARIO();
					obj.setVisible(true);
					
				}catch(Exception e ){
					System.out.println("Falha"+e);
				}

			}
		});
	}
	/**
	 * Create the frame.
	 */
	public SplashPrincipal() {
		setType(Type.UTILITY);
		setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 388, 396);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		progressBar.setStringPainted(true);
		carregar();
		//JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(new Color(255, 0, 0));

JLabel lblNewLabel = new JLabel("");
		
		//ADICIONA A IMAGEM NA JANELA E REDIMENCIONA
		ImageIcon icon = LogoImagem.imageIcon();
		icon.setImage(icon.getImage().getScaledInstance(388,330, 100));
		lblNewLabel.setIcon(icon);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
					.addGap(24))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public static void carregar(){

		for (int i = 0; i < 101; i++) {

			try {
				Thread.sleep(10);
				progressBar.setValue(i);

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "falha"+e);
				e.printStackTrace();
			} 
		}
	}
}
