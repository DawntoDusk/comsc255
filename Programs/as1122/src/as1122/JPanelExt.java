package as1122;
import java.awt.Color;

import java.awt.Graphics;

import java.awt.Image;

import javax.swing.ImageIcon;

import javax.swing.JPanel;

import java.net.*;

 

public class JPanelExt extends JPanel {

            private String pictureType ="Happy";

 

            public void paintComponent(Graphics g) {

                        System.out.println("Picture Type: " + pictureType);

                        super.paintComponent(g);

                       

                        if (pictureType.equals("Happy")) {

                        	g.setColor(Color.yellow);
                            g.fillOval(0,0,300,300);
                            g.setColor(Color.black);
                            g.fillOval(80,75,30,30);
                            g.fillOval(190,75,30,30);
                            g.fillArc (75,100,150,150,0,-180);

           

                        } else if (pictureType.equals("Sad")) {

                        	 g.setColor(Color.blue);
                             g.fillOval(0,0,300,300);
                             g.setColor(Color.black );
                             g.fillOval(80,75,30,30);
                             g.fillOval(190,75,30,30);
                             g.setColor(Color.black);
                             g.drawArc(75,150,150,150,0,180);

                                   

                        } else if (pictureType.equals("Picture")) {

                                    // Picture drawing code

                                    // Create an ImageIcon for the .gif or .jpeg file
                        	ImageIcon imageIcon = new ImageIcon(getClass( ).getResource ("myfile.gif"));
                        	// Create an Image object for the ImageIcon
                        	//ImageIcon imageIcon = new ImageIcon ("C:\\Users\\anshu\\iCloud\\Desktop\\myfile.gif");
                        	Image image = imageIcon.getImage( );     
                                    // Draw the image to span all the drawing surface
                        	g.drawImage(image,0,0,this.getWidth( ), this.getHeight ( ) , this);
                                   

                        }

            }

 

            public void setPictureType(String pictureType) {

                        this.pictureType = pictureType;

 

                        //indirectly call paintComponent method

                        this.repaint();

            }

}