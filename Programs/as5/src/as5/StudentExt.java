package as5;
import java.util.StringTokenizer;
import javax.swing.*;
import java.io.*;
class StudentExt extends Student {

    private String gradeType;
    public StudentExt(int id, String name, double[] scores, String gradeType) {
                super(id, name, scores);
                this.gradeType = gradeType;
    }

    public String getGradeType() {return gradeType;}


    //This method over-rides the same method in the parent class

    public String findGrade ( ){
        //call the parent method findGrade for determine letter grade

        String grade = super.findGrade ( );

        //if the gradeType is Credit, change the grade

        if (gradeType.equalsIgnoreCase ("Credit")){

            if ( (grade.equalsIgnoreCase ("A")) ||
                 (grade.equalsIgnoreCase ("B")) || 
                 (grade.equalsIgnoreCase ("C")))

                        grade = "CR";

            else
                 grade = "NCR";

        }
        return grade;
    }

}
class TestStudentExt
{

  public static void main (String[] args) throws Exception

  {

    String in,  outAll, line;
    int studentCount;
    int nExams;
 

    //Create a BufferedReader object for inputting from a text file in.txt
    BufferedReader br = new BufferedReader(new FileReader("in.txt"));

    //Create a PrintWriter object for outputting to a text file out.txt.
    PrintWriter pw = new PrintWriter (new FileWriter("out.txt"));

    //input the first line of the file
 
   // This line contains the student count
    in = br.readLine();

    studentCount = Integer.parseInt(in);
    StudentExt [] st = new StudentExt [studentCount];

 

  

     //Set up a for loop.

     // In each pass through the loop,

     // input one student data, tokenize the data,

     // and create a StudentExt object

    for (int i=0; i<studentCount; i++)

    {

      //read one line containing one student data.

      in = br.readLine();



      //Create a StringTokenizer object and tokenize one student data.
      String delim = ",";
      String token;

      //Create StringTokenizer and supply it with String in and String delim

      StringTokenizer stk = new StringTokenizer (in, delim);
      token = stk.nextToken ().trim();
      int id=Integer.parseInt(token);  
      String name = stk.nextToken ().trim(); 



      token = stk.nextToken ().trim();
      nExams = Integer.parseInt(token); 


      //Using the input data, create a StudentExt object
      double[] scores=new double[nExams];

      //populate the array scores

      for (int j=0;j<nExams;j++){

                  token = stk.nextToken().trim();
                  scores[j]=Double.parseDouble(token);

      }



      String gradeType= stk.nextToken().trim(); 

      //Create a Student object

      st[i] = new StudentExt (id, name, scores, gradeType);
 

     }

           

     //String variables for accumulating output lines

     String outA="", outB="", outC="", outD="", outF="", outCr="", outNcr="";

 

    //Set up a for loop.

    //In each pass through the loop,

    //find grade of one student data, and depending on the grade,  

    //add a line of output to the corresponding output variable
    String grade;
    for (int i=0; i<studentCount; i++)

    {

        //Find one student grade
        grade = st[i].findGrade();
        //Depending on the grade,

        //add a line of output to the corresponding output variable

        if (grade.equalsIgnoreCase("A")){
        	outA=outA+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
        }

        else if (grade.equalsIgnoreCase("B")){
            outB=outB+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n"; 
        }

        else if (grade.equalsIgnoreCase("C")){
        	outC=outC+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
        }

        else if (grade.equalsIgnoreCase("D")){
        	outD=outD+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
        }

        else if (grade.equalsIgnoreCase("F")){
        	outF=outF+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
        }

        else if (grade.equalsIgnoreCase("CR")){
        	outCr=outCr+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
        }

        else if (grade.equalsIgnoreCase("NCR")){
        	outNcr=outNcr+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
        }
 

     }

 

    //Concatenate all student output in a single String variable outAll

    outAll=outA+outB+outC+outD+outF+outCr+outNcr;

 

    //Output contents of outAll to the output file using PrintWriter object.

    //make sure to also call flush( ) after calling println()

    pw.println(outAll);

    pw.flush();

 

    //Close file input/output objects (br and pw).

    if (br != null)

      br.close();

    if (pw != null)

      pw.close();

  }

}
/* Version 1
 class TestStudentExt{

    public static void main(String[] args){

                String in;

                int nStudents, nExams;

                in = JOptionPane.showInputDialog("Enter number of students");

                nStudents = Integer.parseInt(in);

                // Create an array of StudentExt references

                StudentExt [] st = new StudentExt [nStudents];

                // Create StudentExt objects using loop

                for (int i = 0;i < st.length;i++){

                            // Input one student data

                            in = JOptionPane.showInputDialog

                           ("Enter one student data, items separated by comma");



                            // Tokenize student data using StringTokenizer

                            //Create a String delim for specifying the delimiter (separator).

                            String delim = ",";

                            String token;

                            //Create StringTokenizer and supply it with String in and String delim

                            StringTokenizer stk = new StringTokenizer (in, delim);

                            token = stk.nextToken ().trim();

                            int id=Integer.parseInt(token);  

                            String name = stk.nextToken ().trim(); 



                            token = stk.nextToken ().trim();

                            nExams=Integer.parseInt(token); 



                            //create the array scores

                            double[] scores=new double[nExams];

                            //populate the array scores

                            for (int j=0;j<nExams;j++){

                                        token = stk.nextToken().trim();

                                        scores[j]=Double.parseDouble(token);

                            }



                            String gradeType= stk.nextToken().trim(); 

                            //Create a Student object

                            st [i] = new StudentExt (id, name, scores, gradeType);

                }

                String outA="", outB="", outC="", outD="", outF="", outCr="", outNcr=""; 
                String grade="";

                for (int i = 0; i < st.length; i++){

                            grade = st[i].findGrade();

                            if (grade.equalsIgnoreCase("A")){
                            	outA=outA+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
                            }

                            else if (grade.equalsIgnoreCase("B")){
                                outB=outB+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n"; 
                            }

                            else if (grade.equalsIgnoreCase("C")){
                            	outC=outC+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
                            }

                            else if (grade.equalsIgnoreCase("D")){
                            	outD=outD+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
                            }

                            else if (grade.equalsIgnoreCase("F")){
                            	outF=outF+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
                            }

                            else if (grade.equalsIgnoreCase("CR")){
                            	outCr=outCr+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
                            }

                            else if (grade.equalsIgnoreCase("NCR")){
                            	outNcr=outNcr+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
                            }



                }



                String outAll=outA+outB+outC+outD+outF+ outCr+outNcr;

                // display output

                JOptionPane.showMessageDialog(null, outAll);

    }

}
*/