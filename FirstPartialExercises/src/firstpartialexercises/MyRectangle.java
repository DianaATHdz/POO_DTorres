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
public class MyRectangle {
        private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    //CONSTRUCTORES
    public MyRectangle (int x1, int y1, int x2, int y2){
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);   
    }
    
    public MyRectangle(MyPoint v1, MyPoint v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    
    //TOSTRING 
     @Override
   public String toString() {
      return "MyRectangle[v1=" + this.v1 + ",v2=" + this.v2 +"]"; 
   }
 
       //SACAR AREA
    public double getArea() {
        return (this.v1.getX()-this.v2.getX())*(this.v2.getY()-this.v1.getY());
    }
    
    //SACAR PERIMETRO
    public double getPerimeter() {
        return ((this.v1.getX()-this.v2.getX())+(this.v2.getY()-this.v1.getY()))*2;
    }
    
}
