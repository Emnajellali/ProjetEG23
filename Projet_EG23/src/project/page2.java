package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class page2 {

	JFrame frame3;
	private JTextField txtRpartirTes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 window = new page2();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public page2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.getContentPane().setBackground(new Color(30, 144, 255));
		frame3.setBounds(100, 100, 1464, 636);
		frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		txtRpartirTes = new JTextField();
		txtRpartirTes.setBounds(156, 10, 1137, 73);
		txtRpartirTes.setToolTipText("");
		txtRpartirTes.setText(" Répartir tes 15 combattants sur les 5 zones de combat ");
		txtRpartirTes.setHorizontalAlignment(SwingConstants.CENTER);
		txtRpartirTes.setForeground(Color.GRAY);
		txtRpartirTes.setFont(new Font("Inter", Font.PLAIN, 40));
		txtRpartirTes.setEditable(false);
		txtRpartirTes.setColumns(10);
		txtRpartirTes.setBackground(new Color(30, 144, 255));
		frame3.getContentPane().add(txtRpartirTes);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(page2.class.getResource("/images/page4.png")));
		lblNewLabel.setBounds(417, 78, 475, 414);
		frame3.getContentPane().add(lblNewLabel);
	}
}
