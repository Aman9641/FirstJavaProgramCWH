package com.company;

public class Aman_methods {
    // Two types of method --- by Static or by object invocation
    // creating methods
    //in method - a & b  value copied in x & y
    /*static int logic(int x,int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
       c = logic(a, b);
        System.out.println(c);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c1);*/
    // but use static keyword for better practice
    // or by calling a method by creating object without using static keyword
    // method invocation using object creation

    /*int logic(int x,int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        Aman_methods obj = new Aman_methods();
        c = obj.logic(a, b);
        System.out.println(c);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = obj.logic(a1, b1);
        System.out.println(c1);*/

    // static void telljoke(){                                  // void - return nothing when we know our program return nothing it just print we want!
    // static associate with method class not object
    //   System.out.println("plagiarism!");
    static void change(int a) {
        a = 98;

    }
    static void change2(int [] arr){
        arr[0] = 76;
    }
    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int a){
        System.out.println("good morning " + a + " bro!");//int a is parameter
    }

//here value x will not bwe change it will print 45 nor 98 bcz x value copied in a
    public static void main(String[] args) {
        //case 1: changing the integer
       // int x = 45;
        //change(x);
       // System.out.println("the value of x after change is : " + x);
        //case 2 : changing in  array
       // int [] arr = {44,2,1,44,5334,70};

        //change2(arr);
        //System.out.println("The value of arr[0] after change  " + arr[0]);// in array case value will be changed bcz marks is reference marks inly store address of object
        //here reference copied

        //METHOD OVER LOADING
        foo();
        foo(3000);//3000 is argument "argument are actual"





    }

}


