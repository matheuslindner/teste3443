package foodTruck;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.event.ListDataListener;
import javax.swing.text.DefaultCaret;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Janela3CadastroEmpresa extends Janela0ModeloJanelaParaTodos {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	public Janela3CadastroEmpresa(){
		
		JLabel lblDadosDoFoodtruck = new JLabel("Dados do FoodTruck");
		lblDadosDoFoodtruck.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		lblDadosDoFoodtruck.setBounds(139, 129, 191, 42);
		getContentPane().add(lblDadosDoFoodtruck);
		
		JLabel lblNewLabel = new JLabel("Nome FoodTruck");
		lblNewLabel.setBounds(139, 188, 106, 29);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone ");
		lblNewLabel_1.setBounds(139, 252, 59, 29);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CNPJ");
		lblNewLabel_2.setBounds(139, 314, 32, 30);
		getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(139, 390, 151, 29);
		comboBox.addItem("Tipo de cozinha");
		comboBox.addItem("TIPO 1");
		comboBox.addItem("TIPO 2");
		comboBox.addItem("TIPO 3");
		
		getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(139, 221, 151, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 280, 118, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(139, 339, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDadosDoProprietrio = new JLabel("Dados do Propriet\u00E1rio");
		lblDadosDoProprietrio.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		lblDadosDoProprietrio.setBounds(487, 129, 267, 42);
		getContentPane().add(lblDadosDoProprietrio);
		
		JLabel lblNewLabel_3 = new JLabel("Nome");
		lblNewLabel_3.setBounds(487, 195, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("E-mail");
		lblNewLabel_4.setBounds(487, 259, 59, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CPF");
		lblNewLabel_5.setBounds(487, 322, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RG");
		lblNewLabel_6.setBounds(637, 322, 46, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(487, 377, 59, 14);
		getContentPane().add(lblTelefone);
		
		textField_3 = new JTextField();
		textField_3.setBounds(487, 221, 151, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(487, 280, 151, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(487, 339, 118, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(637, 339, 86, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(487, 394, 106, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JRadioButton rdbtnVocAceitaOs = new JRadioButton("Voc\u00EA aceita os termos blablabla");
		rdbtnVocAceitaOs.setBounds(52, 530, 219, 23);
		getContentPane().add(rdbtnVocAceitaOs);
		
		JLabel lblInformeOsDados = new JLabel("Preencha os campos");
		lblInformeOsDados.setFont(new Font("Sitka Text", Font.PLAIN, 26));
		lblInformeOsDados.setBounds(271, 76, 276, 42);
		getContentPane().add(lblInformeOsDados);
		
		JButton btnConfirmar = new JButton("Enviar solicitação");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirmar.setBounds(516, 500, 142, 23);
		getContentPane().add(btnConfirmar);
		
		JTextArea txtTermos = new JTextArea();
		txtTermos.setText("Voc\u00EA aceita os termos por que voce aceita\r\nVoc\u00EA aceita os termos por que voce aceita\r\nVoc\u00EA aceita os termos por que voce aceita\r\nVoc\u00EA aceita os termos por que voce aceita\r\nVoc\u00EA aceita os termos por que voce aceita");
		txtTermos.setEditable(false);
		txtTermos.setToolTipText("");
		DefaultCaret caret = (DefaultCaret)txtTermos.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

		JScrollPane	scrollpane = new JScrollPane();
		scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollpane.add(txtTermos);
		scrollpane.setViewportView(txtTermos);
		scrollpane.setBounds(52, 441, 260, 82);
		scrollpane.setVisible(true);
			
		
		getContentPane().add(scrollpane);
		
		}
}
