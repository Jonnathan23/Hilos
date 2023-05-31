/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extendsThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LAB-3
 */
public class HiloB extends Thread{

    public HiloB(String name) {
        super(name);
    }
    
    
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            try{
                Thread.sleep(250);
                System.out.println((i+1) + " --- " + getName());
            }
            catch(InterruptedException ex){
                Logger.getLogger(HiloA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Termina thread " + getName());
    }
    
}
