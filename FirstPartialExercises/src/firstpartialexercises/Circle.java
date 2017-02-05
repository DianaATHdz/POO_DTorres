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
public class Circle { //declarar atributos
    private double radius;
    
     public Circle() {  //Constructor
         this (1.0);
     }
    
    public Circle (double radius){
    this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
     public void setRadius (double radius){
         this.radius = radius;
     }

     public double getArea(){
         return Math.PI*(Math.pow(this.radius,2));
     }
    
     public double getCircumference(){
         return Math.PI*2*(Math.pow(this.radius,1));
     }
    
     @Override  //Siempre un override arriba
     public String toString(){
         return "Circle[radius="+this.radius+"]";
     }
}
