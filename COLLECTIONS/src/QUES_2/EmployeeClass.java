package QUES_2;

public class EmployeeClass implements Comparable<EmployeeClass>{
    int Age;
    double Salary;
    String Name;
    EmployeeClass(String Name, int Age, double Salary){
        this.Name=Name;
        this.Age =Age;
        this.Salary =Salary;
    }
    public void showDetails(){
        System.out.println("Name: "+Name+" | Age: "+ Age +" | Salary: "+ Salary);
    }
    public double getSalary(){
        return Salary;
    }
    public String getName(){
        return Name;
    }
    @Override
    public int compareTo(EmployeeClass o) {
        return this.getName().compareTo(o.getName());
    }
}
