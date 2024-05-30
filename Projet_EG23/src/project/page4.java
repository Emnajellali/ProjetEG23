package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class page4 {

	JFrame frame5;
	private JTextField txtLaBibliothque;
	protected Object frame7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page4 window = new page4();
					window.frame5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public page4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame5 = new JFrame();
		frame5.setBackground(Color.WHITE);
		frame5.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame5.setBounds(100, 100, 1026, 672);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		
		txtLaBibliothque = new JTextField();
		txtLaBibliothque.setToolTipText("");
		txtLaBibliothque.setText("La bibliothèque");
		txtLaBibliothque.setHorizontalAlignment(SwingConstants.CENTER);
		txtLaBibliothque.setForeground(Color.RED);
		txtLaBibliothque.setFont(new Font("Inter", Font.PLAIN, 40));
		txtLaBibliothque.setEditable(false);
		txtLaBibliothque.setColumns(10);
		txtLaBibliothque.setBackground(Color.LIGHT_GRAY);
		txtLaBibliothque.setBounds(148, 0, 715, 41);
		frame5.getContentPane().add(txtLaBibliothque);
		
		JButton btnRetour1 = new JButton("Retour");
		btnRetour1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		// Créez une instance de votre deuxième cadre (conn)
		        page3 nouvellepage = new page3();
		        frame5.dispose();
		        // Rendez le deuxième cadre visible
		        ((Window) nouvellepage.frame4).setVisible(true);
        	}
        });
		btnRetour1.setForeground(Color.WHITE);
		btnRetour1.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour1.setBackground(Color.GRAY);
		btnRetour1.setBounds(419, 602, 173, 33);
		frame5.getContentPane().add(btnRetour1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(page4.class.getResource("/images/image9.png")));
		lblNewLabel.setBounds(0, 38, 1010, 560);
		frame5.getContentPane().add(lblNewLabel);
	}
}
