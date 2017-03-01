/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;

import java.util.Scanner;

/**
 *
 * @author DianaAlessa
 */
public class PhoneContacts {
    
    public static Scanner scanner = new Scanner (System.in);
    public static MobilePhone myPhone = new MobilePhone();

    public static void main(String[] args) {

        MobilePhone myPhone = new MobilePhone ();
        int option;
       
         printMenu();
         option = scanner.nextInt();
         while (option >0 && option <7){
             switch(option){
                 case 1:
                     addContact();
                     break;                    
                 case 2: 
                     updateContact();
                     break;
                 case 3:
                     removeContact();
                     break;
                 case 4:
                     queryContact();
                     break;
                 case 5:
                     listContact();
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
        System.out.println("1. Add contact");
        System.out.println("2. Update contact");
        System.out.println("3. Delete contact");
        System.out.println("4. Query contact");
        System.out.println("5. List all contact");
        
        
    }
    
    public static void addContact(){
        String name;
        int number;
        
      Scanner scanner = new Scanner (System.in);
      System.out.println("Contact name: ");  
      name = scanner.nextLine();
      
      System.out.println("Telephone number: ");  
      number = scanner.nextInt();
      
      if(myPhone.addContact(name,number)){
          System.out.println("Contact sucessfuly added");
      } else {
          System.out.println("Contact already in list");
      }
    }
    
    public static void removeContact(){
        String name;
        int number;
        
      Scanner scanner = new Scanner (System.in);
      System.out.print("Contact name: ");  
      name = scanner.nextLine();
      System.out.print("Telephone number: ");  
      number = scanner.nextInt();
      
      if(myPhone.removeContact(name,number)){
          System.out.println("Contact sucessfuly delete");
      } else {
          System.out.println("Contact doesn't exist");
      }
      
    }
    
    public static void updateContact(){
        String name;
        int number;
        
      Scanner scanner = new Scanner (System.in);
      System.out.print("Contact name: ");  
      name = scanner.nextLine();
      System.out.print("Telephone number: ");  
      number = scanner.nextInt();
      
      if(myPhone.updateContact(name,number)){
          System.out.println("Updated contact");
      } else {
          System.out.println("Contact doesn't exist");
      }
      
    }
    
    public static void queryContact(){
        String name;
        Scanner scanner = new Scanner (System.in);
        name = scanner.nextLine();
        System.out.println(myPhone.queryContact(name));
      
    }
    
     public static void listContact(){ 
     Scanner scanner = new Scanner (System.in);
     myPhone.listContacts();
     }
}
