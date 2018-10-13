/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author ASUS
 */
public class RunnableMain {
    public static void main(String[] args) {
        Runnable r1 = new KirimRunnable(1);
        Runnable r2 = new TerimaRunnable(2);
        
        System.out.println("Running first Thread");
        Thread t1 = new Thread(r1);
        
        System.out.println("Running second Thread");
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
    }
}
