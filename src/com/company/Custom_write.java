package com.company;
class Employee {
    int id;
    String name;
    int salary;
    //method
    public void printDetails(){
        System.out.println("my id is "+ id);
        System.out.println("and my name is "+ name);
    }
    public int getSalary(){
        System.out.println("my salary is " + salary);
        return salary;
    }
}


public class Custom_write {
    public static void main(String[] args) {
        System.out.println("the class is custom class");
        Employee aman = new Employee();//instantiate a new employee object
        Employee harry = new Employee();

        //setting attributes for aman
        aman.id = 12;
        aman.name = "Aman Jha";
        aman.salary= 56;
        //setting attributes for aman
        harry.id = 96;
        harry.name = "Harry";
        harry.salary=34;
        //printing Attributes
       // System.out.println(harry.id );
        //System.out.println(harry.name);
        //printing by calling methods

        aman.printDetails();
        aman.getSalary();
        harry.printDetails();
        harry.getSalary();
    }
}

