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
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour, int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
    }
//GET
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
//SET
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    public void setTime (int hour, int minute, int second){
        this.hour=minute;
        this.minute =minute;
        this.second=second;
    }
//TO STRING
    @Override  //Siempre un override arriba
     public String toString(){
         return String.format("%02d", this.hour)+":"+String.format("%02d", this.minute)+":"+this.second;
     }
 
//SIGUIENTE SEGUNDO    
    public Time nextSecond(){
        this.second++;
        if (this.second==60){
            this.second=0;
            this.minute++;
        }
        
        if (this.minute==60){
            this.minute=0;
            this.hour++;
        }
        
       if (this.hour==60){
            this.hour=0;
        }
       return this;
    }
    
//SEGUNDO ATRÁS 
    
    public Time previousSecond(){
    this.second--;
        if (this.second==1){
            this.second=59;
            this.minute--;
        }
        
        if (this.minute==1){
            this.minute=59;
            this.hour++;
        }
        
       if (this.hour==1){
            this.hour=23;
        }
       return this;
    }
}
