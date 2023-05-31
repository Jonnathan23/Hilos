/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementsRunnable;

/**
 *
 * @author LAB-3
 */
public class HiloRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " --- " + Thread.currentThread().getName());
        }
        System.out.println("Finalizó el proceso " + Thread.currentThread().getName());
    }
    
}
