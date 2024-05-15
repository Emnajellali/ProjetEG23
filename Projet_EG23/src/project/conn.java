package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class conn {

	JFrame frame1;
	private JTextField txtInscription;
	private JTextField txtNomEtPrenom;
	private JTextField txtMotDePasse;
	private JLabel lblNewLabel;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conn window = new conn();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public conn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(new Color(30, 144, 255));
		frame1.getContentPane().setLayout(null);
		
		txtInscription = new JTextField();
		txtInscription.setEditable(false);
		txtInscription.setToolTipText("");
		txtInscription.setText("INSCRIPTION");
		txtInscription.setHorizontalAlignment(SwingConstants.CENTER);
		txtInscription.setForeground(Color.RED);
		txtInscription.setFont(new Font("Inter", Font.PLAIN, 40));
		txtInscription.setColumns(10);
		txtInscription.setBackground(new Color(30, 144, 255));
		txtInscription.setBounds(225, 55, 275, 50);
		frame1.getContentPane().add(txtInscription);
		
		txtNomEtPrenom = new JTextField();
		txtNomEtPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNomEtPrenom.setFont(new Font("Inter", Font.PLAIN, 15));
		txtNomEtPrenom.setForeground(new Color(30, 144, 255));
		txtNomEtPrenom.setText("Nom et Prenom");
		txtNomEtPrenom.setBackground(new Color(255, 255, 255));
		txtNomEtPrenom.setBounds(254, 250, 217, 50);
		frame1.getContentPane().add(txtNomEtPrenom);
		txtNomEtPrenom.setColumns(10);
		
		txtMotDePasse = new JTextField();
		txtMotDePasse.setText("Mot de passe");
		txtMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
		txtMotDePasse.setForeground(new Color(30, 144, 255));
		txtMotDePasse.setFont(new Font("Inter", Font.PLAIN, 15));
		txtMotDePasse.setColumns(10);
		txtMotDePasse.setBackground(Color.WHITE);
		txtMotDePasse.setBounds(254, 319, 217, 50);
		frame1.getContentPane().add(txtMotDePasse);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(30, 144, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choisir un filiere", "ISI", "RT", "A2I", "GI", "GM", "MTE", "MM"}));
		comboBox.setBounds(254, 386, 217, 50);
		frame1.getContentPane().add(comboBox);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(conn.class.getResource("/images/image2.png")));
		lblNewLabel.setBounds(329, 117, 66, 123);
		frame1.getContentPane().add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBackground(new Color(119, 136, 153));
		panel.setBounds(221, 142, 283, 340);
		frame1.getContentPane().add(panel);
		frame1.setBounds(100, 100, 739, 653);
		//  lorsque l'utilisateur ferme la fenêtre frame1, elle sera masquée et libérée de la mémoire, mais l'application principale (projet) continuera de s'exécuter.
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
