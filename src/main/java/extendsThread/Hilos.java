/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package extendsThread;

/**
 *
 * @author LAB-3
 */
public class Hilos {

    public static void main(String[] args) {
        /*HiloA hA = new HiloA("Hilo Uno");
        HiloB hB = new HiloB("Dos Hilo ");
        hA.start();
        hB.start();*/
        
        CrearHilos hC = new CrearHilos(100,"Hilo A");
        CrearHilos hC2 = new CrearHilos(150,"Hilo B");
        hC.start();
        hC2.start();
        
        
    }
}
