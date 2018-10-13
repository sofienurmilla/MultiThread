/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author ASUS
 */
public class WaitingThread extends Thread{
    
    @Override
    public void run(){
        System.out.println("This thread feels a little suck.....");
        
        try{
            Thread.sleep(50000);
        }catch(InterruptedException ie){
        
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread dying = new WaitingThread();
        dying.start();
        
        System.out.println("Waiting for thread death");
        
        dying.join();
        System.out.println("Thread has died");
    }
}
