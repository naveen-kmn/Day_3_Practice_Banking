package com.blp.bankingapp;

import java.util.Scanner;

public class BankApp
{
        public static void main(String[] args)
        {
            acc();
            BankApp obj1 = new BankApp();
            obj1.openAccount();
        }

        public static void acc()
        {
            System.out.println("Welcome to Indian Overseas Bank");
        }

        public void openAccount()
        {
            Scanner s = new Scanner(System.in);

            System.out.print("Enter Name: ");
            String customerName = s.nextLine();

            System.out.print("Enter Account No: ");
            int accNo = s.nextInt();

            System.out.print("Enter age:");
            int age = s.nextInt();

            System.out.print("Enter Balance : ");
            int balance = s.nextInt();

            System.out.println("Enter the Name of the Customer: "+customerName);
            System.out.println("Account number: "+accNo);
            System.out.println("Age:" +age);
            System.out.println("Balance:" +balance);
        }
}
