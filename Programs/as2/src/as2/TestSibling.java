package as2;

import javax.swing.JOptionPane;

public class TestSibling {

	public static void main(String[] args) {
		String in, out, name; 
		int age, weight;

		//Create Sibling references
		Sibling sib1, sib2, sib3;

		//input name, age, weight values for first sibling object
		name=JOptionPane.showInputDialog("Enter name");
		in=JOptionPane.showInputDialog("Enter age");
		age=Integer.parseInt(in);
		in=JOptionPane.showInputDialog("Enter weight");
		weight=Integer.parseInt(in);

		//Create the first SiblingExt object
		sib1 = new Sibling (name, age, weight);

		//input name, age, weight values for second sibling object
		name=JOptionPane.showInputDialog("Enter name");
		in=JOptionPane.showInputDialog("Enter age");
		age=Integer.parseInt(in);
		in=JOptionPane.showInputDialog("Enter weight");
		weight=Integer.parseInt(in);

		//Create the second Sibling object
		sib2 = new Sibling (name, age, weight);

		//input name, age, weight values for third sibling object
		name=JOptionPane.showInputDialog("Enter name");
		in=JOptionPane.showInputDialog("Enter age"); 
		age=Integer.parseInt(in);
		in=JOptionPane.showInputDialog("Enter weight");
		weight=Integer.parseInt(in); 

		//Create the third SiblingExt object
		sib3=new Sibling (name, age, weight);

		//create Sibling references
		Sibling youngest=null, lightest=null;


		if (sib1.getAge( ) <= sib2.getAge( ) && sib1.getAge( ) <= sib3.getAge( ) )
		{
		            youngest=sib1;
		}
		else if (sib2.getAge( ) <= sib1.getAge( ) && sib2.getAge( ) <= sib3.getAge( ) )
		{
		            youngest=sib2;
		}
		else{youngest=sib3;}

		 

		if (sib1.getWeight( ) <= sib2.getWeight( ) && sib1.getWeight( ) <= sib3.getWeight( ) )
		{
		            lightest=sib1;
		}
		else if (sib2.getWeight( ) <= sib1.getWeight( ) && sib2.getWeight( ) <= sib3.getWeight( ) )
		{
		            lightest=sib2;
		}
		else{lightest=sib3;}


		//Build output in string out
		out="";


		out = out + "The lightest sibling: " + lightest.getName( )+" " + lightest.getAge( ) +" " + lightest.getWeight() + "\n";
		out = out + "\nThe youngest sibling: " + youngest.getName( )+" " + youngest.getAge( ) +" " + youngest.getWeight() + "\n";

		JOptionPane.showMessageDialog(null, out);

	}

}
