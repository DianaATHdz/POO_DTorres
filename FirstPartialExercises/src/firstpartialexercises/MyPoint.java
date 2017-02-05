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
public class MyPoint {
    private int x;
    private int y;
    
//CONSTRUCTORES BEBÉS ACABADOS DE NACER 
    public MyPoint(){
       this.x=0;
       this.y=0;
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    
//GETS AND SETS MUY CHULOS Y UN POQUITO TIMIDOS

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
//PODER EL XY ASÍ COMO CORDENADA BIEN CHIDO APOCO NO CARNAL
    
   public int[] getXY() {
      int[] results = new int[2];
      results[0] = this.x;
      results[1] = this.y;
      return results;
   }

   public void setXY(int x, int y) {
      this.x = x;
      this.y = y;
   }

//TOSTRING
    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    
 //DISTANCIAS CALCULADAS 
    public double distance(int x, int y) {   
        int xD = this.x - x;
        int yD = this.y - y;
        return Math.sqrt(xD*xD + yD*yD);
        }
   
    public double distance(MyPoint another) {
        int xD = this.x - another.x;
        int yD = this.x - another.y;
        return Math.sqrt(xD*xD + yD*yD); 
    }
    
    public double distance() {
        int xD = this.x - 0;
        int yD = this.x - 0;
        return Math.sqrt(xD*xD + yD*yD); 
    }
}
    

    
