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
public class Circle1 { //Declarar atributos
    private double radius;
    private String color;
    
    public Circle1() {  //Constructor
    radius = 1.0;
    color = "red";
    //this(1.0,"red");
    }
    public Circle1(double radius){
    this.radius = radius;
    color = "red";
    //this(radius,"red");
    }
    public Circle1(String color){
        this.radius = 1.0;
        this.color = color;
    //this(1.0,color);
    }
    
    public Circle1 (double radius, String color){
    this.radius= radius;
    this.color = color;
    }
    
    //get
    public double getRadius (){
        return this.radius;
    }
    
     public String getColor (){
        return this.color;
    }
     //Set
     //void porque no regresa nada
     public void setRadius (double radius){
         this.radius = radius;
     }
     
     public void setColor (String color){
         this.color = color;
     }
     
     //FUNCIÓN TOSTRING
     @Override  //Siempre un override arriba
     public String toString(){
         return "Circle[radius="+this.radius + ",color=" +this.color + "]";
     }
     
     //Sacar el area
     public double getArea(){
         return Math.PI*(Math.pow(this.radius,2));
     }
     
    
}
