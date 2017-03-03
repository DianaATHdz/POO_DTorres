/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;

import java.util.Scanner;
import static javax.swing.UIManager.getString;

/**
 *
 * @author DianaAlessa
 */
public class BankBranches {

 
    public static Scanner scanner = new Scanner (System.in);
    public static Bank myBank = new Bank ();

    public static void main(String[] args) {

        Bank myBank = new Bank ();
        int option;
       
         printMenu();
         option = scanner.nextInt();
         while (option >0 && option <5){
             switch(option){
                 case 1:
                     addBranch();
                     break;                    
                 case 2: 
                     addCustomer();
                     break;
                 case 3:
                     addTransaction();
                     break;
                 case 4:
                     PrintCustomerList();
                     break;

                 default: 
                     break;          
             }
             
             System.out.print("Option? ");
             option = scanner.nextInt();
         }
      
    }
    
    public static void printMenu(){
        System.out.println("Menu: ");
        System.out.println("0. Quit");
        System.out.println("1. Add branch");
        System.out.println("2. Add customer");
        System.out.println("3. Add transaction");
        System.out.println("4. Print customer list");
        
        
    }
    
    public static void addBranch(){
      String branchName;
        
      Scanner scanner = new Scanner (System.in);
      System.out.println("Add Branch:");  
      branchName = scanner.nextLine();
         
      if(myBank.addBranch(branchName)){
          System.out.println("Branch sucessfuly added");
      } else {
          System.out.println("Branch already in list");
      }
    }
    
    public static void addCustomer(){
      String branchName, customerName;
      double amount;
        
      Scanner scanner = new Scanner (System.in);
      System.out.print("Add Branch: ");  
      branchName = scanner.nextLine();
      System.out.print("Add Customer: ");  
      customerName = scanner.nextLine();
      System.out.print("Add amount: ");  
      amount = scanner.nextDouble();
      
      if(myBank.addCustomer(branchName,customerName, amount)){
          System.out.println("Customer sucessfuly added");
      } else {
          System.out.println("Customer already in list");
      }
      
    }
    
    public static void addTransaction(){
      String branchName, customerName;
      double amount;
        
      Scanner scanner = new Scanner (System.in);
      System.out.print("Add Branch: ");  
      branchName = scanner.nextLine();
      System.out.print("Add Customer: ");  
      customerName = scanner.nextLine();
      System.out.print("Add amount: ");  
      amount = scanner.nextDouble();
      
      if(myBank.addTransaction(branchName, customerName, amount)){
          System.out.println("Transaction added");
      } else {
          System.out.println("Transaction already int list");
      }
      
    }
    
    public static void PrintCustomerList(){
                int option;
                String branchName;
                 
                Scanner keyboard = new Scanner(System.in); 
                    do{
                    System.out.println("0. Exit");
                    System.out.println("1. Print customer list");
                    System.out.println("2. Print customer list with transactions");
                    option=keyboard.nextInt();
                    }while (option >0 && option <3);
                            switch (option) {
                                case 1:
                                    branchName = getString("Branch name");
                                    System.out.println(myBank.customersList(branchName));
                                    break;
                                case 2:
                                    branchName = getString("Branch name");
                                    System.out.println(myBank.customersTransactionList(branchName));
                                    break;
                                default:
                                    break;
                            }
                    }
    
    public static double getDouble(String d){
    double data;
    Scanner keyboard = new Scanner (System.in);
    System.out.println(d);
    data = keyboard.nextDouble();
    return data;
    }
    public static String getString(String d){
    String data;
    Scanner keyboard = new Scanner (System.in);
    System.out.println(d);
    data = keyboard.nextLine();
    return data;
    }
    public static void exit(){
        System.out.print("SEE YOU :)");
        System.exit(0);
    }
}

