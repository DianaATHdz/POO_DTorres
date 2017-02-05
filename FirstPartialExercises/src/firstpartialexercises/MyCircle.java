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
public class MyCircle {
   private MyPoint center;  
   private int radius;
 
   // CONTRUCTORES
   public MyCircle() {
      this.center = new MyPoint();
      this.radius = 1;
   }
   public MyCircle(int x, int y, int radius) {
      this.center = new MyPoint(x, y); 
      this.radius = radius;
   }
   public MyCircle(MyPoint center, int radius) {
      this.center = center;  
      this.radius = radius;
   }
 
   //GET AND SET
   public double getRadius() {
      return this.radius;
   }
   public void setRadius(int radius) {
      this.radius = radius;
   }
 
   public MyPoint getCenter() {
      return this.center;  
   }
   public void setCenter(MyPoint center) {
      this.center = center;
   }
 
   public int getCenterX() {
      return this.center.getX(); 
   }
   public void setCenterX(int x) {
      this.center.setX(x);  
   }
  
   public int getCenterY() {
      return this.center.getY();  
   }
   public void setCenterY(int y) {
      this.center.setY(y);  
   }
  
   public int[] getCenterXY() {
      return this.center.getXY(); 
   }
   public void setCenterXY(int x, int y) {
      this.center.setXY(x, y);  
   }
   //TOSTRING
 @Override
   public String toString() {
      return "Circle[center=" + this.center + ",radius=" + this.radius + "]"; 
   }
 //SACAR EL AREA
   public double getArea() {
      return Math.PI * this.radius * this.radius;
   }
 //SACAR LA CIRCUNFERENCIA
   public double getCircumference() {
      return 2.0 * Math.PI * this.radius;
   }
 //SACAR LA DISTANCIA 
   public double distance(MyCircle another) {
      return center.distance(another.center);  
   }
 }