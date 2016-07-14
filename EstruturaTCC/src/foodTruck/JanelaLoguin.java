package foodTruck;
import java.awt.Button;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import java.awt.Color;


public class JanelaLoguin implements KeyListener, ActionListener {
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	private JFrame frmLogin;
	private JButton btnEntrar;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void Login(){	
		frmLogin = new JFrame("Login");
		frmLogin.getContentPane().setBackground(new Color(255, 0, 51));
		frmLogin.setSize(289,162);
		frmLogin.setVisible(true);
		frmLogin.setLocationRelativeTo(null);
		frmLogin.getContentPane().setLayout(null);
		
		//Rotulo para logo no login
		JLabel rotuloIcone = new JLabel();
		rotuloIcone.setBounds(178, -4, 75, 85);
		ImageIcon icon = LogoImagem.imageIcon();
		icon.setImage(icon.getImage().getScaledInstance(75,85, 100));
		rotuloIcone.setIcon(icon);


		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsuario.setBounds(10, 26, 71, 14);
		frmLogin.getContentPane().add(lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(70, 23, 86, 20);
		frmLogin.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSenha.setBounds(10, 67, 46, 14);
		frmLogin.getContentPane().add(lblSenha);

		txtSenha = new JPasswordField();
		txtSenha.setBounds(70, 67, 86, 20);
		frmLogin.getContentPane().add(txtSenha);

		btnEntrar = new JButton("Entrar");
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setBounds(99, 92, 89, 23);
		frmLogin.getContentPane().add(btnEntrar);

		JButton btnEsqueci = new JButton("Esqueceu sua senha?");
		btnEsqueci.setBackground(Color.WHITE);
		btnEsqueci.setBounds(70, 117, 163, 14);
		frmLogin.getContentPane().add(btnEsqueci);
		frmLogin.setResizable(false);

		btnEntrar.addActionListener(this);
		txtUsuario.addKeyListener(this);
		txtSenha.addKeyListener(this);

		frmLogin.getContentPane().add(rotuloIcone);

	}

	//login com enter

	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER){
			btnEntrar.doClick(1);
		}

	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("Entrar")){
			SQL obj = new SQL();
			String login = txtUsuario.getText().toString(), password = String.valueOf(txtSenha.getPassword());
			if(obj.verificarLoginDono(login, password)){
				//janela dos donos
				frmLogin.dispose();
			}else{
				if(obj.verificarLoginAdm(login, password)){
					//Aqui vai a tela dos MESTRES JEDI
					frmLogin.dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Login Inválido");
				}
			}
		}

	}


}



