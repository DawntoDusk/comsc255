package as8;
import javax.swing.JOptionPane;
public class TestEmployee { 

    public static void main(String[] args) {

	    String in, out;
	
	    String name;
	
	    double salary, pctBonus, bonus, travelExpense;
	
	    int optionCount;
	
	    //create an array of 6 Employee references
	
	    Employee[] emp=new Employee[6];
	
	    //create a empIndex to index into status array
	
	    int empIndex=0;
	
	    //create three Worker objects and store their references in status array        
	
	
	
	    for (int i=0; i<3; i++){
	
	               name= JOptionPane.showInputDialog ("Enter name");
	
	               in= JOptionPane.showInputDialog ("Enter salary");
	
	               salary=Double.parseDouble(in);
	
	               in= JOptionPane.showInputDialog ("Enter bonus percentage");
	
	               pctBonus=Double.parseDouble(in);
	
	               //create a Worker object and store its reference in emp array
	
	                emp[empIndex]=new Worker(name,salary,pctBonus);
	
	                empIndex++;
	
	    }
	
	    //create two Manager objects and store their references in emp array 
	
	    for (int i=0; i<2; i++){
	
	        name= JOptionPane.showInputDialog ("Enter name");
	
	        in= JOptionPane.showInputDialog ("Enter salary");
	
	        salary=Double.parseDouble(in);
	
	        in= JOptionPane.showInputDialog ("Enter bonus percentage");
	
	        pctBonus=Double.parseDouble(in);
	
	        in= JOptionPane.showInputDialog ("Enter travel expense");
	
	        travelExpense=Double.parseDouble(in);
	
	        //create a Worker object and store its reference in emp array
	
	         emp[empIndex]=new Manager(name,salary,pctBonus,travelExpense);
	
	         empIndex++;
	
	    }
	
	   //create one Executive object and store its references in emp array      
	
	    for (int i=0; i<1; i++){
	
	        name= JOptionPane.showInputDialog ("Enter name");
	
	        in= JOptionPane.showInputDialog ("Enter salary");
	
	        salary=Double.parseDouble(in);
	
	        in= JOptionPane.showInputDialog ("Enter bonus percentage");
	
	        pctBonus=Double.parseDouble(in);
	
	        in= JOptionPane.showInputDialog ("Enter travel expense");
	
	        travelExpense=Double.parseDouble(in);
	
	        in= JOptionPane.showInputDialog ("Enter option count");
	
	        optionCount=Integer.parseInt(in);           
	
	        //create a Worker object and store its reference in emp array
	
	         emp[empIndex]=new Executive (name,salary,pctBonus,travelExpense,optionCount);
	
	         empIndex++;
	
	    }
	
	    //outW will accumulate output for workers
	
	    //outM will accumulate output for manager
	
	    //outE will accumulate output for executive
	
	    //outAll will be the accumulated output for all
	
	    String outAll, outW="", outM="", outE="";
	
	    for (int i=0; i < emp.length; i++){
	
	        //Methods in the Employee class can be accessed without type casting
	
	        name = emp[i].getName ( );
	
	        salary = emp[i].getSalary ( );
	
	        //computeBonus is polymorphic call
	
	        bonus = emp[i].computeBonus();
	
	        //Methods that are not in the Employee class can be accessed using type casting
	
	        //Type casting should be done within an if statement containing instanceof
	
	        //The instanceof clause is used to ensure a safe down casting (widening).
	
	        if (emp[i] instanceof Worker){
	
	                    //pctBonus = ( (Worker) emp[i] ).getPctBonus ( );
	
	                    pctBonus = ((Worker) emp[i]).getPctBonus();
	
	                    //accumulate Worker output in outW
	
	                    outW +=  "Name:" + name + "\n";
	
	                    outW +=  "Salary:" + salary + "\n";
	
	                    outW +=  "PctBonus:" + pctBonus + "\n"; 
	
	                    outW +=  "Bonus:" + bonus + "\n"; 
	
	        }
	
	        else if (emp[i] instanceof Manager) {
	
	                    pctBonus = ( (Manager) emp[i] ).getPctBonus ( );
	
	                    //write one line code below to get travelExpense for the manager	
	                    travelExpense = ((Manager)emp[i]).getTravelExpense();
	
	                    //accumulate Manager output in outM
	
	                    outM +=  "Name:" + name + "\n";
	
	                    outM +=  "Salary:" + salary + "\n";
	
	                    outM +=  "PctBonus:" + pctBonus + "\n"; 
	
	                    outM +=  "Bonus:" + bonus + "\n"; 
	
	                    outM +=  "Travel Expense:" + travelExpense + "\n"; 
	
	        }
	
	        else if (emp[i] instanceof Executive) {
	
	                    pctBonus = ( (Executive) emp[i] ).getPctBonus ( );
	
	                    //write one line code below to get travelExpense for the executive
	                    travelExpense = ((Executive)emp[i]).getTravelExpense();
	                    //write one line code below to get optionCount for the executive
	                    optionCount = ((Executive)emp[i]).getOptionCount();
	
	                    //accumulate Executive output in outE
	
	                    outE = outE + "Name'" + name + "\n";
	
	                    outE +=  "Salary:" + salary + "\n";
	
	                    outE +=  "PctBonus:" + pctBonus + "\n"; 
	
	                    outE +=  "Bonus:" + bonus + "\n"; 
	
	                    outE +=  "Travel Expense:" + travelExpense + "\n"; 
	
	                    outE +=  "Option Count:" + optionCount + "\n";
	
	        }
	
	    }
	
	    //After getting out of the for loop, concatenate various outputs
	
	    outAll = outW + outM + outE;
	
	    //display outAll
	
	    JOptionPane.showMessageDialog(null, outAll);

    }

}

