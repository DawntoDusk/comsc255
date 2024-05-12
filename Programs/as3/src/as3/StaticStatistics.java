package as3;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

class TestStaticStatistics {

	public static void main(String[] args) {
		String in = JOptionPane.showInputDialog("Enter data values separated by comma");
	
		String delim = ",";
	
		//Create StringTokenizer object and pass it the string to be tokenized and delimiter to be used
	
		StringTokenizer st = new StringTokenizer (in, delim);
	
	
		//Get token count from StringTokenizer object
	
		int count = st.countTokens ( );
	
		 
	
		// Create an array data of size token count.
	
		double[] data = new double [count];
	

		 
	
		for (int i=0; i<count; i++)
	
		{
		            String token = st.nextToken ( ).trim ( );
		            data [i] = Double.parseDouble(token);
	
		}
	
		 
	
		//Display contents of the array
	
//		System.out.print ("Data=");
//	
//		for (int i=0; i<count; i++)
//	
//		{
//	
//		            System.out.print (data[i] + " ") ;
//	
//		}
//	
//		System.out.println ();



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
 


        String out = "";


        out = out + "Original Data: \n";

        for (int i=0; i<origData.length; i++){

                     out = out + origData [i] + " ";

        }

        out = out + "\n";


        out = out + "Sorted Data: \n";

        for (int i=0; i<sortedData.length; i++){

            out = out + sortedData [i] + " ";

        }


        out = out + "\nMin: " + min + "\n";
        out = out + "Max: " + max + "\n";
        out = out + "Mean: " + mean + "\n";
        out = out + "Median: " + median + "\n";


        //Get min, max, mean. median by calling static methods.
        //get min and max by calling static methods.

        double minStatic = stat.computeMin(data);
        double maxStatic = stat.computeMax(data);
        double meanStatic = stat.computeMean(data);
        double medianStatic = stat.computeMedian(data);
        double[] staticSorted = stat.computeSortedData(data);
        
		//display the results from calling static methods
		
		
		
		out = out + "Results Using Static Methods:\n\n";
		
		out = out + "Sorted data:\n";
        for (int i=0; i<sortedData.length; i++){

            out = out + staticSorted [i] + " ";

        }
		
		//display mean and max obtained by calling static methods
		
        out = out + "Min: " + minStatic + "\n";
        out = out + "Max: " + maxStatic + "\n";
		out = out + "Mean: " + meanStatic + "\n";
		out = out + "Median: " + medianStatic +"\n";

        JOptionPane.showMessageDialog ( null, out);

	}

}
