package as7;

import javax.swing.JOptionPane;

public class Rectangle implements Status

{         
            //instance variables
            private double length;
            private double width;

            //Constructor
            public Rectangle (double l, double w)

            {

                        //initialize instance variables
                        length = l;
                        width = w;

            }

 

            //accessor methods
            public double getLength ( ){return length;}
            public double getWidth ( ){return length;}
            public String getStatus ( )

            {
                        String status="Rectangle\nLength="+length+", Width="+width+"\n";
                        return status;
            }

            public void displayStatus()

            {
                        String status=getStatus ();
                        JOptionPane.showMessageDialog (null, status);
            }         

}