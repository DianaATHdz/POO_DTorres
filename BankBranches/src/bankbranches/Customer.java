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
public class Customer {

    private String name;
    private ArrayList<Double> transactions;
    
    //CONSTRUCTOR
    public Customer(String name, double firstTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(firstTransaction);
    }
    
    //GETS
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    
    
    //AÑADIR TRANSACCION
     
    public void addTransaction(double amount) {
        this.transactions.add(amount);
         System.out.println("Successful transaction.");
    }
    
    
    
}
