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
public class Author {
    private String name;
    private String email;
    private char gender;
    //CONSTRUCTOR
    public Author (String name, String email, char gender){
        this.name =name;
        this.email=email;
        this.gender= gender;
    }
    //GET AND SET
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
            return gender;
    }
    
    //TOSTRING
              @Override  //Siempre un override arriba
     public String toString(){
         return "Author[name="+this.name + ",email=" +this.email + ", gender="+this.gender+ "]";
     }
    
    
    
    
    
    
}
