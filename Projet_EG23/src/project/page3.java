package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class page3 {

	JFrame frame4;
	protected Object frame2;
	protected Object frame3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page3 window = new page3();
					window.frame4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public page3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame4 = new JFrame();
		frame4.getContentPane().setForeground(Color.WHITE);
		frame4.setBackground(Color.WHITE);
		frame4.setBounds(100, 100, 1266, 752);
		frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		JButton btnRetour = new JButton("5");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page8 nouvellepage = new page8();
		        frame4.dispose();
		        // Rendez le deuxième cadre visible
		        nouvellepage.frame9.setVisible(true);
			}
		});
		
		JButton btnRetour1 = new JButton("Retour");
		btnRetour1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		// Créez une instance de votre deuxième cadre (conn)
		        page2 nouvellepage = new page2();
		        frame4.dispose();
		        // Rendez le deuxième cadre visible
		        ((Window) nouvellepage.frame3).setVisible(true);
        	}
        });
		btnRetour1.setForeground(Color.RED);
		btnRetour1.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour1.setBackground(Color.LIGHT_GRAY);
		btnRetour1.setBounds(539, 575, 173, 55);
		frame4.getContentPane().add(btnRetour1);
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour.setBackground(Color.LIGHT_GRAY);
		btnRetour.setBounds(423, 56, 52, 71);
		frame4.getContentPane().add(btnRetour);
		
		JButton btnRetour_1 = new JButton("2");
		btnRetour_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

        	
		        page5 nouvellepage = new page5();
		        frame4.dispose();
		        // Rendez le deuxième cadre visible
		        nouvellepage.frame6.setVisible(true);
			}
		});
		btnRetour_1.setForeground(Color.RED);
		btnRetour_1.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour_1.setBackground(Color.LIGHT_GRAY);
		btnRetour_1.setBounds(214, 219, 52, 71);
		frame4.getContentPane().add(btnRetour_1);
		
		JButton btnRetour_1_1 = new JButton("1");
		btnRetour_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

        	
		        page4 nouvellepage = new page4();
		        frame4.dispose();
		        // Rendez le deuxième cadre visible
		        nouvellepage.frame5.setVisible(true);
			}
		});
		btnRetour_1_1.setForeground(Color.RED);
		btnRetour_1_1.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour_1_1.setBackground(Color.LIGHT_GRAY);
		btnRetour_1_1.setBounds(266, 319, 45, 65);
		frame4.getContentPane().add(btnRetour_1_1);
		
		JButton btnRetour_1_1_1 = new JButton("3");
		btnRetour_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page6 nouvellepage = new page6();
		        frame4.dispose();
		        // Rendez le deuxième cadre visible
		        ((Window) nouvellepage.frame7).setVisible(true);
			}
		});
		btnRetour_1_1_1.setForeground(Color.RED);
		btnRetour_1_1_1.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnRetour_1_1_1.setBounds(1097, 302, 52, 65);
		frame4.getContentPane().add(btnRetour_1_1_1);
		
		JButton btnRetour_2 = new JButton("4");
		btnRetour_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page7 nouvellepage = new page7();
		        frame4.dispose();
		        // Rendez le deuxième cadre visible
		        ((Window) nouvellepage.frame8).setVisible(true);
			}
		});
		btnRetour_2.setForeground(Color.RED);
		btnRetour_2.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour_2.setBackground(Color.LIGHT_GRAY);
		btnRetour_2.setBounds(1097, 431, 52, 65);
		frame4.getContentPane().add(btnRetour_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(page3.class.getResource("/images/page32.png")));
		lblNewLabel.setBounds(10, 10, 1205, 676);
		frame4.getContentPane().add(lblNewLabel);
		
	}
}
