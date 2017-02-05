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
public class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee (int id, String firstName, String lastName, int salary){
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.salary = salary;
    }
    
    //GET
    
    public int getID (){
        return this.id;
    }
    
    public String firstName (){
        return this.firstName;
    }
    
    public String lastName (){
        return this.lastName;
    }
    
    public String Name (){
        return this.firstName + this.lastName;
    }
    
    public int getSalary (){
        return this.salary;
    }
    
    //SET
    
    public void setSalary(int salary){
    this.salary = salary;
    }
    
    //GET
    
    public int getAnnualSalary (){
    return (this.salary*12);
    }
    
    public int raiseSalary(int percent){
        this.salary += this.salary*percent/100;
        return this.salary;
    }
    
    //TOSTRING
    
    @Override
    public String toString(){
    return "Employee[id="+this.id+",name="+this.Name()+",salary="+this.salary+"]";      
    }
    
    
    
}
