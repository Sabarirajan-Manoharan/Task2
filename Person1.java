package Task2;

class Person1 {

    //base class Task2.Person with attributes name and age.
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

//subclass Task2.Employee that inherits from Task2.Person
class Employee extends Person1{

    //adds attributes like employeeID and salary.
    private String employeeID;
    private double salary;

    //super keyword to initialize the Task2.Person attributes
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age);
        this.employeeID=employeeID;
        this.salary = salary;
    }

    public void displayEmployee(){

        displayPerson();

        System.out.println("Emp ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("sabarirajan",33,"0123", 15000);
        emp.displayEmployee();
    }
}