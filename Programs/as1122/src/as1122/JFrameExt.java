package as1122;
import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;


public class JFrameExt extends JFrame implements ActionListener{

            private JPanelExt jpe = new JPanelExt();

            private JPanel jp = new JPanel();

 

            private JButton jbtHappy = new JButton("Happy");

            private JButton jbtSad = new JButton("Sad");

            private JButton jbtPicture = new JButton("Picture");

           

            public JFrameExt () {

                        //set layout

                        this.setLayout(new BorderLayout());

 

                        //add two panels

                        this.add(jpe,BorderLayout.CENTER);

                        this.add(jp,BorderLayout.SOUTH);

                        //panels' background color

                        jpe.setBackground(Color.yellow);

                        jp.setBackground(Color.green);

 

                        //add buttons to one of the panel

                        jp.add(jbtHappy);

                        jp.add(jbtSad);

                        jp.add(jbtPicture);

 

                        //activate buttons                   

                        jbtHappy.addActionListener(this);

                        jbtSad.addActionListener(this);

                        jbtPicture.addActionListener(this);

            }

            @Override

            public void actionPerformed(ActionEvent e) {

 

                        if (e.getSource() == jbtHappy) {

                                    jpe.setPictureType("Happy");

                        } else if (e.getSource() == jbtSad) {

                                    jpe.setPictureType("Sad");

                        } else if (e.getSource() == jbtPicture) {

                                    jpe.setPictureType("Picture");

                        }

            }                     

}

 