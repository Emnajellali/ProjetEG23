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

public class page6 {

	 JFrame frame7;
	 private JTextField txtLeQuar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page6 window = new page6();
					window.frame7.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public page6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame7 = new JFrame();
		frame7.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame7.setBounds(100, 100, 1026, 673);
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.getContentPane().setLayout(null);
		
		JButton btnRetour1 = new JButton("Retour");
		btnRetour1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		// Créez une instance de votre deuxième cadre (conn)
		        page3 nouvellepage = new page3();
		        frame7.dispose();
		        // Rendez le deuxième cadre visible
		        ((Window) nouvellepage.frame4).setVisible(true);
        	}
        });
		btnRetour1.setForeground(Color.WHITE);
		btnRetour1.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour1.setBackground(Color.GRAY);
		btnRetour1.setBounds(419, 603, 173, 33);
		frame7.getContentPane().add(btnRetour1);
		
	    txtLeQuar = new JTextField();
		txtLeQuar.setToolTipText("");
		txtLeQuar.setText("Le Quartier Administratif");
		txtLeQuar.setHorizontalAlignment(SwingConstants.CENTER);
		txtLeQuar.setForeground(new Color(255, 0, 0));
		txtLeQuar.setFont(new Font("Inter", Font.PLAIN, 40));
		txtLeQuar.setEditable(false);
		txtLeQuar.setColumns(10);
		txtLeQuar.setBackground(Color.LIGHT_GRAY);
		txtLeQuar.setBounds(148, 0, 715, 41);
		frame7.getContentPane().add(txtLeQuar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(page4.class.getResource("/images/image9.png")));
		lblNewLabel.setBounds(0, 39, 1010, 560);
		frame7.getContentPane().add(lblNewLabel);
	}

}
