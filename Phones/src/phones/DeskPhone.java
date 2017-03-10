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
public class DeskPhone implements ITelephone { //MARCARÁ ERROR DE ENTRADA PORQUE NO ESTAN LOS METODOS QUE DEBEMOS IMPLEMENTAR
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        isRinging = false;
    }

    @Override
    public void powerOn() {
            System.out.println("This is a deskphone. It is always on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now calling" + phoneNumber);
    }

    @Override
    public void answer() {
        if(this.isRinging){
            System.out.println("Answering call");
        } else {
            System.out.println("Phoe is not ringing");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (this.myNumber == phoneNumber){
            System.out.println("Calling my number");
            this.isRinging = true;
        } else {
            System.out.println("Not my number");
            this.isRinging = false;
        }   
        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
    
    
    
    
}
