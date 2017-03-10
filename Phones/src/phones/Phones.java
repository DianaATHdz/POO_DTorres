/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phones;

/**
 *
 * @author DianaAlessa
 */
public class Phones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ITelephone dianaPhone;
        dianaPhone = new DeskPhone(2158936); 
        dianaPhone.powerOn();
        dianaPhone.callPhone(2158936);
        System.out.println(dianaPhone.isRinging());
        
        dianaPhone = new MobilePhone (2168599);
        dianaPhone.callPhone(2168599);
        System.out.println(dianaPhone.isRinging());  //╚ ╝◙ • Í
    }
    
}
