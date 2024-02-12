package as1;

import javax.swing.JOptionPane;

public class Rectangle {

	public static void main(String[] args) {
		String in, out;
        double l, w;
        double area, perim;

        in=JOptionPane.showInputDialog ("Enter length");
        l=Double.parseDouble (in);

        in=JOptionPane.showInputDialog ("Enter width");
        w=Double.parseDouble (in);

        //call method computeArea to find area
        area = computeArea (l, w);


        //write code below to call method computePerim
        perim = computePerim (l, w);         


        //build output string using string concatenation

        out="Length: " + l + "\n";
        out= out + "Width: " + w + "\n";
        out= out + "Area: " + area + "\n";
        out= out + "Perimeter: " + perim + "\n";

       JOptionPane.showMessageDialog (null, out); 

	}
	
	public static double computeArea (double length, double width)

	{
        double area=0;
        area = length * width;
        return area;                             
	}

	 

	public static double computePerim (double length, double width)

	{
       	double perim=0;
       	perim = 2*length + 2*width;
        return perim;

	}

}
