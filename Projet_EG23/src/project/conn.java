package project;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class conn {

	JFrame frame1;

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
		frame1.setBounds(100, 100, 450, 300);
		//  lorsque l'utilisateur ferme la fenêtre frame1, elle sera masquée et libérée de la mémoire, mais l'application principale (projet) continuera de s'exécuter.
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}
