/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author DianaAlessa
 */
public class Book1 {
    private String name;
    private Author author;
    private double price;
    private int qty;

    //CONSTURCTOR BONITO
    public Book1 (String name, Author author, double price){
    this.name =name;
    this.author =author;
    this.price =price;
    }
    
    public Book1 (String name, Author author, double price, int qty){
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = 0;
    }
    
    //GET AND SET

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
 //TOSTRING
              @Override  //Siempre un override arriba
     public String toString(){
         return "Book[name="+ this.name + "," + this.author.toString() +", price =" +this.price + ", qty="+this.qty;
     }
    
}
