package project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class conn {

    JFrame frame1;
    private JTextField txtInscription;
    private JTextField txtNomEtPrenom;
    private JPasswordField txtMotDePasse; // Change JTextField to JPasswordField
    private JLabel lblNewLabel;
    private JButton btnJouer;
    private JPanel panel;
    public JFrame frame2;
    private JComboBox<String> comboBox;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/EG23";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

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
        frame1.getContentPane().setBackground(new Color(30, 144, 255));
        frame1.getContentPane().setLayout(null);

        txtInscription = new JTextField();
        txtInscription.setEditable(false);
        txtInscription.setToolTipText("");
        txtInscription.setText("INSCRIPTION");
        txtInscription.setHorizontalAlignment(SwingConstants.CENTER);
        txtInscription.setForeground(Color.RED);
        txtInscription.setFont(new Font("Inter", Font.PLAIN, 40));
        txtInscription.setColumns(10);
        txtInscription.setBackground(new Color(30, 144, 255));
        txtInscription.setBounds(225, 55, 275, 50);
        frame1.getContentPane().add(txtInscription);

        txtNomEtPrenom = new JTextField();
        txtNomEtPrenom.setHorizontalAlignment(SwingConstants.CENTER);
        txtNomEtPrenom.setFont(new Font("Inter", Font.PLAIN, 15));
        txtNomEtPrenom.setForeground(new Color(30, 144, 255));
        txtNomEtPrenom.setText("Nom et Prenom");
        txtNomEtPrenom.setBackground(new Color(255, 255, 255));
        txtNomEtPrenom.setBounds(254, 250, 217, 50);
        addPlaceholderStyle(txtNomEtPrenom);
        txtNomEtPrenom.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtNomEtPrenom.getText().equals("Nom et Prenom")) {
                    txtNomEtPrenom.setText("");
                    removePlaceholderStyle(txtNomEtPrenom);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtNomEtPrenom.getText().isEmpty()) {
                    addPlaceholderStyle(txtNomEtPrenom);
                    txtNomEtPrenom.setText("Nom et Prenom");
                }
            }
        });
        frame1.getContentPane().add(txtNomEtPrenom);
        txtNomEtPrenom.setColumns(10);

        txtMotDePasse = new JPasswordField(); // Use JPasswordField
        txtMotDePasse.setText("Mot de passe");
        txtMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
        txtMotDePasse.setForeground(new Color(30, 144, 255));
        txtMotDePasse.setFont(new Font("Inter", Font.PLAIN, 15));
        txtMotDePasse.setColumns(10);
        txtMotDePasse.setBackground(Color.WHITE);
        txtMotDePasse.setBounds(254, 319, 217, 50);
        addPlaceholderStyle(txtMotDePasse);
        txtMotDePasse.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (new String(txtMotDePasse.getPassword()).equals("Mot de passe")) {
                    txtMotDePasse.setText("");
                    removePlaceholderStyle(txtMotDePasse);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (new String(txtMotDePasse.getPassword()).isEmpty()) {
                    addPlaceholderStyle(txtMotDePasse);
                    txtMotDePasse.setText("Mot de passe");
                }
            }
        });
        frame1.getContentPane().add(txtMotDePasse);

        comboBox = new JComboBox<>();
        comboBox.setForeground(Color.GRAY);
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Choisir un filiere", "ISI", "RT", "A2I", "GI", "GM", "MTE", "MM" }));
        comboBox.setBounds(254, 386, 217, 50);
        frame1.getContentPane().add(comboBox);

        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(conn.class.getResource("/images/image2.png")));
        lblNewLabel.setBounds(329, 117, 66, 123);
        frame1.getContentPane().add(lblNewLabel);

        btnJouer = new JButton("Jouer");
        btnJouer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Enregistrer les données dans la base de données
                String name = txtNomEtPrenom.getText();
                String password = new String(txtMotDePasse.getPassword());
                String filiere = (String) comboBox.getSelectedItem();
                saveToDatabase(name, password, filiere);

                // Créez une instance de votre deuxième cadre (page1)
                page1 nouvellePage1 = new page1();
                frame1.dispose();
                // Rendez le deuxième cadre visible
                nouvellePage1.frame2.setVisible(true);
            }
        });

        btnJouer.setForeground(Color.WHITE);
        btnJouer.setFont(new Font("Inter", Font.PLAIN, 20));
        btnJouer.setBackground(new Color(65, 105, 225));
        btnJouer.setBounds(302, 468, 120, 33);
        frame1.getContentPane().add(btnJouer);

        panel = new JPanel();
        panel.setBackground(new Color(105, 105, 105));
        panel.setBounds(226, 138, 273, 397);
        frame1.getContentPane().add(panel);
        frame1.setBounds(100, 100, 739, 653);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void saveToDatabase(String name, String password, String filiere) {
        String sql = "INSERT INTO users(name, password, filiere) VALUES(?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            pstmt.setString(3, filiere);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void addPlaceholderStyle(JTextField textField) {
        textField.setFont(new Font("Inter", Font.ITALIC, 15));
        textField.setForeground(Color.GRAY);
    }

    private void removePlaceholderStyle(JTextField textField) {
        textField.setFont(new Font("Inter", Font.PLAIN, 15));
        textField.setForeground(Color.BLACK);
    }

    private void addPlaceholderStyle(JPasswordField passwordField) {
        passwordField.setEchoChar((char) 0); // Show text
        passwordField.setFont(new Font("Inter", Font.ITALIC, 15));
        passwordField.setForeground(Color.GRAY);
    }

    private void removePlaceholderStyle(JPasswordField passwordField) {
        passwordField.setEchoChar('•'); // Show bullets
        passwordField.setFont(new Font("Inter", Font.PLAIN, 15));
        passwordField.setForeground(Color.BLACK);
    }

    private static class __Tmp {
        private static void __tmp() {
            javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
        }
    }
}
