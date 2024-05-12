package as7;

import javax.swing.JOptionPane;

public class TestStatus{



	public static void main (String[] args)
	
	{
	
	    String in, out = "";
	
	    //create an array of 6 Status references
	    Status[] status=new Status[6];
	
	    //create a statusIndex to index into status array
	    int statusIndex=0;
	
	    //create three Rectangle objects and store their references in status array        
	
	    for (int i=0; i<3; i++)
	    {
	              in= JOptionPane.showInputDialog ("Enter length");
                  double length=Double.parseDouble(in);
                  in= JOptionPane.showInputDialog ("Enter width");
                  double width=Double.parseDouble(in);

                  //create a Rectangle object and store its reference in status array
	              status[statusIndex]=new Rectangle(length,width);
	              statusIndex++;
	    }
	    
	    //create two Sibling objects and store their references in status array 
	
	    for (int i=0; i<2; i++)
	
	    {
	    	in= JOptionPane.showInputDialog ("Enter name");
            String name=in;
            in= JOptionPane.showInputDialog ("Enter age");
            int age=Integer.parseInt(in);
            in= JOptionPane.showInputDialog ("Enter weight");
            int weight=Integer.parseInt(in);

            status[statusIndex]=new Sibling(name, age, weight);
            statusIndex++;
	    }
	
	    //create one Student object and store its references in status array      
	    in= JOptionPane.showInputDialog ("Enter id");
        int id=Integer.parseInt(in);
    	in= JOptionPane.showInputDialog ("Enter name");
        String name=in;
        in= JOptionPane.showInputDialog ("Enter number of scores");
        int numScores=Integer.parseInt(in);
        int[] scores = new int[numScores];
	    for (int i=0; i<numScores; i++)
	    {
	    	in= JOptionPane.showInputDialog ("Enter score");
	        scores[i]=Integer.parseInt(in);
	    }
	    status[statusIndex]=new Student(id, name, scores);
	
		
		//First Polymorphic Loop
		//Call displayStatus ( ) in a loop as shown below:
		for (int index=0; index<status.length; index++)
		{status[index].displayStatus ( );}
		
		
		//Second Polymorphic Loop 
		//Call getStatus ( ) in a loop and accumulate output as shown below.
		//After exiting from the loop, display the accumulated output.
		for (int index=0; index<status.length; index++)
		{out = out + status[index].getStatus ( );}
		
		JOptionPane.showMessageDialog (null, out);
		
	}

}

