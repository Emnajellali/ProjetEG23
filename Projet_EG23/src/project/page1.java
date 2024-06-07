package project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class page1 {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/EG23";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    
    JFrame frame2;
    private JTextField txtAffecterLesPoints;
    private int totalPoints = 400; // Initialize total points
    private JButton btnJouer;
    public JFrame frame3;
    private Map<Integer, Combatant> combatants = new HashMap<>(); // Store combatants by ID

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    page1 window = new page1();
                    window.frame2.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public page1() {
        createNewTable();
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame2 = new JFrame();
        frame2.getContentPane().setBackground(new Color(30, 144, 255));
        frame2.getContentPane().setLayout(null);

        // Create labels for each image with a border and a click event
        createCombatantLabel(0, 10, 80);
        createCombatantLabel(1, 179, 80);
        createCombatantLabel(2, 348, 80);
        createCombatantLabel(3, 517, 80);
        createCombatantLabel(4, 691, 80);
        createCombatantLabel(5, 864, 80);
        createCombatantLabel(6, 1040, 80);
        createCombatantLabel(7, 10, 260);
        createCombatantLabel(8, 179, 260);
        createCombatantLabel(9, 348, 260);
        createCombatantLabel(10, 517, 260);
        createCombatantLabel(11, 691, 260);
        createCombatantLabel(12, 864, 260);
        createCombatantLabel(13, 1040, 260);
        createCombatantLabel(14, 10, 440);
        createCombatantLabel(15, 179, 440);
        createCombatantLabel(16, 348, 440);
        createCombatantLabel(17, 517, 440);
        createCombatantLabel(18, 691, 440);
        createCombatantLabel(19, 864, 440);
     

        // Bouton "Jouer"
        btnJouer = new JButton("400"); // Set initial text to totalPoints
        btnJouer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnJouer.getText().equals("Commencer")) {
                    page2 nouvellepage = new page2();
                    frame2.dispose();
                    nouvellepage.frame3.setVisible(true);
                }
            }
        });
        btnJouer.setForeground(Color.WHITE);
        btnJouer.setFont(new Font("Inter", Font.PLAIN, 20));
        btnJouer.setBackground(new Color(128, 128, 128));
        btnJouer.setBounds(1031, 521, 163, 65); // Adjusted position
        frame2.getContentPane().add(btnJouer);

        // Champ de texte
        txtAffecterLesPoints = new JTextField();
        txtAffecterLesPoints.setToolTipText("");
        txtAffecterLesPoints.setText("Affecter les points pour tes COMBATTANTS ");
        txtAffecterLesPoints.setHorizontalAlignment(SwingConstants.CENTER);
        txtAffecterLesPoints.setForeground(new Color(128, 128, 128));
        txtAffecterLesPoints.setFont(new Font("Inter", Font.PLAIN, 40));
        txtAffecterLesPoints.setEditable(false);
        txtAffecterLesPoints.setColumns(10);
        txtAffecterLesPoints.setBackground(new Color(30, 144, 255));
        txtAffecterLesPoints.setBounds(190, 20, 896, 50);
        frame2.getContentPane().add(txtAffecterLesPoints);

        // Configuration de la fenêtre principale
        frame2.setBounds(100, 100, 1236, 753);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void createCombatantLabel(int id, int x, int y) {
        JLabel lblImage = new JLabel("");
        lblImage.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage.setBounds(x, y, 150, 170);

        // Modifier la couleur de la bordure en fonction de l'ID
        if (id == 0) {
            lblImage.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); // Premier cadre en rouge
        } else if (id >= 1 && id <= 5) {
            lblImage.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2)); // 5 cadres suivants en vert
        } else {
            lblImage.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Les autres en noir
        }

        lblImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog(id);
            }
        });
        frame2.getContentPane().add(lblImage);
        combatants.put(id, new Combatant(id)); // Initialize combatant with ID
    }


    // Méthode pour afficher une boîte de dialogue avec plusieurs champs de texte
    private void showInputDialog(int combatantId) throws NumberFormatException {
    	
        Combatant combatant = combatants.get(combatantId); // Get the combatant by ID

        // Créer un panel avec un layout grid pour organiser les champs de texte
        JPanel panel = new JPanel(new GridLayout(0, 1));
        JTextField pointsDeVieField = new JTextField(String.valueOf(combatant.getPointsDeVie()));
        JTextField forceField = new JTextField(String.valueOf(combatant.getForce()));
        JTextField dexteriteField = new JTextField(String.valueOf(combatant.getDextérité()));
        JTextField resistanceField = new JTextField(String.valueOf(combatant.getRésistance()));
        JTextField constitutionField = new JTextField(String.valueOf(combatant.getConstitution()));
        JTextField intelligenceArtificielleField = new JTextField();
        JTextField initiativeField = new JTextField(String.valueOf(combatant.getInitiative()));

        // Ajouter les champs de texte au panel
        panel.add(new JLabel("pointsDeVie:"));
        panel.add(pointsDeVieField);
        panel.add(new JLabel("Force (entre 0 et 10):"));
        panel.add(forceField);
        panel.add(new JLabel("Dextérité (entre 0 et 10):"));
        panel.add(dexteriteField);
        panel.add(new JLabel("Résistance (entre 0 et 10):"));
        panel.add(resistanceField);
        panel.add(new JLabel("Constitution (entre 0 et 30):"));
        panel.add(constitutionField);
        panel.add(new JLabel("Initiative (entre 0 et 10):"));
        panel.add(initiativeField);
        panel.add(new JLabel("IntelligenceArtificielle:"));
        panel.add(intelligenceArtificielleField);

        
        // Génération de valeur aléatoire uniquement pour l'IntelligenceArtificielle
        String[] intelligenceValues = {"Défensif", "Offensif"};
        intelligenceArtificielleField.setText(intelligenceValues[new Random().nextInt(intelligenceValues.length)]);

        // Afficher la boîte de dialogue
        int result = JOptionPane.showConfirmDialog(frame2, panel, "Entrer les valeurs", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        // Si l'utilisateur clique sur OK, vérifier les valeurs saisies
        if (result == JOptionPane.OK_OPTION) {
            int totalAllocatedPoints = 0;
            try {
                totalAllocatedPoints += validateAndParse(pointsDeVieField.getText(), 0, 30);
                totalAllocatedPoints += validateAndParse(forceField.getText(), 0, 10);
                totalAllocatedPoints += validateAndParse(dexteriteField.getText(), 0, 10);
                totalAllocatedPoints += validateAndParse(resistanceField.getText(), 0, 10);
                totalAllocatedPoints += validateAndParse(constitutionField.getText(), 0, 30);
                totalAllocatedPoints += validateAndParse(initiativeField.getText(), 0, 10);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(frame2, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (totalAllocatedPoints > totalPoints) {
                JOptionPane.showMessageDialog(frame2, "Vous ne pouvez pas allouer plus de points que disponibles.", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }

            totalPoints -= totalAllocatedPoints;
            updateButton();

            // Update combatant values
            combatant.setPointsDeVie(Integer.parseInt(pointsDeVieField.getText()));
            combatant.setForce(Integer.parseInt(forceField.getText()));
            combatant.setDextérité(Integer.parseInt(dexteriteField.getText()));
            combatant.setRésistance(Integer.parseInt(resistanceField.getText()));
            combatant.setConstitution(Integer.parseInt(constitutionField.getText()));
            combatant.setInitiative(Integer.parseInt(initiativeField.getText()));
            combatant.setIntelligenceArtificielle(intelligenceArtificielleField.getText());

            // Save combatant to the database
            insertCombatant(
                combatant.getPointsDeVie(),
                combatant.getForce(),
                combatant.getDextérité(),
                combatant.getRésistance(),
                combatant.getConstitution(),
                combatant.getInitiative(),
                combatant.getIntelligenceArtificielle(),
                "" // Placeholder for the zone
            );
        }
    }

    private int validateAndParse(String text, int minValue, int maxValue) throws NumberFormatException, IllegalArgumentException {
        int value = Integer.parseInt(text);
        if (value < minValue || value > maxValue) {
            throw new IllegalArgumentException("La valeur doit être comprise entre " + minValue + " et " + maxValue + ".");
        }
        return value;
    }

    private void updateButton() {
        if (totalPoints == 0) {
            btnJouer.setText("Commencer");
        } else {
            btnJouer.setText(String.valueOf(totalPoints));
        }
    }

    // Database methods
    private static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    private static void createNewTable() {
        String sql = "CREATE TABLE IF NOT EXISTS combattants (\n"
                + " id INT AUTO_INCREMENT PRIMARY KEY,\n"
                + " pointsDeVie INT NOT NULL,\n"
                + " `force` INT NOT NULL,\n"
                + " dexterite INT NOT NULL,\n"
                + " resistance INT NOT NULL,\n"
                + " constitution INT NOT NULL,\n"
                + " initiative INT NOT NULL,\n"
                + " intelligenceArtificielle VARCHAR(255) NOT NULL,\n"
                + " zone VARCHAR(255) NOT NULL\n"
                + ");";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void insertCombatant(int pointsDeVie, int force, int dexterite, int resistance, int constitution,
                                int initiative, String intelligenceArtificielle, String zone) {
        String sql = "INSERT INTO combattants(pointsDeVie, `force`, dexterite, resistance, constitution, initiative, intelligenceArtificielle, zone) VALUES(?,?,?,?,?,?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, pointsDeVie);
            pstmt.setInt(2, force);
            pstmt.setInt(3, dexterite);
            pstmt.setInt(4, resistance);
            pstmt.setInt(5, constitution);
            pstmt.setInt(6, initiative);
            pstmt.setString(7, intelligenceArtificielle);
            pstmt.setString(8, zone);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Combatant class to store the attributes
    class Combatant {
        private int id;
        private int pointsDeVie;
        private int force;
        private int dextérité;
        private int résistance;
        private int constitution;
        private int initiative;
        private String intelligenceArtificielle;

        public Combatant(int id) {
            this.id = id;
            this.pointsDeVie = 0;
            this.force = 0;
            this.dextérité = 0;
            this.résistance = 0;
            this.constitution = 0;
            this.initiative = 0;
            this.intelligenceArtificielle = "";
        }

        // Getters and setters for each attribute
        public int getPointsDeVie() {
            return pointsDeVie;
        }

        public void setPointsDeVie(int pointsDeVie) {
            this.pointsDeVie = pointsDeVie;
        }

        public int getForce() {
            return force;
        }

        public void setForce(int force) {
            this.force = force;
        }

        public int getDextérité() {
            return dextérité;
        }

        public void setDextérité(int dextérité) {
            this.dextérité = dextérité;
        }

        public int getRésistance() {
            return résistance;
        }

        public void setRésistance(int résistance) {
            this.résistance = résistance;
        }

        public int getConstitution() {
            return constitution;
        }

        public void setConstitution(int constitution) {
            this.constitution = constitution;
        }

        public int getInitiative() {
            return initiative;
        }

        public void setInitiative(int initiative) {
            this.initiative = initiative;
        }

        public String getIntelligenceArtificielle() {
            return intelligenceArtificielle;
        }

        public void setIntelligenceArtificielle(String intelligenceArtificielle) {
            this.intelligenceArtificielle = intelligenceArtificielle;
        }
    }
}