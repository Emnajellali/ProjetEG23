package project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class finale {

    private JFrame frame10;
    private JTextField txtgagnant;
    private JTextField txtNomEtPrenom;
    private JTextField txtFiliere;
    private JTextField txtga;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    finale window = new finale();
                    window.frame10.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public finale() {
        initialize();
        loadLastUser();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame10 = new JFrame();
        frame10.getContentPane().setBackground(Color.WHITE);
        frame10.setAlwaysOnTop(true);
        frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame10.setBounds(100, 100, 728, 666);
        frame10.getContentPane().setLayout(null);

        txtgagnant = new JTextField();
        txtgagnant.setForeground(Color.RED);
        txtgagnant.setBackground(Color.WHITE);
        txtgagnant.setToolTipText("");
        txtgagnant.setText("FELICITATION");
        txtgagnant.setHorizontalAlignment(SwingConstants.CENTER);
        txtgagnant.setFont(new Font("Inter", Font.PLAIN, 45));
        txtgagnant.setEditable(false);
        txtgagnant.setColumns(10);
        txtgagnant.setBounds(147, 76, 426, 48);
        frame10.getContentPane().add(txtgagnant);

        txtNomEtPrenom = new JTextField();
        txtNomEtPrenom.setHorizontalAlignment(SwingConstants.CENTER);
        txtNomEtPrenom.setFont(new Font("Inter", Font.PLAIN, 15));
        txtNomEtPrenom.setForeground(new Color(30, 144, 255));
        //txtNomEtPrenom.setText("Nom et Prenom");
        txtNomEtPrenom.setBackground(new Color(255, 255, 255));
        txtNomEtPrenom.setBounds(254, 250, 217, 50);
        frame10.getContentPane().add(txtNomEtPrenom);
        txtNomEtPrenom.setColumns(10);

        txtFiliere = new JTextField();
        txtFiliere.setHorizontalAlignment(SwingConstants.CENTER);
        txtFiliere.setFont(new Font("Inter", Font.PLAIN, 15));
        txtFiliere.setForeground(new Color(30, 144, 255));
        txtFiliere.setText("Filiere");
        txtFiliere.setBackground(new Color(255, 255, 255));
        txtFiliere.setBounds(254, 319, 217, 50);
        frame10.getContentPane().add(txtFiliere);
        txtFiliere.setColumns(10);

        txtga = new JTextField();
        txtga.setHorizontalAlignment(SwingConstants.CENTER);
        txtga.setFont(new Font("Inter", Font.PLAIN, 15));
        txtga.setForeground(new Color(255, 255, 255));
        txtga.setText("Gagnant");
        txtga.setBackground(new Color(30, 144, 255));
        txtga.setBounds(278, 439, 154, 50);
        frame10.getContentPane().add(txtga);
        txtga.setColumns(10);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(conn.class.getResource("/images/image2.png")));
        lblNewLabel.setBounds(329, 117, 66, 123);
        frame10.getContentPane().add(lblNewLabel);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(105, 105, 105));
        panel.setBounds(226, 138, 273, 279);
        frame10.getContentPane().add(panel);

        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(projet.class.getResource("/images/image1.png")));
        lblNewLabel.setBounds(0, 0, 716, 613);
        frame10.getContentPane().add(lblNewLabel);
        frame10.setBounds(100, 100, 739, 653);
        frame10.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void loadLastUser() {
        String url = "jdbc:mysql://localhost:3306/EG23"; // Changez "EG23" par le nom de votre base de données
        String user = "root"; // Changez "root" par votre nom d'utilisateur MySQL
        String pass = ""; // Changez "" par votre mot de passe MySQL

        String sql = "SELECT name, filiere FROM users ORDER BY id DESC LIMIT 1";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            if (rs.next()) {
                String name = rs.getString("name");
                String filiere = rs.getString("filiere");

                txtNomEtPrenom.setText(name);
                txtFiliere.setText(filiere);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
