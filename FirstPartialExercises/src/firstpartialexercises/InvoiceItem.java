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
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
   public InvoiceItem(String id, String desc, int qty, double unitPrice){
       this.id = id;
       this.desc = desc;
       this.qty = qty;
       this.unitPrice = unitPrice;
   }
    
   //GET & SET
   
    public String getID (){
        return this.id;
    }
    
    public String getDesc (){
        return this.desc;
    }
    
    public int getQty (){
        return this.qty;
    }
    //SET QTY
    public void setQty(int qty){
        this.qty = qty;
    }
    //GET
    public double getUnitPrice (){
        return this.unitPrice;
    }
    //SET UP
    public void setUnitPrice (){
        this.unitPrice = unitPrice;
    }
    
    //GET
    public double getTotal(){
        return (this.unitPrice*this.qty);
    }
    
    @Override
    public String toString(){
    return "Invoice Item[id="+this.id+",desc="+this.desc+",qty="+this.qty+",unitPrice="+this.unitPrice+"]";      
    }
    
}

