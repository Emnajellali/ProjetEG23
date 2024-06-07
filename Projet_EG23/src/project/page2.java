package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;

public class page2 {

	JFrame frame3;
	public JFrame frame4;
	public JFrame frame2;
	private JTextField txtRpartirTes;
	private JTextField txtLaBibliothque;
	private JTextField txtLeBureauDes;
	private JTextField txtLeQuartierAdministratif;
	private JTextField txtLesHallesIndustrielles;
	private JTextField txtLaHalleSportive;
	private Point imageInitialLocation;
	private int currentImageId=0; // Assuming image ID 1 for simplicity	

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
				
		JLabel lblImage1_7_9 = new JLabel("");  
	        lblImage1_7_9.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
	        lblImage1_7_9.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
	        lblImage1_7_9.setBounds(36, 142, 38, 40);
	        // Add a MouseListener to track the initial location when the mouse is pressed
	           		lblImage1_7_9.addMouseListener(new MouseAdapter() {
	           			@Override
	           			public void mousePressed(MouseEvent e) {
	           				imageInitialLocation = e.getPoint();
	           				lblImage1_7_9.setVisible(true); // Ensure the image is visible while being dragged
	           				}

	           				@Override
	           						public void mouseReleased(MouseEvent e) {


	           						lblImage1_7_9.setVisible(false); // Make the image invisible when the mouse is released
	           					}
	           							});
	           		
	           		
// Add a MouseMotionListener to update the position of the JLabel as it is dragged
lblImage1_7_9.addMouseMotionListener(new MouseMotionAdapter() {
@Override
public void mouseDragged(MouseEvent e) {
JLabel sourceLabel = (JLabel) e.getSource();
Point location = sourceLabel.getLocation();
int newX = location.x - imageInitialLocation.x + e.getX();
int newY = location.y - imageInitialLocation.y + e.getY();
	           			                sourceLabel.setLocation(newX, newY);
	           			                
	           			            			}
	           			        			});

JLabel lblImage1_7_8 = new JLabel("");  
lblImage1_7_8.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
lblImage1_7_8.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
lblImage1_7_8.setBounds(136, 142, 38, 40);
// Add a MouseListener to track the initial location when the mouse is pressed
lblImage1_7_8.addMouseListener(new MouseAdapter() {
@Override
public void mousePressed(MouseEvent e) {
imageInitialLocation = e.getPoint();
lblImage1_7_8.setVisible(true); // Ensure the image is visible while being dragged
}

@Override
public void mouseReleased(MouseEvent e) {


lblImage1_7_8.setVisible(false); // Make the image invisible when the mouse is released
}
});


// Add a MouseMotionListener to update the position of the JLabel as it is dragged
lblImage1_7_8.addMouseMotionListener(new MouseMotionAdapter() {
@Override
public void mouseDragged(MouseEvent e) {
JLabel sourceLabel = (JLabel) e.getSource();
Point location = sourceLabel.getLocation();
int newX = location.x - imageInitialLocation.x + e.getX();
int newY = location.y - imageInitialLocation.y + e.getY();
sourceLabel.setLocation(newX, newY);

}
});

JLabel lblImage1_7_7 = new JLabel("");  
lblImage1_7_7.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
lblImage1_7_7.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
lblImage1_7_7.setBounds(229, 142, 38, 40);
// Add a MouseListener to track the initial location when the mouse is pressed
lblImage1_7_7.addMouseListener(new MouseAdapter() {
@Override
public void mousePressed(MouseEvent e) {
imageInitialLocation = e.getPoint();
lblImage1_7_7.setVisible(true); // Ensure the image is visible while being dragged
}

@Override
public void mouseReleased(MouseEvent e) {


lblImage1_7_7.setVisible(false); // Make the image invisible when the mouse is released
}
});


// Add a MouseMotionListener to update the position of the JLabel as it is dragged
lblImage1_7_7.addMouseMotionListener(new MouseMotionAdapter() {
@Override
public void mouseDragged(MouseEvent e) {
JLabel sourceLabel = (JLabel) e.getSource();
Point location = sourceLabel.getLocation();
int newX = location.x - imageInitialLocation.x + e.getX();
int newY = location.y - imageInitialLocation.y + e.getY();
sourceLabel.setLocation(newX, newY);

}
});

JLabel lblImage1_7_6 = new JLabel("");  
lblImage1_7_6.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
lblImage1_7_6.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
lblImage1_7_6.setBounds(319, 142, 38, 40);
// Add a MouseListener to track the initial location when the mouse is pressed
lblImage1_7_6.addMouseListener(new MouseAdapter() {
@Override
public void mousePressed(MouseEvent e) {
imageInitialLocation = e.getPoint();
lblImage1_7_6.setVisible(true); // Ensure the image is visible while being dragged
}

@Override
public void mouseReleased(MouseEvent e) {


lblImage1_7_6.setVisible(false); // Make the image invisible when the mouse is released
}
});


// Add a MouseMotionListener to update the position of the JLabel as it is dragged
lblImage1_7_6.addMouseMotionListener(new MouseMotionAdapter() {
@Override
public void mouseDragged(MouseEvent e) {
JLabel sourceLabel = (JLabel) e.getSource();
Point location = sourceLabel.getLocation();
int newX = location.x - imageInitialLocation.x + e.getX();
int newY = location.y - imageInitialLocation.y + e.getY();
sourceLabel.setLocation(newX, newY);

}
});

JLabel lblImage1_7_5 = new JLabel("");  
lblImage1_7_5.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
lblImage1_7_5.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
lblImage1_7_5.setBounds(411, 142, 38, 40);
// Add a MouseListener to track the initial location when the mouse is pressed
lblImage1_7_5.addMouseListener(new MouseAdapter() {
@Override
public void mousePressed(MouseEvent e) {
imageInitialLocation = e.getPoint();
lblImage1_7_5.setVisible(true); // Ensure the image is visible while being dragged
}

@Override
public void mouseReleased(MouseEvent e) {


lblImage1_7_5.setVisible(false); // Make the image invisible when the mouse is released
}
});


// Add a MouseMotionListener to update the position of the JLabel as it is dragged
lblImage1_7_5.addMouseMotionListener(new MouseMotionAdapter() {
@Override
public void mouseDragged(MouseEvent e) {
JLabel sourceLabel = (JLabel) e.getSource();
Point location = sourceLabel.getLocation();
int newX = location.x - imageInitialLocation.x + e.getX();
int newY = location.y - imageInitialLocation.y + e.getY();
sourceLabel.setLocation(newX, newY);

}
});

JLabel lblImage1_7_4 = new JLabel("");  
lblImage1_7_4.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
lblImage1_7_4.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
lblImage1_7_4.setBounds(36, 285, 38, 40);
// Add a MouseListener to track the initial location when the mouse is pressed
lblImage1_7_4.addMouseListener(new MouseAdapter() {
@Override
public void mousePressed(MouseEvent e) {
imageInitialLocation = e.getPoint();
lblImage1_7_4.setVisible(true); // Ensure the image is visible while being dragged
}

@Override
public void mouseReleased(MouseEvent e) {


lblImage1_7_4.setVisible(false); // Make the image invisible when the mouse is released
}
});


// Add a MouseMotionListener to update the position of the JLabel as it is dragged
lblImage1_7_4.addMouseMotionListener(new MouseMotionAdapter() {
@Override
public void mouseDragged(MouseEvent e) {
JLabel sourceLabel = (JLabel) e.getSource();
Point location = sourceLabel.getLocation();
int newX = location.x - imageInitialLocation.x + e.getX();
int newY = location.y - imageInitialLocation.y + e.getY();
sourceLabel.setLocation(newX, newY);

}
});

JLabel lblImage1_7_3 = new JLabel("");  
lblImage1_7_3.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
lblImage1_7_3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
lblImage1_7_3.setBounds(136, 285, 38, 40);
// Add a MouseListener to track the initial location when the mouse is pressed
lblImage1_7_3.addMouseListener(new MouseAdapter() {
@Override
public void mousePressed(MouseEvent e) {
imageInitialLocation = e.getPoint();
lblImage1_7_3.setVisible(true); // Ensure the image is visible while being dragged
}

@Override
public void mouseReleased(MouseEvent e) {


lblImage1_7_3.setVisible(false); // Make the image invisible when the mouse is released
}
});


// Add a MouseMotionListener to update the position of the JLabel as it is dragged
lblImage1_7_3.addMouseMotionListener(new MouseMotionAdapter() {
@Override
public void mouseDragged(MouseEvent e) {
JLabel sourceLabel = (JLabel) e.getSource();
Point location = sourceLabel.getLocation();
int newX = location.x - imageInitialLocation.x + e.getX();
int newY = location.y - imageInitialLocation.y + e.getY();
sourceLabel.setLocation(newX, newY);

}
});

JLabel lblImage1_7_2 = new JLabel("");  
lblImage1_7_2.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
lblImage1_7_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
lblImage1_7_2.setBounds(229, 285, 38, 40);
// Add a MouseListener to track the initial location when the mouse is pressed
lblImage1_7_2.addMouseListener(new MouseAdapter() {
@Override
public void mousePressed(MouseEvent e) {
imageInitialLocation = e.getPoint();
lblImage1_7_2.setVisible(true); // Ensure the image is visible while being dragged
}

@Override
public void mouseReleased(MouseEvent e) {


lblImage1_7_2.setVisible(false); // Make the image invisible when the mouse is released
}
});


// Add a MouseMotionListener to update the position of the JLabel as it is dragged
lblImage1_7_2.addMouseMotionListener(new MouseMotionAdapter() {
@Override
public void mouseDragged(MouseEvent e) {
JLabel sourceLabel = (JLabel) e.getSource();
Point location = sourceLabel.getLocation();
int newX = location.x - imageInitialLocation.x + e.getX();
int newY = location.y - imageInitialLocation.y + e.getY();
sourceLabel.setLocation(newX, newY);

}
});

JLabel lblImage1_7 = new JLabel("");  
lblImage1_7.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
lblImage1_7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
lblImage1_7.setBounds(319, 285, 38, 40);
// Add a MouseListener to track the initial location when the mouse is pressed
lblImage1_7.addMouseListener(new MouseAdapter() {
@Override
public void mousePressed(MouseEvent e) {
imageInitialLocation = e.getPoint();
lblImage1_7.setVisible(true); // Ensure the image is visible while being dragged
}

@Override
public void mouseReleased(MouseEvent e) {


lblImage1_7.setVisible(false); // Make the image invisible when the mouse is released
}
});


// Add a MouseMotionListener to update the position of the JLabel as it is dragged
lblImage1_7.addMouseMotionListener(new MouseMotionAdapter() {
@Override
public void mouseDragged(MouseEvent e) {
JLabel sourceLabel = (JLabel) e.getSource();
Point location = sourceLabel.getLocation();
int newX = location.x - imageInitialLocation.x + e.getX();
int newY = location.y - imageInitialLocation.y + e.getY();
sourceLabel.setLocation(newX, newY);

}
});

JLabel lblImage1_7_1 = new JLabel("");  
lblImage1_7_1.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
lblImage1_7_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
lblImage1_7_1.setBounds(411, 285, 38, 40);
// Add a MouseListener to track the initial location when the mouse is pressed
lblImage1_7_1.addMouseListener(new MouseAdapter() {
@Override
public void mousePressed(MouseEvent e) {
imageInitialLocation = e.getPoint();
lblImage1_7_1.setVisible(true); // Ensure the image is visible while being dragged
}

@Override
public void mouseReleased(MouseEvent e) {


lblImage1_7_1.setVisible(false); // Make the image invisible when the mouse is released
}
});


// Add a MouseMotionListener to update the position of the JLabel as it is dragged
lblImage1_7_1.addMouseMotionListener(new MouseMotionAdapter() {
@Override
public void mouseDragged(MouseEvent e) {
JLabel sourceLabel = (JLabel) e.getSource();
Point location = sourceLabel.getLocation();
int newX = location.x - imageInitialLocation.x + e.getX();
int newY = location.y - imageInitialLocation.y + e.getY();
sourceLabel.setLocation(newX, newY);

}
});

JLabel lblImage1_7_9_1 = new JLabel("");  
lblImage1_7_9_1.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
lblImage1_7_9_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
lblImage1_7_9_1.setBounds(1000, 142, 38, 40);
// Add a MouseListener to track the initial location when the mouse is pressed
   lblImage1_7_9_1.addMouseListener(new MouseAdapter() {
   			@Override
   			public void mousePressed(MouseEvent e) {
   				imageInitialLocation = e.getPoint();
   				lblImage1_7_9_1.setVisible(true); // Ensure the image is visible while being dragged
   				}

   				@Override
   						public void mouseReleased(MouseEvent e) {


   					lblImage1_7_9_1.setVisible(false); // Make the image invisible when the mouse is released
   					}
   							});
   
   
//Add a MouseMotionListener to update the position of the JLabel as it is dragged
        lblImage1_7_9_1.addMouseMotionListener(new MouseMotionAdapter() {
@Override
public void mouseDragged(MouseEvent e) {
JLabel sourceLabel = (JLabel) e.getSource();
Point location = sourceLabel.getLocation();
int newX = location.x - imageInitialLocation.x + e.getX();
int newY = location.y - imageInitialLocation.y + e.getY();
   	                sourceLabel.setLocation(newX, newY);
   	                
   	            			}
   	        			});
                
                JLabel lblImage1_7_9_2_4_4 = new JLabel("");  
                lblImage1_7_9_2_4_4.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
                lblImage1_7_9_2_4_4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                lblImage1_7_9_2_4_4.setBounds(1383, 285, 38, 40);
             // Add a MouseListener to track the initial location when the mouse is pressed
                lblImage1_7_9_2_4_4.addMouseListener(new MouseAdapter() {
                			@Override
                			public void mousePressed(MouseEvent e) {
                				imageInitialLocation = e.getPoint();
                				lblImage1_7_9_2_4_4.setVisible(true); // Ensure the image is visible while being dragged
                				}

                				@Override
                						public void mouseReleased(MouseEvent e) {


                					lblImage1_7_9_2_4_4.setVisible(false); // Make the image invisible when the mouse is released
                					}
                							});
                
                
             //Add a MouseMotionListener to update the position of the JLabel as it is dragged
                lblImage1_7_9_2_4_4.addMouseMotionListener(new MouseMotionAdapter() {
             @Override
             public void mouseDragged(MouseEvent e) {
             JLabel sourceLabel = (JLabel) e.getSource();
             Point location = sourceLabel.getLocation();
             int newX = location.x - imageInitialLocation.x + e.getX();
             int newY = location.y - imageInitialLocation.y + e.getY();
                	                sourceLabel.setLocation(newX, newY);
                	                
                	            			}
                	        			});
                frame3.getContentPane().add(lblImage1_7_9_2_4_4);
                
                JLabel lblImage1_7_9_2_4_3 = new JLabel("");  
                lblImage1_7_9_2_4_3.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
                lblImage1_7_9_2_4_3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                lblImage1_7_9_2_4_3.setBounds(1294, 285, 38, 40);
             // Add a MouseListener to track the initial location when the mouse is pressed
                lblImage1_7_9_2_4_3.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                imageInitialLocation = e.getPoint();
                lblImage1_7_9_2_4_3.setVisible(true); // Ensure the image is visible while being dragged
                }

                @Override
                public void mouseReleased(MouseEvent e) {


                	lblImage1_7_9_2_4_3.setVisible(false); // Make the image invisible when the mouse is released
                }
                });


                // Add a MouseMotionListener to update the position of the JLabel as it is dragged
                lblImage1_7_9_2_4_3.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                JLabel sourceLabel = (JLabel) e.getSource();
                Point location = sourceLabel.getLocation();
                int newX = location.x - imageInitialLocation.x + e.getX();
                int newY = location.y - imageInitialLocation.y + e.getY();
                sourceLabel.setLocation(newX, newY);

                }
                });
                frame3.getContentPane().add(lblImage1_7_9_2_4_3);
                
                JLabel lblImage1_7_9_2_4_2 = new JLabel("");  
                lblImage1_7_9_2_4_2.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
                lblImage1_7_9_2_4_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                lblImage1_7_9_2_4_2.setBounds(1200, 285, 38, 40);
                
             // Add a MouseListener to track the initial location when the mouse is pressed
                lblImage1_7_9_2_4_2.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                imageInitialLocation = e.getPoint();
                lblImage1_7_9_2_4_2.setVisible(true); // Ensure the image is visible while being dragged
                }

                @Override
                public void mouseReleased(MouseEvent e) {


                	lblImage1_7_9_2_4_2.setVisible(false); // Make the image invisible when the mouse is released
                }
                });


                // Add a MouseMotionListener to update the position of the JLabel as it is dragged
                lblImage1_7_9_2_4_2.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                JLabel sourceLabel = (JLabel) e.getSource();
                Point location = sourceLabel.getLocation();
                int newX = location.x - imageInitialLocation.x + e.getX();
                int newY = location.y - imageInitialLocation.y + e.getY();
                sourceLabel.setLocation(newX, newY);

                }
                });
                frame3.getContentPane().add(lblImage1_7_9_2_4_2);
                
                JLabel lblImage1_7_9_2_4_1 = new JLabel("");  
                lblImage1_7_9_2_4_1.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
                lblImage1_7_9_2_4_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                lblImage1_7_9_2_4_1.setBounds(1099, 285, 38, 40);
             // Add a MouseListener to track the initial location when the mouse is pressed
                lblImage1_7_9_2_4_1.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                imageInitialLocation = e.getPoint();
                lblImage1_7_9_2_4_1.setVisible(true); // Ensure the image is visible while being dragged
                }

                @Override
                public void mouseReleased(MouseEvent e) {


                	lblImage1_7_9_2_4_1.setVisible(false); // Make the image invisible when the mouse is released
                }
                });


                // Add a MouseMotionListener to update the position of the JLabel as it is dragged
                lblImage1_7_9_2_4_1.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                JLabel sourceLabel = (JLabel) e.getSource();
                Point location = sourceLabel.getLocation();
                int newX = location.x - imageInitialLocation.x + e.getX();
                int newY = location.y - imageInitialLocation.y + e.getY();
                sourceLabel.setLocation(newX, newY);

                }
                });
                frame3.getContentPane().add(lblImage1_7_9_2_4_1);
                
                JLabel lblImage1_7_9_2_4 = new JLabel("");  
                lblImage1_7_9_2_4.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
                lblImage1_7_9_2_4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                lblImage1_7_9_2_4.setBounds(1000, 285, 38, 40);
                // Add a MouseListener to track the initial location when the mouse is pressed
                lblImage1_7_9_2_4.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                imageInitialLocation = e.getPoint();
                lblImage1_7_9_2_4.setVisible(true); // Ensure the image is visible while being dragged
                }

                @Override
                public void mouseReleased(MouseEvent e) {


                	lblImage1_7_9_2_4.setVisible(false); // Make the image invisible when the mouse is released
                }
                });


                // Add a MouseMotionListener to update the position of the JLabel as it is dragged
                lblImage1_7_9_2_4.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                JLabel sourceLabel = (JLabel) e.getSource();
                Point location = sourceLabel.getLocation();
                int newX = location.x - imageInitialLocation.x + e.getX();
                int newY = location.y - imageInitialLocation.y + e.getY();
                sourceLabel.setLocation(newX, newY);

                }
                });
                frame3.getContentPane().add(lblImage1_7_9_2_4);
                
                JLabel lblImage1_7_9_2_3 = new JLabel("");  
                lblImage1_7_9_2_3.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
                lblImage1_7_9_2_3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                lblImage1_7_9_2_3.setBounds(1383, 142, 38, 40);
             // Add a MouseListener to track the initial location when the mouse is pressed
                lblImage1_7_9_2_3.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                imageInitialLocation = e.getPoint();
                lblImage1_7_9_2_3.setVisible(true); // Ensure the image is visible while being dragged
                }

                @Override
                public void mouseReleased(MouseEvent e) {


                	lblImage1_7_9_2_3.setVisible(false); // Make the image invisible when the mouse is released
                }
                });


                // Add a MouseMotionListener to update the position of the JLabel as it is dragged
                lblImage1_7_9_2_3.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                JLabel sourceLabel = (JLabel) e.getSource();
                Point location = sourceLabel.getLocation();
                int newX = location.x - imageInitialLocation.x + e.getX();
                int newY = location.y - imageInitialLocation.y + e.getY();
                sourceLabel.setLocation(newX, newY);

                }
                });
                frame3.getContentPane().add(lblImage1_7_9_2_3);
                
                JLabel lblImage1_7_9_2_2 = new JLabel("");  
                lblImage1_7_9_2_2.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
                lblImage1_7_9_2_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                lblImage1_7_9_2_2.setBounds(1294, 142, 38, 40);
             // Add a MouseListener to track the initial location when the mouse is pressed
                lblImage1_7_9_2_2.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                imageInitialLocation = e.getPoint();
                lblImage1_7_9_2_2.setVisible(true); // Ensure the image is visible while being dragged
                }

                @Override
                public void mouseReleased(MouseEvent e) {


                	lblImage1_7_9_2_2.setVisible(false); // Make the image invisible when the mouse is released
                }
                });


                // Add a MouseMotionListener to update the position of the JLabel as it is dragged
                lblImage1_7_9_2_2.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                JLabel sourceLabel = (JLabel) e.getSource();
                Point location = sourceLabel.getLocation();
                int newX = location.x - imageInitialLocation.x + e.getX();
                int newY = location.y - imageInitialLocation.y + e.getY();
                sourceLabel.setLocation(newX, newY);

                }
                });
                frame3.getContentPane().add(lblImage1_7_9_2_2);
                
                JLabel lblImage1_7_9_2_1 = new JLabel("");  
                lblImage1_7_9_2_1.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
                lblImage1_7_9_2_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                lblImage1_7_9_2_1.setBounds(1200, 142, 38, 40);
             // Add a MouseListener to track the initial location when the mouse is pressed
                lblImage1_7_9_2_1.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                imageInitialLocation = e.getPoint();
                lblImage1_7_9_2_1.setVisible(true); // Ensure the image is visible while being dragged
                }

                @Override
                public void mouseReleased(MouseEvent e) {


                	lblImage1_7_9_2_1.setVisible(false); // Make the image invisible when the mouse is released
                }
                });


                // Add a MouseMotionListener to update the position of the JLabel as it is dragged
                lblImage1_7_9_2_1.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                JLabel sourceLabel = (JLabel) e.getSource();
                Point location = sourceLabel.getLocation();
                int newX = location.x - imageInitialLocation.x + e.getX();
                int newY = location.y - imageInitialLocation.y + e.getY();
                sourceLabel.setLocation(newX, newY);

                }
                });
                frame3.getContentPane().add(lblImage1_7_9_2_1);
                
                JLabel lblImage1_7_9_2 = new JLabel("");  
                lblImage1_7_9_2.setIcon(new ImageIcon(page2.class.getResource("/images/image05.jpeg")));
                lblImage1_7_9_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                lblImage1_7_9_2.setBounds(1099, 142, 38, 40);
             // Add a MouseListener to track the initial location when the mouse is pressed
                lblImage1_7_9_2.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                imageInitialLocation = e.getPoint();
                lblImage1_7_9_2.setVisible(true); // Ensure the image is visible while being dragged
                }

                @Override
                public void mouseReleased(MouseEvent e) {


                	lblImage1_7_9_2.setVisible(false); // Make the image invisible when the mouse is released
                }
                });


                // Add a MouseMotionListener to update the position of the JLabel as it is dragged
                lblImage1_7_9_2.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                JLabel sourceLabel = (JLabel) e.getSource();
                Point location = sourceLabel.getLocation();
                int newX = location.x - imageInitialLocation.x + e.getX();
                int newY = location.y - imageInitialLocation.y + e.getY();
                sourceLabel.setLocation(newX, newY);

                }
                });
                
                frame3.getContentPane().add(lblImage1_7_9_2);
                
        
                frame3.getContentPane().add(lblImage1_7_9_1);
frame3.getContentPane().add(lblImage1_7_1);

// Add the JLabel to the frame
frame3.getContentPane().add(lblImage1_7);
frame3.getContentPane().add(lblImage1_7_2);
frame3.getContentPane().add(lblImage1_7_3);
frame3.getContentPane().add(lblImage1_7_4);
frame3.getContentPane().add(lblImage1_7_5);
frame3.getContentPane().add(lblImage1_7_6);
frame3.getContentPane().add(lblImage1_7_7);
frame3.getContentPane().add(lblImage1_7_8);
frame3.getContentPane().add(lblImage1_7_9);

				JLabel lblNewLabel = new JLabel("");  
				lblNewLabel.setIcon(new ImageIcon(page2.class.getResource("/images/page4.png")));
				lblNewLabel.setBounds(487, 95, 475, 370);
				frame3.getContentPane().add(lblNewLabel);

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

	        frame3.setVisible(true);

		 // Initialize text fields
        JTextField txtLaBibliothque = new JTextField();
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

        JTextField txtLeBureauDes = new JTextField();
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

        JTextField txtLeQuartierAdministratif = new JTextField();
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

        JTextField txtLesHallesIndustrielles = new JTextField();
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

        JTextField txtLaHalleSportive = new JTextField();
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

        // Initialize buttons using createZoneButton method
        JButton btnBibliotheque = createZoneButton("+", 298, 481, "bibliotheque");
        JButton btnBDE = createZoneButton("+", 298, 531, "bde");
        JButton btnQuartier = createZoneButton("+", 903, 528, "quartier");
        JButton btnHalleIndus = createZoneButton("+", 1279, 478, "halle indus");
        JButton btnHalleSportif = createZoneButton("+", 1279, 528, "halle sportif");

        frame3.getContentPane().add(btnBibliotheque);
        frame3.getContentPane().add(btnBDE);
        frame3.getContentPane().add(btnQuartier);
        frame3.getContentPane().add(btnHalleIndus);
        frame3.getContentPane().add(btnHalleSportif);

        // Adding buttons for navigation
        JButton btnRetour = new JButton("Retour");
        btnRetour.addActionListener(e -> {
            // Créez une instance de votre deuxième cadre (conn)
            page1 nouvellepage = new page1();
            frame3.dispose();
            // Rendez le deuxième cadre visible
            nouvellepage.frame2.setVisible(true);
        });
        btnRetour.setForeground(Color.WHITE);
        btnRetour.setFont(new Font("Inter", Font.PLAIN, 20));
        btnRetour.setBackground(Color.GRAY);
        btnRetour.setBounds(133, 374, 173, 65);
        frame3.getContentPane().add(btnRetour);

        JButton btnJouer = new JButton("Jouer");
        btnJouer.addActionListener(e -> {
            // Créez une instance de votre deuxième cadre (conn)
            page3 nouvellepage = new page3();
            frame3.dispose();
            // Rendez le deuxième cadre visible
            nouvellepage.frame4.setVisible(true);
        });
        btnJouer.setForeground(Color.WHITE);
        btnJouer.setFont(new Font("Inter", Font.PLAIN, 20));
        btnJouer.setBackground(Color.GRAY);
        btnJouer.setBounds(1135, 374, 173, 65);
        frame3.getContentPane().add(btnJouer);

        // Adding panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setForeground(Color.GRAY);
        panel.setBounds(9, 465, 1401, 124);
        frame3.getContentPane().add(panel);

        
    }

    private void addDragFunctionality(JLabel label, int imageId) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                imageInitialLocation = e.getPoint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setVisible(false); // Make the image invisible when the mouse is released
            }
        });

        label.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Point location = label.getLocation();
                int newX = location.x - imageInitialLocation.x + e.getX();
                int newY = location.y - imageInitialLocation.y + e.getY();
                label.setLocation(newX, newY);
            }
        });
    }

    private JButton createZoneButton(String text, int x, int y, String zone) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 38, 40);
        
        button.addActionListener(e -> updateDatabase(++currentImageId, zone));
        return button;
    }

//    private void updateDatabase(int imageId, String zone) {
//        String url = "jdbc:mysql://localhost:3306/EG23";
//        String user = "root"; // Replace with your database username
//        String password = ""; // Replace with your database password
//
//        try (Connection conn = DriverManager.getConnection(url, user, password)) {
//            String query = "UPDATE INTO combattants (image_id, zone) VALUES (?, ?)";
//            PreparedStatement stmt = conn.prepareStatement(query);
//            stmt.setInt(1, imageId);
//            stmt.setString(2, zone);
//            stmt.executeUpdate();
//            System.out.println("Updated database with image ID " + imageId + " in zone " + zone);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    private void updateDatabase(int imageId, String zone) {
        String url = "jdbc:mysql://localhost:3306/EG23";
        String user = "root"; // Replace with your database username
        String password = ""; // Replace with your database password

        String query = "UPDATE combattants SET zone = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, zone);
            stmt.setInt(2, imageId);
            int rowsUpdated = stmt.executeUpdate();
            
            if (rowsUpdated > 0) {
                System.out.println("Updated database with image ID " + imageId + " in zone " + zone);
            } else {
                System.out.println("No record found with image ID " + imageId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}