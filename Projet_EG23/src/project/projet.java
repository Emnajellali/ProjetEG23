package project;

import java.awt.EventQueue;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Window.Type;
import javax.swing.DropMode;

public class projet {

	private JFrame frame;
	private JLabel titleLabel;
	private JTextField txtLaBatailleDes;
	private JTextField txtProgrammes;
	public JFrame frame1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					projet window = new projet();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public projet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 735, 650);
		frame.getContentPane().setLayout(null);
		
		txtLaBatailleDes = new JTextField();
		txtLaBatailleDes.setEditable(false);
		txtLaBatailleDes.setForeground(Color.RED);
		txtLaBatailleDes.setBackground(Color.WHITE);
		txtLaBatailleDes.setFont(new Font("Inter", Font.PLAIN, 45));
		txtLaBatailleDes.setHorizontalAlignment(SwingConstants.CENTER);
		txtLaBatailleDes.setToolTipText("");
		txtLaBatailleDes.setText("LA BATAILLE DES ");
		txtLaBatailleDes.setBounds(147, 23, 426, 50);
		frame.getContentPane().add(txtLaBatailleDes);
		txtLaBatailleDes.setBackground(new Color(0, 0, 0, 0));
		txtLaBatailleDes.setColumns(10);
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Créez une instance de votre deuxième cadre (conn)
		        conn nouvelleConnexion = new conn();
		        frame.dispose();
		        // Rendez le deuxième cadre visible
		        nouvelleConnexion.frame1.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Inter", Font.PLAIN, 20));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBounds(264, 544, 193, 48);
		frame.getContentPane().add(btnNewButton);
		
		txtProgrammes = new JTextField();
		txtProgrammes.setForeground(Color.RED);
		txtProgrammes.setBackground(Color.WHITE);
		txtProgrammes.setToolTipText("");
		txtProgrammes.setText("PROGRAMMES");
		txtProgrammes.setHorizontalAlignment(SwingConstants.CENTER);
		txtProgrammes.setFont(new Font("Inter", Font.PLAIN, 45));
		txtProgrammes.setBackground(new Color(0, 0, 0, 0));
		txtProgrammes.setEditable(false);
		txtProgrammes.setColumns(10);
		txtProgrammes.setBounds(147, 76, 426, 48);
		frame.getContentPane().add(txtProgrammes);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(projet.class.getResource("/images/image1.png")));
		lblNewLabel.setBounds(0, 0, 721, 613);
		frame.getContentPane().add(lblNewLabel);
		
		
    }
	}
	
    