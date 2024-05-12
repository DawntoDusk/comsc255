package as10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class JFrameExt extends JFrame implements ActionListener

{

            private JPanel jpMain = new JPanel();

           

            private JPanel jpn = new JPanel();

            private JPanel jpc = new JPanel();

           

           

            private JLabel jlbGuess = new JLabel

                                    ("Enter guess between 1 and 7");

            private JTextField jtfGuess = new JTextField(10);

           

           

            private JTextArea jtaMessage = new JTextArea(10,40);

            private Guess guess=null;

           

            public JFrameExt ( )

            {

                  //Create GUI
                 //Make jpMain the content pane for displaying its contents.

                  this.setContentPane(jpMain);

 

                  //Set jpMain's layout to border layout.

                  BorderLayout bl = new BorderLayout();

       jpMain.setLayout(bl);

                                   

                   //put panel jpn in panel jpMain in the NORTH position

                   //put panel jpc in panel jpMain in the CENTER position

                   jpMain.add(jpn,BorderLayout.NORTH);

                   jpMain.add(jpc,BorderLayout.CENTER);

                                   

                   //set background color of panel jpn to green

                   //set background color of panel jpc to yellow

                   jpn.setBackground(Color.green);

                   jpc.setBackground(Color.yellow);

     

                    //Add a label and a text field to panel jpn

                    jpn.add  (jlbGuess);

                    jpn.add (jtfGuess);

             

                    

                    //create scroll pane containing text area with scroll bars
                    // code for newer version of eclipse

                    JScrollPane jspMessage = new JScrollPane (jtaMessage);

                    jspMessage.setHorizontalScrollBarPolicy

                                                (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

                       

                    jspMessage.setVerticalScrollBarPolicy

                                                (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

                     

                    //add scroll pane to panel jpc

                    jpc.add (jspMessage);

              

                   //Register with text field to receive enter key press events

                   jtfGuess.addActionListener(this);

 

                  //Create Guess object for starting the game first time

                  guess = new Guess ( );

            }

            //Here is a sample actionPerformed method. 
            //It handles an Enter Key Press event in the text field
            //It catches exceptions from call to checkGuess method.
             public void actionPerformed (ActionEvent e)

            { 

                    String userGuess;

                    if (e.getSource() == jtfGuess)

                    {

                                        //increment guess count

                 

                                        //extract user guess from text field

                                        userGuess = jtfGuess.getText().trim();

                                        jtfGuess.setText("");

 

                                                //call checkGuess and pass it user guess

                                        try

                                        {

                                                    guess.checkGuess(userGuess);

                                        }

                                       

                                        catch (GuessOutOfRangeException ex)

                                        {

                                                    //JOptionPane.showMessageDialog(null,ex.getMessage());

                                                    jtaMessage.append

                                                    (userGuess+ " - " + ex.getMessage()+"\n");

                                                    return;

                                        }

                                        catch (GuessNotWholeNumberException ex)

                                        {

                                                    //JOptionPane.showMessageDialog(null,ex.getMessage());

                                                    jtaMessage.append(userGuess+ " - " + ex.getMessage()+"\n");

                                                    return;

                                        }

                                        catch (GuessTooLargeException ex)

                                        {

                                                    //JOptionPane.showMessageDialog(null,ex.getMessage());

                                                    jtaMessage.append(userGuess+ " - " + ex.getMessage()+"\n");

                                                    return;

                           

                                        }

                                        catch (GuessTooSmallException ex)

                                        {

                                                    //JOptionPane.showMessageDialog(null,ex.getMessage());

                                                    jtaMessage.append(userGuess+ " - " + ex.getMessage()+"\n");

                                                    return;

                                        }

                                       

                                        /*

                                        catch (Exception ex)

                                        {

                                                    jtaMessage.append

                                                    (userGuess+ " - " + ex.getMessage()+"\n");

                                                    return;

                                        }

                                        */

                                        //display correct guess message

                                        jtaMessage.append(userGuess+ " - " + "Correct Guess"+"\n");

 

                                                //start the new game

                                        jtaMessage.append ("\nNew Game Started\n");

                                        guess = new Guess();

                                        return;

                                    }

                        }                     

            }

 