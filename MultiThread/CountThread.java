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
public class CountThread extends Thread{
    static boolean kondisi = true;
    int threadNumber = 0;
    
    @Override
    public void run(){
       for(;;){
           if(kondisi){
             threadNumber++;
             if(threadNumber%2==0){
                 System.out.print(threadNumber + " ");
             }
           }else{
               threadNumber--;
               if(threadNumber%2==1){
                   System.out.print(threadNumber +" ");
               }
           }
           try{
               Thread.sleep(500);
           }catch(InterruptedException ie){
               
           }
       }
    }
    public static void main(String[] args) throws IOException {
        Thread t1 = new CountThread();
        t1.start();
        System.out.println("press enter to suspend");
        System.in.read();
        t1.suspend();
        System.out.println("press enter to resume");
        System.in.read();
        t1.resume();
        kondisi = false;
        System.out.println("press enter to stop");
        System.in.read();
        t1.stop();
    }
}
