package com.company;

import java.util.Scanner;


public class MainClass {
    public static void main(String[] args)
    {
       AtmInter ope = new AtmOperation();
        int atmnumber= 12345;
        int atmpin=123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter Atm Number : ");
        int atmNumber = in.nextInt();
        System.out.println("Enter pin :");
        int pin = in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin))
        {
           while (true)
           {
               System.out.println("1. Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
               System.out.println("Enter your choice :");
               int ch = in.nextInt();
               if(ch == 1)
               {
                   ope.viewBalance();


               }
               else if(ch == 2)
               {
                   System.out.println("Enter Amount to Withdraw ");
                   double withdrawAmount = in.nextDouble();
                   ope.withdrawAmount(withdrawAmount);

               }
               else if (ch == 3)
               {
                   System.out.println("Enter Amount to Deposit : ");
                   double depositAmount = in.nextDouble();//80K
                   ope.depositAmount(depositAmount);


               }
               else if (ch == 4)
               {
                   ope.viewMiniStatement();

               }
               else if (ch == 5)
               {
                   System.out.println("Collect your ATM card\n Thank you for using ATM Machine");
                   System.exit(0);
               }
               else
               {
                   System.out.println("Please enter correct choice");
               }
           }

        }
        else
        {
            System.out.println("Incorrect Atm number or pin");
            System.exit(0);
        }
    }
}
