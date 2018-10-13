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
public class StoppingThread extends Thread{
    
    public void run(){
        int count = 1;
        System.out.println("I can count. Watch me go!");
        for(;;){
            System.out.print(count++ +" ");
            
            try{
                Thread.sleep(5000);
            }catch(InterruptedException ie){
                
            }
        }    
    }
    
    public static void main(String[] args) throws IOException {
        Thread counter = new StoppingThread();
        counter.start();
        
        System.out.println("PRess any enter to stop the thread counting");
        System.in.read();
        
        counter.stop();
    }
}
