/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author ASUS
 */
public class RunnableThread implements Runnable{
    
    // Run method is the first excuted when running this Runnable class
    public void run(){
        System.out.println("I'm an instanmce of the java.lang.Runnable interface");
    }
    
    // Main method to create and start thread
    public static void main(String[] args) {
        System.out.println("Creating Rnnable Object");
        
        //Create runnabel object
        Runnable run = new RunnableThread();
        
        // Create a thread and pass the runnable object
        System.out.println("Creating first thread");
        Thread t1 = new Thread(run);
        
        //Creating the second thread and pass the runnable object
        System.out.println("Creating second thread");
        Thread t2 = new Thread(run);
        
        // Start both threads
        System.out.println("Starting both threads");
        t1.start();
        t2.start();
    }
}
