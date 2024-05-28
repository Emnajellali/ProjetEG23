package project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class page1 {

    JFrame frame2;
    private JTextField txtAffecterLesPoints;
    private int totalPoints = 400; // Initialize total points
    private JButton btnJouer;
    public JFrame frame3;

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
        initialize();
        
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame2 = new JFrame();
        frame2.getContentPane().setBackground(new Color(30, 144, 255));
        frame2.getContentPane().setLayout(null);

        // Créer les labels pour chaque image avec un contour et un événement de clic
        JLabel lblImage1 = new JLabel("");
        lblImage1.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage1.setBounds(10, 80, 150, 170);
        lblImage1.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        lblImage1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage1);

        JLabel lblImage2 = new JLabel("");
        lblImage2.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage2.setBounds(179, 80, 150, 170);
        lblImage2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        lblImage2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage2);

        JLabel lblImage3 = new JLabel("");
        lblImage3.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage3.setBounds(348, 80, 150, 170);
        lblImage3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        lblImage3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage3);

        JLabel lblImage4 = new JLabel("");
        lblImage4.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage4.setBounds(517, 80, 150, 170);
        lblImage4.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        lblImage4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage4);

        JLabel lblImage5 = new JLabel("");
        lblImage5.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage5.setBounds(691, 80, 150, 170);
        lblImage5.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        lblImage5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage5);

        JLabel lblImage6 = new JLabel("");
        lblImage6.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage6.setBounds(864, 80, 150, 170);
        lblImage6.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        lblImage6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage6);

        JLabel lblImage7 = new JLabel("");
        lblImage7.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage7.setBounds(1040, 80, 150, 170);
        lblImage7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage7);

        JLabel lblImage8 = new JLabel("");
        lblImage8.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage8.setBounds(10, 260, 150, 170);
        lblImage8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage8);

        JLabel lblImage9 = new JLabel("");
        lblImage9.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage9.setBounds(179, 260, 150, 170);
        lblImage9.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage9);

        JLabel lblImage10 = new JLabel("");
        lblImage10.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage10.setBounds(348, 260, 150, 170);
        lblImage10.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage10);

        JLabel lblImage11 = new JLabel("");
        lblImage11.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage11.setBounds(517, 260, 150, 170);
        lblImage11.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage11);

        JLabel lblImage12 = new JLabel("");
        lblImage12.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage12.setBounds(691, 260, 150, 170);
        lblImage12.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage12);

        JLabel lblImage13 = new JLabel("");
        lblImage13.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage13.setBounds(864, 260, 150, 170);
        lblImage13.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage13);

        JLabel lblImage14 = new JLabel("");
        lblImage14.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage14.setBounds(1040, 260, 150, 170);
        lblImage14.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage14);

        JLabel lblImage15 = new JLabel("");
        lblImage15.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage15.setBounds(10, 440, 150, 170);
        lblImage15.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage15);

        JLabel lblImage16 = new JLabel("");
        lblImage16.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage16.setBounds(179, 440, 150, 170);
        lblImage16.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage16);

        JLabel lblImage17 = new JLabel("");
        lblImage17.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage17.setBounds(348, 440, 150, 170);
        lblImage17.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage17);

        JLabel lblImage18 = new JLabel("");
        lblImage18.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage18.setBounds(691, 440, 150, 170);
        lblImage18.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage18.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage18);

        JLabel lblImage19 = new JLabel("");
        lblImage19.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage19.setBounds(864, 440, 150, 170);
        lblImage19.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage19.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage19);

        JLabel lblImage20 = new JLabel("");
        lblImage20.setIcon(new ImageIcon(page1.class.getResource("/images/image 3.png")));
        lblImage20.setBounds(1040, 440, 150, 170);
        lblImage20.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblImage20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInputDialog();
            }
        });
        frame2.getContentPane().add(lblImage20);
        String pointsDeVie = "30";
        String Dextérité = "0";
        String Force = "0";
        // Bouton "Jouer"
        btnJouer = new JButton("400"); // Set initial text to totalPoints
        btnJouer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnJouer.getText().equals("Commencer")) {
        		// Créez une instance de votre deuxième cadre (conn)
		        page2 nouvellepage = new page2();
		        frame2.dispose();
		        // Rendez le deuxième cadre visible
		        nouvellepage.frame3.setVisible(true);}
        	}
        });
        btnJouer.setForeground(Color.WHITE);
        btnJouer.setFont(new Font("Inter", Font.PLAIN, 20));
        btnJouer.setBackground(new Color(128, 128, 128));
        btnJouer.setBounds(508, 502, 173, 65);
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

    // Méthode pour afficher une boîte de dialogue avec plusieurs champs de texte
    private void showInputDialog() throws NumberFormatException {
        // Créer un panel avec un layout grid pour organiser les champs de texte
        JPanel panel = new JPanel(new GridLayout(0, 1));
        JTextField pointsDeVieField = new JTextField();
        JTextField ForceField = new JTextField();
        JTextField DextéritéField = new JTextField();
        JTextField RésistanceField = new JTextField();
        JTextField ConstitutionField = new JTextField();
        JTextField IntelligenceArtificielleField = new JTextField();
        JTextField InitiativeField = new JTextField();

        // Ajouter les champs de texte au panel
        panel.add(new JLabel("pointsDeVie:"));
        panel.add(pointsDeVieField);
        panel.add(new JLabel("Force (entre 0 et 10):"));
        panel.add(ForceField);
        panel.add(new JLabel("Dextérité (entre 0 et 10):"));
        panel.add(DextéritéField);
        panel.add(new JLabel("Résistance (entre 0 et 10):"));
        panel.add(RésistanceField);
        panel.add(new JLabel("Constitution (entre 0 et 30):"));
        panel.add(ConstitutionField);
        panel.add(new JLabel("Initiative (entre 0 et 10):"));
        panel.add(InitiativeField);
        panel.add(new JLabel("IntelligenceArtificielle:"));
        panel.add(IntelligenceArtificielleField);

     // Génération de valeur aléatoire uniquement pour l'IntelligenceArtificielle
        String[] intelligenceValues = {"Défensif", "Offensif"};
        IntelligenceArtificielleField.setText(intelligenceValues[new Random().nextInt(intelligenceValues.length)]); // Choix aléatoire parmi les valeurs possibles

        // Afficher la boîte de dialogue
        int result = JOptionPane.showConfirmDialog(frame2, panel, "Entrer les valeurs", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

     // Si l'utilisateur clique sur OK, vérifier les valeurs saisies
        if (result == JOptionPane.OK_OPTION) {
            // Vérifier les valeurs et calculer la somme des points
            int totalAllocatedPoints = 0;
            try {
                totalAllocatedPoints += validateAndParse(pointsDeVieField.getText(), 0, 30);
                totalAllocatedPoints += validateAndParse(ForceField.getText(), 0, 10);
                totalAllocatedPoints += validateAndParse(DextéritéField.getText(), 0, 10);
                totalAllocatedPoints += validateAndParse(RésistanceField.getText(), 0, 10);
                totalAllocatedPoints += validateAndParse(ConstitutionField.getText(), 0, 30);
                totalAllocatedPoints += validateAndParse(InitiativeField.getText(), 0, 10);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(frame2, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
                return; // Quitter la méthode si une valeur est invalide
            }

            if (totalAllocatedPoints > totalPoints) {
                JOptionPane.showMessageDialog(frame2, "Vous ne pouvez pas allouer plus de points que disponibles.", "Erreur", JOptionPane.ERROR_MESSAGE);
                return; // Quitter la méthode si la somme dépasse les points disponibles
            }

            // Déduire les points alloués du total et mettre à jour le bouton
            totalPoints -= totalAllocatedPoints;
            updateButton();

            // Afficher les valeurs saisies dans la console
            System.out.println("pointsDeVie: " + pointsDeVieField.getText());
            System.out.println("Force: " + ForceField.getText());
            System.out.println("Dextérité: " + DextéritéField.getText());
            System.out.println("Résistance: " + RésistanceField.getText());
            System.out.println("Constitution: " + ConstitutionField.getText());
            System.out.println("Initiative: " + InitiativeField.getText());
            System.out.println("IntelligenceArtificielle: " + IntelligenceArtificielleField.getText());
        }
    }

    // Méthode pour valider et parser les valeurs de points
    private int validateAndParse(String text, int minValue, int maxValue) throws NumberFormatException, IllegalArgumentException {
        int value = Integer.parseInt(text);
        if (value < minValue || value > maxValue) {
            throw new IllegalArgumentException("La valeur doit être comprise entre " + minValue + " et " + maxValue + ".");
        }
        return value;
    }

    // Méthode pour mettre à jour le texte du bouton "Jouer"
    private void updateButton() {

    	     if (totalPoints == 0) {
    	            btnJouer.setText("Commencer");
    	        } else {
    	        	btnJouer.setText(String.valueOf(totalPoints));
    	        }
    	    }
    }
