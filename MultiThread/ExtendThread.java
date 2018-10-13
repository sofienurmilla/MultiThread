/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author ASUS
 */
public class ExtendThread extends Thread{
    
    int threadNumber;
    
    public ExtendThread(int num){
        threadNumber=num;
    }
    
    public void run(){
        System.out.println("I'm thread number "+threadNumber);
        
        try{
            Thread.sleep(5000);
        }catch(InterruptedException ie){
            System.out.println(threadNumber+ " is finished");
        }
        System.out.println(threadNumber+" is finished");
    }
    public static void main(String[] args) {
        System.out.println("Creating Thread 1");
        Thread t1 = new ExtendThread(1);
        
        System.out.println("Creating Thread 2");
        Thread t2 = new ExtendThread(2);
        
        t1.start();
        t2.start();
    }
}
