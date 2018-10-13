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
public class SuspendingThread extends Thread{
    
    
    @Override
    public void run(){
        int count = 1;
        System.out.println("I can count. Watch me go!");
        for(;;){
            System.out.print(count++ +" ");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){
            
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Thread counter = new SuspendingThread();
        counter.start();
        System.out.println("Press any enter to suspend the thread");
        System.in.read();
        counter.suspend();
        System.out.println("Press any enter to resume the thread");
        System.in.read();
        counter.resume();
        System.out.println("Press any enter to stop the thread counting");
        System.in.read();
        counter.stop();
    }
}
