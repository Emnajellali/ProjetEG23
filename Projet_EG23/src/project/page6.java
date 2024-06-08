package project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import project.page4.CircleImagePanel;
import project.page4.CustomPanel;

public class page6 {

	 JFrame frame7;
	 private JTextField txtLeQuar;
	 private Image image;
	    private int[] values;

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
		frame7.setBackground(Color.WHITE);
		frame7.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame7.setBounds(100, 100, 1026, 672);
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.getContentPane().setLayout(null);		
		
		
		
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
		
		 // Load the background image for the main panel
        Image backgroundImage = new ImageIcon(getClass().getResource("/images/image9.png")).getImage();

        CustomPanel mainPanel = new CustomPanel(backgroundImage);
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Load the image once
        java.net.URL imageUrl = getClass().getResource("/images/image6.png");
        if (imageUrl != null) {
            image = new ImageIcon(imageUrl).getImage();
        } else {
            System.err.println("Image not found: /images/image6.png");
            image = new ImageIcon().getImage(); // Use a placeholder or default image
        }

        // Create and add rows with values from the database
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EG23", "root", "");
            Statement statement = connection.createStatement();
            String query = "SELECT pointsDeVie, `force`, dexterite, resistance, constitution, initiative FROM combattants Where zone='quartier'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int[] values = new int[6];
                for (int i = 0; i < 6; i++) {
                    values[i] = resultSet.getInt(i + 1);
                }
                CircleImagePanel rowPanel = new CircleImagePanel(image, values);
                mainPanel.add(rowPanel);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setBounds(0, 38, 1010, 560);
        frame7.getContentPane().add(scrollPane);
    }

    // Custom JPanel class to draw the background image
    class CustomPanel extends JPanel {
        private Image backgroundImage;

        public CustomPanel(Image backgroundImage) {
            this.backgroundImage = backgroundImage;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }

    class CircleImagePanel extends JPanel {
        private static final int CIRCLE_DIAMETER = 50;
        private static final int IMAGE_WIDTH = 100;
        private static final int IMAGE_HEIGHT = 100;

        private Image image;
        private int[] values;

        public CircleImagePanel(Image image, int[] values) {
            this.image = image;
            this.values = values;
            setPreferredSize(new Dimension(800, 150));
            setOpaque(false); // Make sure the panel is transparent
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Draw the image
            g.drawImage(image, 10, 25, IMAGE_WIDTH, IMAGE_HEIGHT, this);

            // Draw the circles with values and corresponding colors
            for (int i = 0; i < values.length; i++) {
                int x = 130 + i * (CIRCLE_DIAMETER + 20);
                int y = 50;
                Ellipse2D circle = new Ellipse2D.Double(x, y, CIRCLE_DIAMETER, CIRCLE_DIAMETER);

                // Set color to gray for all circles
                g2d.setColor(Color.GRAY);
                g2d.fill(circle);

                // Draw the value inside the circle
                g2d.setColor(Color.BLACK); // Text color
                g2d.drawString(String.valueOf(values[i]), x + 15, y + 30);
            }
        }
    }

	

}
