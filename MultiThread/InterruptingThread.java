/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class InterruptingThread extends Thread{
    
    // Run method is executed when the first thread started
    public void run(){
        System.out.println("I fell sleepy. Wake me in eight hours");
        try{
            // Sleep for eight hours
            Thread.sleep(100 * 60 * 40 *8);
            System.out.println("That was a nice nap");
        }catch(InterruptedException ie){
            System.err.println("Just five more minutes");
        }
    }
    
    public static void main(String[] args) throws IOException {
        // Create a sleepy thread
        Thread sleepy = new InterruptingThread();
        //Start thread sleeping
        sleepy.start();
        //Prompt user and wait for input
        System.out.println("Press enter to interrupt the thread");
        System.in.read();
        //InterrputingThread the thread
        sleepy.interrupt();
    }
}
