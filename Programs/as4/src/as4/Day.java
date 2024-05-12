package as4;

import javax.swing.JOptionPane;

public class Day

{

            private int day;
            protected int month;

            public Day (int d, int m )

            {
                        day=d;
                        month=m;
            }

			public int findDayNum ( )
			
			{
                        int dayNum=0;
                        switch (month)

                        {

	                        case 1:
	                            dayNum = day;
	                            break;
	                        case 2:
	                            dayNum = 31 + day;
	                            break;
	                        case 3:
	                            dayNum = 31 + 28 + day;
	                            break;
	                        case 4:
	                            dayNum = 31 + 28 + 31 + day;
	                            break;
	                        case 5:
	                            dayNum = 31 + 28 + 31 + 30 + day;
	                            break; 
	                        case 6:
	                            dayNum = 31 + 28 + 31 + 30 + 31 + day;
	                            break;
	                        case 7:
	                        	dayNum = 31 + 28 + 31 + 30 + 31 + 30 + day;
	                        	break;
	                        case 8:
	                        	dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
	                        	break;
	                        case 9:
	                        	dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
	                        	break;
	                        case 10:
	                        	dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
	                        	break;
	                        case 11:
	                        	dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
	                        	break;
	                        case 12:
	                        	dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
	                        	break;
                        }
                        return dayNum;          
            }

 
			public int getDay ( ){return day;}
			public int getMonth ( ){return month;}

}

 

class TestDay

{

            public static void main (String [] args)

            {

                        int day, month, year, dayNum;
                        String out;

                        //Prompt the user for entering day, month, year values
                        day=Integer.parseInt(JOptionPane.showInputDialog("Enter day"));
        				month=Integer.parseInt(JOptionPane.showInputDialog("Enter month"));
        				year=Integer.parseInt(JOptionPane.showInputDialog("Enter year"));
                       

                        //Create an object of class Day and pass its constructor
        				Day obj = new Day(day, month);
 
						
						// Call findDayNum of Day object to obtain day number.
						dayNum = obj.findDayNum();
						 
						
						//Add 1 to dayNum if it's a leap year
						//and month greater than2Handle the leap year
						
						if (((year % 400) == 0) || (((year %   4) == 0) && ((year%100) != 0)))
						
						{
                            //Leap year
                            if (month > 2){dayNum = dayNum + 1;}
						}
						
						//Display the original data and the day number
						out = "Day Number for " + obj.getMonth() + "/" + obj.getDay() + " is " + dayNum;
						JOptionPane.showMessageDialog(null, out);
            }

}