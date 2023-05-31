/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementsRunnable;

/**
 *
 * @author LAB-3
 */
public class Principal {
    public static void main(String[] args) {
        
        Thread h1 = new Thread(new HiloRunnable(), "Hilo 1");
        Thread h2 = new Thread(new HiloRunnable(), "Hilo Dos");
        h1.start();
        h2.start();
        
        
    }
    
}
