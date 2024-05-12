package as5;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


class Student {

    private int id;
    private String name;
    private double [] scores;

    public Student(int id, String name, double[] scores) {

                super();
                this.id = id;
                this.name = name;
                this.scores = scores.clone();

    }

    public String findGrade(){

        String grade="";
        double sum=0;
        for (int i=0;i<scores.length;i++){sum=sum+scores[i];}
        double average=sum/scores.length;

        if (average>=90.0)
            grade="A";
        else if (average>=80.0)
            grade="B";
        else if (average>=70.0)
            grade="C";
        else if (average >= 60.0)
        	grade="D";
        else
        	grade="F";
     
        return grade;

    }

    public int getId() {return id;}
    public String getName() {return name;}



}




class TestStudent{

    public static void main(String[] args){

                String in;

                int nStudents, nExams;



                in = JOptionPane.showInputDialog("Enter number of students");

                nStudents = Integer.parseInt(in);



                // Create an array of nStudents references

                Student [] st = new Student [nStudents];



                // Create nStudents objects using loop

                for (int i = 0;i < st.length;i++){

                            // Input one student data

                            in = JOptionPane.showInputDialog

                                   ("Enter one student data with items separated by commas");



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



                            //Create a Student object with the above data

                            st [i] = new Student (id, name, scores);

                }

                //Create an empty output String for each type of grade 

                String outA="", outB="", outC="", outD="", outF=""; 
                String grade="";

                for (int i = 0; i < st.length; i++){

                            grade = st[i].findGrade();

                            if (grade.equalsIgnoreCase("A")){
                            	outA=outA+ st[i].getId()+" "+ st[i].getName()+" ("+grade+")\n";
                            }

                            else if (grade.equalsIgnoreCase("B")){
                            	outB=outB+ st[i].getId()+" "+ st[i].getName()+" ("+grade+")\n";
                            }

                            else if (grade.equalsIgnoreCase("C")){
                            	outC=outC+ st[i].getId()+" "+ st[i].getName()+" ("+grade+")\n";
                            }

                            else if (grade.equalsIgnoreCase("D")){
                            	outD=outD+ st[i].getId()+" "+ st[i].getName()+" ("+grade+")\n";
                            }

                            else{
                            	outF=outF+ st[i].getId()+" "+ st[i].getName()+" ("+grade+")\n";
                            }

                }

               

                //concatenate strings

                String outAll=outA+outB+outC+outD+outF;



                // display output

                JOptionPane.showMessageDialog(null, outAll);

    }

}
