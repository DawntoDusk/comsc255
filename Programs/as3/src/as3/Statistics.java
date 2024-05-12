package as3;
import java.util.Arrays;

import javax.swing.JOptionPane;


class Statistics

{
		//instance variables
		private double [] data; 
		private double [] sdata;
		
		//constructor Statistics
		
		public Statistics (double [ ] d )
		
		{
		
		            //clone returns a (shallow) copy of the array
		
		            data=d.clone();
		
		            sdata = d.clone();
		
		            //sort the array sdata
		
		            Arrays.sort(sdata); //import java.util.Arrays: 
		
		}
		
		 
		
		//instance methods
		
		public double findMin ( )
		
		{
		            double min=sdata[0];
		            return min;
		
		}
		
		 
		
		public double findMax ( )
		
		{
		            double max=sdata[sdata.length-1];
		            return max;
		}
		
		 
		
		public double findMean ( )
		
		{
		            double sum, mean;
		            sum=0;
		            for (int i=0; i<sdata.length; i++){sum=sum+sdata [i];}
		
					mean=sum/sdata.length;
					return mean;
					
		}
		
		 
		
		
		public double findMedian ( )
		
		{
		            double median=0;
		            int index, indexHi, indexLo;


		            //Determine if the length is odd or even.

		            if ( (sdata.length %2) != 0 )

		            {

		                        index = sdata.length / 2;
		                        median = sdata [index];

		            }

		            else

		            {

		                        indexHi = sdata.length / 2;
		                        indexLo = indexHi - 1;
		                        median = (sdata[indexLo] + sdata[indexHi] ) / 2;

		            }

		            return median;
				
		} 
		
		 
		
		//method returns a copy of the array data containing the original data.
		
		public double [ ] getOrigData ( )
		
		{	
		            double [ ] d = data.clone();       
		
		            return d;
		}
		
		 

		public double [ ] getSortedData ( )
		
		{
		            double []sd = sdata.clone();
		            return sd;
		}
		
		public static double computeMin (double [ ] data)

		{
            Statistics st = new Statistics (data);
            double min = st.findMin ( );
            return min;
		}

		public static double computeMax (double[] data)

		{
            Statistics st = new Statistics (data);
            double max = st.findMax ( );
            return max;
		}
		public double computeMean (double[] data)
		
		{
			Statistics st = new Statistics (data);
            double sum, mean;
            sum=0;
            for (int i=0; i<sdata.length; i++){sum=sum+sdata [i];}

			mean=sum/sdata.length;
			return mean;
			
		}
		public double computeMedian (double[] data)
		
		{
			Statistics st = new Statistics (data);
			double median=0;
            int index, indexHi, indexLo;
            if ( (sdata.length %2) != 0 )

            {
                        index = sdata.length / 2;
                        median = sdata [index];
            }

            else

            {

                        indexHi = sdata.length / 2;
                        indexLo = indexHi - 1;
                        median = (sdata[indexLo] + sdata[indexHi] ) / 2;

            }

            return median;
		}
		public double [ ] computeSortedData (double[] data)
		
		{
			Statistics st = new Statistics (data);
		    double []sd = sdata.clone();
		    return sd;
		}
		

 

}

class TestStatistics {

	public static void main(String[] args) {
		String in, out;

        //input item count

        in=JOptionPane.showInputDialog ("Enter item count");

        int itemCount=Integer.parseInt(in);

        //create an array data of length itemCount
        double[] data= new double[itemCount];

       

        //input data and fill the array with data         
        for(int i=0; i<itemCount; i++)

        {
            in = JOptionPane.showInputDialog("Enter data value");
            data[i]=Double.parseDouble(in);                   

        }



        //create an object of class Statistics and pass it the array data

        Statistics stat=new Statistics(data);



        //find min, max, mean. median by calling stat object's methods

        double min = stat.findMin();

        double max = stat.findMax();

        //add code for mean and median

        double mean = stat.findMean();
        double median = stat.findMedian();




        double[] origData = stat.getOrigData();

        double[] sortedData = stat.getSortedData();
 

//build output by accumulating output in variable out

        out = "";


        out = out + "Original Data: \n";

        for (int i=0; i<origData.length; i++){

                     out = out + origData [i] + " ";

        }

        out = out + "\n";


        out = out + "Sorted Data: \n";

        for (int i=0; i<sortedData.length; i++){

            out = out + origData [i] + " ";

}


        out = out + "Min: " + min + "\n";
        out = out + "Max: " + max + "\n";
        out = out + "Mean: " + mean + "\n";
        out = out + "Median: " + median + "\n";




        JOptionPane.showMessageDialog ( null, out);

	}

}