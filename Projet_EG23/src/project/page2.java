package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class page2 {

	JFrame frame3;
	public JFrame frame4;
	private JTextField txtRpartirTes;
	private JTextField textField_1;
	private JTextField txtLaBibliothque;
	private JTextField txtLeBureauDes;
	private JTextField textField_2;
	private JTextField txtLeQuartierAdministratif;
	private JTextField textField_3;
	private JTextField txtLesHallesIndustrielles;
	private JTextField textField;
	private JTextField txtLaHalleSportive;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private Point imageInitialLocation;
	// private int sum = 0;
	 private int nbCombattantsZone1 = 0;
	    private int nbCombattantsZone2 = 0;
	    private int nbCombattantsZone3 = 0;
	    private int nbCombattantsZone4 = 0;
	    private int nbCombattantsZone5 = 0;
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

		JLabel lblImage1 = new JLabel("");
		lblImage1.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		lblImage1.setBounds(33, 123, 50, 88);

		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1);

		JLabel lblImage1_1 = new JLabel("");
		lblImage1_1.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
		lblImage1_1.setBounds(117, 123, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_1);

		JLabel lblImage1_2 = new JLabel("");
		lblImage1_2.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
		lblImage1_2.setBounds(200, 123, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_2);

		JLabel lblImage1_3 = new JLabel("");
		lblImage1_3.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
		lblImage1_3.setBounds(286, 123, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_3);

		JLabel lblImage1_4 = new JLabel("");
		lblImage1_4.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_4.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
		lblImage1_4.setBounds(33, 242, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_4);

		JLabel lblImage1_5 = new JLabel("");
		lblImage1_5.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_5.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
		lblImage1_5.setBounds(117, 242, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_5);

		JLabel lblImage1_6 = new JLabel("");
		lblImage1_6.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_6.setBounds(200, 242, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_6);

		JLabel lblImage1_7 = new JLabel("");
		lblImage1_7.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_7.setBounds(286, 242, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_7);

		JLabel lblImage1_8 = new JLabel("");
		lblImage1_8.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_8.setBounds(376, 123, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_8.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_8);

		JLabel lblImage1_9 = new JLabel("");
		lblImage1_9.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_9.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_9.setBounds(376, 242, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_9.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_9);

		JLabel lblImage1_10 = new JLabel("");
		lblImage1_10.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_10.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_10.setBounds(1279, 99, 50, 88);
		frame3.getContentPane().add(lblImage1_10);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_10.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_10);

		JLabel lblImage1_11 = new JLabel("");
		lblImage1_11.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_11.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_11.setBounds(1025, 99, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_11.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_11);

		JLabel lblImage1_12 = new JLabel("");
		lblImage1_12.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_12.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_12.setBounds(1114, 99, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_12.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_12);

		JLabel lblImage1_13 = new JLabel("");
		lblImage1_13.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_13.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_13.setBounds(1197, 99, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_13.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_13);

		JLabel lblImage1_14 = new JLabel("");
		lblImage1_14.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_14.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_14.setBounds(1360, 99, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_14.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_14);

		JLabel lblImage1_11_1 = new JLabel("");
		lblImage1_11_1.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_11_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_11_1.setBounds(1025, 218, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_11_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_11_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_11_1);

		JLabel lblImage1_11_2 = new JLabel("");
		lblImage1_11_2.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_11_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_11_2.setBounds(1114, 218, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_11_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_11_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_11_2);

		JLabel lblImage1_11_3 = new JLabel("");
		lblImage1_11_3.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_11_3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_11_3.setBounds(1197, 218, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_11_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_11_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_11_3);

		JLabel lblImage1_11_4 = new JLabel("");
		lblImage1_11_4.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_11_4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_11_4.setBounds(1279, 218, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_11_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});
		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_11_4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_11_4);

		JLabel lblImage1_11_5 = new JLabel("");
		lblImage1_11_5.setIcon(new ImageIcon(page2.class.getResource("/images/image6.png")));
		lblImage1_11_5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblImage1_11_5.setBounds(1360, 218, 50, 88);
		// Add a MouseListener to track the initial location when the mouse is pressed
		lblImage1_11_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imageInitialLocation = e.getPoint();
			}
		});

		// Add a MouseMotionListener to update the position of the JLabel as it is
		// dragged
		lblImage1_11_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				Point location = label.getLocation();
				int x = location.x - imageInitialLocation.x + e.getX();
				int y = location.y - imageInitialLocation.y + e.getY();
				label.setLocation(x, y);
			}
		});

		// Add the JLabel to the frame
		frame3.getContentPane().add(lblImage1_11_5);
	
		

		textField_1 = new JTextField();
		textField_1.setBounds(308, 482, 50, 40);
		frame3.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		txtLaBibliothque = new JTextField();
		txtLaBibliothque.setToolTipText("");
		txtLaBibliothque.setText("La bibliothèque");
		txtLaBibliothque.setHorizontalAlignment(SwingConstants.CENTER);
		txtLaBibliothque.setForeground(Color.RED);
		txtLaBibliothque.setFont(new Font("Inter", Font.PLAIN, 20));
		txtLaBibliothque.setEditable(false);
		txtLaBibliothque.setColumns(10);
		txtLaBibliothque.setBackground(Color.LIGHT_GRAY);
		txtLaBibliothque.setBounds(41, 478, 241, 40);
		frame3.getContentPane().add(txtLaBibliothque);

		txtLeBureauDes = new JTextField();
		txtLeBureauDes.setToolTipText("");
		txtLeBureauDes.setText("Le Bureau des Etudiants");
		txtLeBureauDes.setHorizontalAlignment(SwingConstants.CENTER);
		txtLeBureauDes.setForeground(Color.RED);
		txtLeBureauDes.setFont(new Font("Inter", Font.PLAIN, 20));
		txtLeBureauDes.setEditable(false);
		txtLeBureauDes.setColumns(10);
		txtLeBureauDes.setBackground(Color.LIGHT_GRAY);
		txtLeBureauDes.setBounds(41, 528, 241, 40);
		frame3.getContentPane().add(txtLeBureauDes);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(308, 532, 50, 40);
		frame3.getContentPane().add(textField_2);

		txtLeQuartierAdministratif = new JTextField();
		txtLeQuartierAdministratif.setToolTipText("");
		txtLeQuartierAdministratif.setText("Le Quartier Administratif");
		txtLeQuartierAdministratif.setHorizontalAlignment(SwingConstants.CENTER);
		txtLeQuartierAdministratif.setForeground(Color.RED);
		txtLeQuartierAdministratif.setFont(new Font("Inter", Font.PLAIN, 20));
		txtLeQuartierAdministratif.setEditable(false);
		txtLeQuartierAdministratif.setColumns(10);
		txtLeQuartierAdministratif.setBackground(Color.LIGHT_GRAY);
		txtLeQuartierAdministratif.setBounds(500, 528, 382, 40);
		frame3.getContentPane().add(txtLeQuartierAdministratif);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(907, 528, 50, 40);
		frame3.getContentPane().add(textField_3);

		txtLesHallesIndustrielles = new JTextField();
		txtLesHallesIndustrielles.setToolTipText("");
		txtLesHallesIndustrielles.setText("Les Halles industrielles");
		txtLesHallesIndustrielles.setHorizontalAlignment(SwingConstants.CENTER);
		txtLesHallesIndustrielles.setForeground(Color.RED);
		txtLesHallesIndustrielles.setFont(new Font("Inter", Font.PLAIN, 20));
		txtLesHallesIndustrielles.setEditable(false);
		txtLesHallesIndustrielles.setColumns(10);
		txtLesHallesIndustrielles.setBackground(Color.LIGHT_GRAY);
		txtLesHallesIndustrielles.setBounds(1016, 478, 241, 40);
		frame3.getContentPane().add(txtLesHallesIndustrielles);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(1279, 478, 50, 40);
		frame3.getContentPane().add(textField);

		txtLaHalleSportive = new JTextField();
		txtLaHalleSportive.setToolTipText("");
		txtLaHalleSportive.setText("La Halle Sportive");
		txtLaHalleSportive.setHorizontalAlignment(SwingConstants.CENTER);
		txtLaHalleSportive.setForeground(Color.RED);
		txtLaHalleSportive.setFont(new Font("Inter", Font.PLAIN, 20));
		txtLaHalleSportive.setEditable(false);
		txtLaHalleSportive.setColumns(10);
		txtLaHalleSportive.setBackground(Color.LIGHT_GRAY);
		txtLaHalleSportive.setBounds(1016, 528, 241, 40);
		frame3.getContentPane().add(txtLaHalleSportive);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(1279, 528, 50, 40);
		frame3.getContentPane().add(textField_4);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.GRAY);
		panel.setBounds(24, 465, 1401, 124);
		frame3.getContentPane().add(panel);

		textField_6 = new JTextField();
		textField_6.setToolTipText("");
		textField_6.setText("2");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setForeground(Color.RED);
		textField_6.setFont(new Font("Inter", Font.PLAIN, 20));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(559, 211, 25, 40);
		frame3.getContentPane().add(textField_6);

		textField_5 = new JTextField();
		textField_5.setToolTipText("");
		textField_5.setText("3");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.RED);
		textField_5.setFont(new Font("Inter", Font.PLAIN, 20));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(924, 246, 25, 40);
		frame3.getContentPane().add(textField_5);

		textField_7 = new JTextField();
		textField_7.setToolTipText("");
		textField_7.setText("4");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setForeground(Color.RED);
		textField_7.setFont(new Font("Inter", Font.PLAIN, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setBounds(924, 333, 25, 40);
		frame3.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setToolTipText("");
		textField_8.setText("5");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setForeground(Color.RED);
		textField_8.setFont(new Font("Inter", Font.PLAIN, 20));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.LIGHT_GRAY);
		textField_8.setBounds(658, 114, 25, 40);
		frame3.getContentPane().add(textField_8);

		textField_9 = new JTextField();
		textField_9.setToolTipText("");
		textField_9.setText("1");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setForeground(Color.RED);
		textField_9.setFont(new Font("Inter", Font.PLAIN, 20));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.LIGHT_GRAY);
		textField_9.setBounds(579, 266, 25, 40);
		frame3.getContentPane().add(textField_9);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(page2.class.getResource("/images/page4.png")));
		lblNewLabel.setBounds(487, 93, 475, 370);
		frame3.getContentPane().add(lblNewLabel);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	
	        		// Créez une instance de votre deuxième cadre (conn)
			        page1 nouvellepage = new page1();
			        frame3.dispose();
			        // Rendez le deuxième cadre visible
			        nouvellepage.frame2.setVisible(true);
	        	}
	        });
		btnRetour.setForeground(Color.WHITE);
		btnRetour.setFont(new Font("Inter", Font.PLAIN, 20));
		btnRetour.setBackground(Color.GRAY);
		btnRetour.setBounds(133, 374, 173, 65);
		frame3.getContentPane().add(btnRetour);
		
		JButton btnJouer = new JButton("Jouer");
		btnJouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Créez une instance de votre deuxième cadre (conn)
		        page3 nouvellepage = new page3();
		        
				frame3.dispose();
		        // Rendez le deuxième cadre visible
		        nouvellepage.frame4.setVisible(true);

			}
		});
		btnJouer.setForeground(Color.WHITE);
		btnJouer.setFont(new Font("Inter", Font.PLAIN, 20));
		btnJouer.setBackground(Color.GRAY);
		btnJouer.setBounds(1135, 374, 173, 65);
		frame3.getContentPane().add(btnJouer);
	}
}
