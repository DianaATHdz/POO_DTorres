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
public class Branch {
    
    private String name;
    private ArrayList<Customer> customers;

    //CONSTRUCTOR
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    //GETS
    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    
    //ENCONTRAR CLIENTE USANDO CICLO FOR & IF
    
       public int findCustomer(String name){
         for(int i = 0; i<customers.size(); i++){
            if(customers.get(i).getName().equals(name)){
                return i;
            }
        }
         return -1;
    }

    //AÑADIR TRANSACCIÓN
    
       public boolean addTransaction(String name, double amount) {
        int pos = findCustomer(name);
        if(pos == -1){
            System.out.println("Customer does not exist.");
            return false;
        }
        customers.get(pos).addTransaction(amount);
        return true;
    }
       
    //AÑADIR CLIENTE
    public boolean addCustomer(String name, double amount) {
        if (findCustomer(name) == -1) {
            customers.add(new Customer(name, amount));
            System.out.println("Customer registered." + "[Name: " + name + ", Initial amount = " + amount +"]");
            return true;
        }
        System.out.println("Customer already exists.");
        return false;
    }
}
