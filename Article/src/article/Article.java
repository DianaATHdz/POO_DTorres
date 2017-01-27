/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package article;

/**
 *
 * @author DianaAlessa
 */
public class Article { //Declarar Atributos
public int sku;
private int existence;
private double price;
private double cost;
public String description;

 public Article (){ //Constructor
        this(000000000,00,00.00,00.00,"No description"); 
    }
    
public Article (int sku, int existence, double price, double cost, String description){
    this.sku = sku;
    this.existence = existence;
    this.price = price;
    this.cost = cost;
    this.description = description;
}
//Methods
public void purchase (int quantity, double price){
    this.existence+=quantity;
    this.cost=price; 
}

public boolean sale (int quantity){
    if (existence > 0){
    existence-=quantity;
     return true;
         } else {
             System.out.println("No existence");
             return false;
         }
    }
public boolean checkExistence (){
    this.existence=existence;
    return true;
    }
public void updatePrice(double price){
    this.price=price;
    }

}
