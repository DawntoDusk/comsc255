package as4;

import javax.swing.JOptionPane;

public class SiblingExt extends Sibling

{
            private int height;
            public SiblingExt (String n, int a, int w, int h )
            {
                        super (n,a,w);
                        height = h;
            }
            public int getHeight ( ){return height;}
}


class TestSiblingExt
{
            public static void main (String[] args)
            { 

				String in, out, name;
				int age, weight, height;
				
				 
				
				//Create SiblingExt references
				SiblingExt sib1, sib2, sib3;
				
				 
				
				// input name, age, weight, height values for first SiblingExt object
				
				name=JOptionPane.showInputDialog("Enter name");
				
				in=JOptionPane.showInputDialog("Enter age");
				
				age=Integer.parseInt(in);
				
				in=JOptionPane.showInputDialog("Enter weight");
				
				weight=Integer.parseInt(in);
				
				in=JOptionPane.showInputDialog("Enter height");
				
				height=Integer.parseInt(in);
				
				 
				
				//Create the first SiblingExt object
				sib1 = new SiblingExt (name, age, weight, height);
				
				 
				
				// input name, age, weight, height values for second SiblingExt object
				name=JOptionPane.showInputDialog("Enter name");
				
				in=JOptionPane.showInputDialog("Enter age");
				
				age=Integer.parseInt(in);
				
				in=JOptionPane.showInputDialog("Enter weight");
				
				weight=Integer.parseInt(in);
				
				in=JOptionPane.showInputDialog("Enter height");
				
				height=Integer.parseInt(in);
				
				 
				
				//Create the second SiblingExt object
				
				sib2 = new SiblingExt (name, age, weight, height);
				
				 
				
				// input name, age, weight, height values for third SiblingExt object
				
				name=JOptionPane.showInputDialog("Enter name");
				
				in=JOptionPane.showInputDialog("Enter age");
				
				age=Integer.parseInt(in);
				
				in=JOptionPane.showInputDialog("Enter weight");
				
				weight=Integer.parseInt(in);
				
				in=JOptionPane.showInputDialog("Enter height");
				
				height=Integer.parseInt(in);
				
				 
				
				//Create the third SiblingExt object
				
				sib3 = new SiblingExt (name, age, weight, height);
				
				 
				
				//create SiblingExt references
				
				SiblingExt youngest=null, lightest=null, tallest=null;
				
				 
				
				//Find the youngest
				if (sib1.getAge( ) <= sib2.getAge( ) && sib1.getAge( ) <= sib3.getAge( ) )
				{youngest=sib1;}
				else if (sib2.getAge( ) <= sib1.getAge( ) && sib2.getAge( ) <= sib3.getAge( ) )		
				{youngest=sib2;}
				else{youngest=sib3;}
				
				 
				
				//Find the lightest
				if (sib1.getWeight( ) <= sib2.getWeight( ) && sib1.getWeight( ) <= sib3.getWeight( ) )
				{lightest=sib1;}
				else if (sib2.getWeight( ) <= sib1.getWeight( ) && sib2.getWeight( ) <= sib3.getWeight( ) )		
				{lightest=sib2;}
				else{lightest=sib3;}				
				 
				
				//Find the tallest
				if (sib1.getHeight( ) >= sib2.getHeight( ) && sib1.getHeight( ) >= sib3.getHeight( ) )
				{tallest=sib1;}
				else if (sib2.getHeight( ) >= sib1.getHeight( ) && sib2.getHeight( ) >= sib3.getHeight( ) )		
				{tallest=sib2;}
				else{tallest=sib3;}
				 
				 
				
				//Build output in string out
				out="";
				out = out + "The Youngest sibling is: " + youngest.getName() + " " + youngest.getAge() + " " + youngest.getWeight() + " " + youngest.getHeight();
				out = out + "\nThe Lightest sibling is: " + lightest.getName() + " " + lightest.getAge() + " " + lightest.getWeight() + " " + lightest.getHeight();
				out = out + "\nThe Tallest sibling is: " + tallest.getName() + " " + tallest.getAge() + " " + tallest.getWeight() + " " + tallest.getHeight();

				 
				
				//display output
				
				JOptionPane.showMessageDialog(null, out);

            }

}