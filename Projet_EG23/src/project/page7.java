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

public class page7 {

  JFrame frame8;
  private JTextField txtLesHalles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page7 window = new page7();
					window.frame8.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public page7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame8 = new JFrame();
		frame8.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame8.setBounds(100, 100, 1026, 673);
		frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame8.getContentPane().setLayout(null);
		
		JButton btnRetour1 = new JButton("Retour");
		btnRetour1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		// Créez une instance de votre deuxième cadre (conn)
		        page3 nouvellepage = new page3();
		        frame8.dispose();
		        // Rendez le deuxième cadre visible
		        ((Window) nouvellepage.frame4).setVisible(true);
        	}
        });
		btnRetour1.setForeground(Color.WHITE);
		btnRetour1.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour1.setBackground(Color.GRAY);
		btnRetour1.setBounds(419, 603, 173, 33);
		frame8.getContentPane().add(btnRetour1);
		
	    txtLesHalles = new JTextField();
	    txtLesHalles.setToolTipText("");
	    txtLesHalles.setText("Les Halles industrielles");
	    txtLesHalles.setHorizontalAlignment(SwingConstants.CENTER);
	    txtLesHalles.setForeground(new Color(255, 0, 0));
	    txtLesHalles.setFont(new Font("Inter", Font.PLAIN, 40));
	    txtLesHalles.setEditable(false);
	    txtLesHalles.setColumns(10);
	    txtLesHalles.setBackground(Color.LIGHT_GRAY);
		txtLesHalles.setBounds(148, 0, 715, 41);
		frame8.getContentPane().add(txtLesHalles);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(page4.class.getResource("/images/image9.png")));
		lblNewLabel.setBounds(0, 39, 1010, 560);
		frame8.getContentPane().add(lblNewLabel);
	}

}