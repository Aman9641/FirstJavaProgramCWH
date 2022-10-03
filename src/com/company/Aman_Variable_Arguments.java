package com.company;

public class Aman_Variable_Arguments {
   static int sum(int ...arr){
       int result = 0;
       for(int a :arr){
           result += a;
       }
       return result;
   }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("sum " + sum(10,23,43,223,23));
        System.out.println("sum " + sum(4,7,7,8));
    }
}
