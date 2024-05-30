package project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class page5 {

	 JFrame frame6;
	 private JTextField txtLeBureauDes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page5 window = new page5();
					window.frame6.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public page5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame6 = new JFrame();
		frame6.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame6.setBounds(100, 100, 1026, 673);
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.getContentPane().setLayout(null);
		
		JButton btnRetour1 = new JButton("Retour");
		btnRetour1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		// Créez une instance de votre deuxième cadre (conn)
		        page3 nouvellepage = new page3();
		        frame6.dispose();
		        // Rendez le deuxième cadre visible
		        ((Window) nouvellepage.frame4).setVisible(true);
        	}
        });
		btnRetour1.setForeground(Color.WHITE);
		btnRetour1.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour1.setBackground(Color.GRAY);
		btnRetour1.setBounds(419, 603, 173, 33);
		frame6.getContentPane().add(btnRetour1);
		
		txtLeBureauDes = new JTextField();
		txtLeBureauDes.setToolTipText("");
		txtLeBureauDes.setText("Le Bureau des Etudiants");
		txtLeBureauDes.setHorizontalAlignment(SwingConstants.CENTER);
		txtLeBureauDes.setForeground(new Color(255, 0, 0));
		txtLeBureauDes.setFont(new Font("Inter", Font.PLAIN, 40));
		txtLeBureauDes.setEditable(false);
		txtLeBureauDes.setColumns(10);
		txtLeBureauDes.setBackground(Color.LIGHT_GRAY);
		txtLeBureauDes.setBounds(148, 0, 715, 41);
		frame6.getContentPane().add(txtLeBureauDes);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(page4.class.getResource("/images/image9.png")));
		lblNewLabel.setBounds(0, 39, 1010, 560);
		frame6.getContentPane().add(lblNewLabel);
	}
}
