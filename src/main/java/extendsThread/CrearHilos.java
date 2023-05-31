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
public class CrearHilos extends Thread{
    int tiempo;

    public CrearHilos(int tiempo, String name) {
        super(name);
        this.tiempo = tiempo;
    }
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            try{
                Thread.sleep(tiempo);
                System.out.println((i+1) + " --- " + getName());
            }
            catch(InterruptedException ex){
                Logger.getLogger(HiloA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Termina thread " + getName());
    }
}
