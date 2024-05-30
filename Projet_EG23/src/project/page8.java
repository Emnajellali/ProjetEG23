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

public class page8 {

	JFrame frame9;
	 private JTextField txtLaHalleS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page8 window = new page8();
					window.frame9.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public page8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame9 = new JFrame();
		frame9.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame9.setBounds(100, 100, 1026, 673);
		frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame9.getContentPane().setLayout(null);
		
		JButton btnRetour1 = new JButton("Retour");
		btnRetour1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		// Créez une instance de votre deuxième cadre (conn)
		        page3 nouvellepage = new page3();
		        frame9.dispose();
		        // Rendez le deuxième cadre visible
		        ((Window) nouvellepage.frame4).setVisible(true);
        	}
        });
		btnRetour1.setForeground(Color.WHITE);
		btnRetour1.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour1.setBackground(Color.GRAY);
		btnRetour1.setBounds(419, 603, 173, 33);
		frame9.getContentPane().add(btnRetour1);
		
	    txtLaHalleS = new JTextField();
	    txtLaHalleS.setToolTipText("");
	    txtLaHalleS.setText("La Halle Sportive");
	    txtLaHalleS.setHorizontalAlignment(SwingConstants.CENTER);
	    txtLaHalleS.setForeground(new Color(255, 0, 0));
	    txtLaHalleS.setFont(new Font("Inter", Font.PLAIN, 40));
	    txtLaHalleS.setEditable(false);
	    txtLaHalleS.setColumns(10);
	    txtLaHalleS.setBackground(Color.LIGHT_GRAY);
	    txtLaHalleS.setBounds(148, 0, 715, 41);
		frame9.getContentPane().add(txtLaHalleS);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(page4.class.getResource("/images/image9.png")));
		lblNewLabel.setBounds(0, 39, 1010, 560);
		frame9.getContentPane().add(lblNewLabel);
	}

}