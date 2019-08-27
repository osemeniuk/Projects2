package Test;

public class Employee {

// KEEP TRACK ON pairs of '{', '}' and ';'
// AVOID COMPILATION ERRORS

    // 1) design class Employee
// class should contain:
// - private fields (2-3 will be enough)
    private int empID=0;
    private String name= "dafault";
    private String surname = "default";

    // - static initializer, which print "employee class loaded"
    static {
        System.out.println("employee class loaded");
    }

    // - instance initializer, which print "employee object initialized"
    {
        System.out.println("employee object constructed");
    }

    // - public constructor with no arguments, which print "employee object constructed"
    public Employee() {
        System.out.println("employee object constructed");
    }

    // - public constructor with arguments to initialize all fields, which print "employee object constructed"
    public Employee(int id, String name, String surname) {
        System.out.println("employee object constructed");
    }

    // - [OPTIONAL] - define method for each field to set some values (so called setters) -
    public void setID(int newID) {
        this.empID = newID;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    // - [OPTIONAL] - define method for each field to get some values (so called getters)
    public int getID() {
        return empID;
    }

    public String getName() {
        return name;
    }
// - [OPTIONAL] - override toString method from class Object

    @Override
    public String toString() {
        return super.toString();
    }

//TODO

// 2) define main method in class Employee
// inside main method create 3 object of Employee class:
public static void main(String[] args) {
    Employee emp1 = new Employee ();
    Employee emp2 = new Employee ();
    Employee emp3 = new Employee ();
    // - [OPTIONAL] - invoke setters/getters
    System.out.println(emp1.getID());
    System.out.println(emp2.getName());
    emp1.setID(3);
    emp2.setName("testName");
    System.out.println(emp1.getID());
    System.out.println(emp2.getName());
    // invoke and print toString method of each object
    System.out.println(emp1.toString());
    System.out.println(emp2.toString());
    System.out.println(emp3.toString());
}
// Run current class, check output
//TODO

}
