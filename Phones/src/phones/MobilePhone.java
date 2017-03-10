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
public class MobilePhone implements ITelephone {
    
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        isRinging = false;
        isOn = false;
    }

    @Override
    public void powerOn() {
        if (!isOn){
             System.out.println("Turning on the mobile phone");
             isOn = true;
        }
    }

    @Override
    public void dial(int phoneNumber) {
        if (this.isOn){
        System.out.println("Now calling" + phoneNumber);
        }
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
        if (this.isOn && this.myNumber == phoneNumber){
            System.out.println("Calling my number");
            this.isRinging = true;
        } else {
            System.out.println("Not my number of cell is off");
            this.isRinging = false;
        }   
        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
    
    
    
    
    
}
