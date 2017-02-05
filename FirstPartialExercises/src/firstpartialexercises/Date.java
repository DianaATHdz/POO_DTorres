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
public class Date {
    private int day;
    private int month;
    private int year;
    
    //CONSTRUCTORES
    public Date (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    //GET 
    public int getDay(){
        return this.day;
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getYear(){
        return this.year;
    }
    
    //SETTER
    public void setDay (int day){
        this.day =day;
    }
    
    public void setMonth (int month){
        this.month = month;
    }
        
    public void setYear (int year){
        this.year = year;
    }
    
    public void setDate (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    //TO STRING
    @Override
    public String toString(){
        //if (this.day < 10 && this.month < 10){
        //return "0"+this.day+"/0"+this.month+"/"+this.year;
        //}
        //if (this.day < 10 && this.month > 10){
        //return "0"+this.day+"/"+this.month+"/"+this.year;
        //}
        //if (this.day > 10 && this.month < 10){
        //return this.day+"/0"+this.month+"/"+this.year;
        //}
        //else {
        //return this.day+"/"+this.month+"/"+this.year;
        //}
        
        return String.format("%02d", this.day)+"/"+String.format("%02d", this.month)+"/"+this.year;
    }    
}
