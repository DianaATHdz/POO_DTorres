/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;

import java.util.ArrayList;

/**
 *
 * @author DianaAlessa
 */
public class Bank {
   
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }
     
    //ENCONTRAR [DIFERENTE MANERA AL DE BRANCH IGUAL CON CICLO FOR & IF]
      
    public int findBranch(String name) {
         for(int i = 0; i<branches.size(); i++){
            if(branches.get(i).getName().equals(name)){
                return i;
            }
        }
         return -1;
    }
    
    //AGREGAR
  
    public boolean addBranch(String name) {
        if(findBranch(name) == -1) {
            branches.add(new Branch(name));
            System.out.println("Branch:  " + name + "  created successfully.");
            return true;
        }
        System.out.println(name+ " already exists.");
        return false;
    }
   
    public boolean addCustomer(String name, String customerName, double amount) {
        int pos = findBranch(name);
        if (pos != -1) {
               System.out.println("Customer: " + customerName + " registered successfully. Initial amount: " + amount);
               return true;
           } else {
               System.out.println(customerName + " is already registered in branch " + name);
               return false;
           }
       }
    
   
    //Checar por dudas
     public boolean addTransaction(String branchName, String customerName, double transaction){                                         
        int pos = findBranch(branchName);
            if(pos == -1){
                System.out.println("Branch [" + branchName + "] does not exist.");
               return false;
        } else {
                 branches.get(pos).addTransaction(customerName , transaction);
                return true;
        }
    }
     
       public String customersTransactionList(String branchName) {
        int pos = findBranch(branchName);
        String result = "";
        if(pos != -1){
           result += branches.get(pos).getName() + ":\n";
            ArrayList<Customer> branchCustomers = branches.get(pos).getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++){
                Customer customer = branchCustomers.get(i);
                result += "Name:" + customer.getName() + "\n";
                    ArrayList<Double> transactions = customer.getTransactions(); 
                        for(int j = 0; j < transactions.size(); j++){ 
                            result += "No." + (j+1) + ":" + transactions.get(j) + "\n"; 
                        }
            }
            return result;
        }
        return "";
    }
       
        public String customersList(String branchName) { 
        int pos = findBranch(branchName);
        String result = "";
        if(pos != -1){
           result += branches.get(pos).getName() + ":\n";
            ArrayList<Customer> branchCustomers = branches.get(pos).getCustomers(); 
            for(int i = 0; i < branchCustomers.size(); i++){ 
                Customer customer = branchCustomers.get(i); 
               result += "Name:" + customer.getName() + "\n";
            }
            return result;
        }
        return "";
    }
}

