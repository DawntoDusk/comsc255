package as4;

import javax.swing.JOptionPane;

public class LeapDay extends Day

{

            private int year;

 

            public LeapDay (int d, int m, int y )

            {

                        //Call parent constructor to initialize day and month

                        super (d, m);

                        //Initialize year yourself

                        year=y;

            }

 

			//over-ride the parent method
			
			public int findDayNum ( )
			
			{
			
			            //Call the parent findDayNum to determine dayNum
			
			            int dayNum=super.findDayNum();
			
			 
			
			            //Handle if it is a leap year.
			
						if (((year % 400) == 0) || 
						
						   (((year %   4) == 0) && ((year%100) != 0) ) ) 
						
						{
						            //It is a leap year
						            //If month is greater than 2 add 1
						            if (month > 2){dayNum = dayNum + 1;}
						}
			
						return dayNum;          
			
			}
			public int getYear ( ){return year;} 

}

 
class TestLeapDay

{

            public static void main (String [] args)

            {

                int day, month, year, dayNum;

                //Input day, month, year values
                day=Integer.parseInt(JOptionPane.showInputDialog("Enter day"));
				month=Integer.parseInt(JOptionPane.showInputDialog("Enter month"));
				year=Integer.parseInt(JOptionPane.showInputDialog("Enter year"));
 
				//Create an object of class LeapDay and pass its
				//constructor day, month and year provided by the user
				LeapDay obj = new LeapDay(day, month, year);
				 
				
				//Call findDayNum of LeapDay object & get day number
				dayNum = obj.findDayNum();
				 
				//Display the original date and the day number
				String out = "Day Number for " + obj.getMonth() + "/" + obj.getDay() + " is " + dayNum;
				JOptionPane.showMessageDialog(null, out);
				
		   }

}