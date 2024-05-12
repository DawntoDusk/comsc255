package as8;

public abstract class Employee {

    public String name;
    public double salary;

    public Employee (String n, double s){
                name=n;
                salary=s;
    }

    public String getName(){return name;}

    public double getSalary ( ) {return salary;}

    //abstract method
    public abstract double computeBonus ( );

}

