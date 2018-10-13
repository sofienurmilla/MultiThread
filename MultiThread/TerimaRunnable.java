/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author ASUS
 */
public class TerimaRunnable implements Runnable{
    int genap;
    
    public TerimaRunnable(int num){
        genap = num;
    }
    public void run(){
        for(int i=0; i< 10; i++){
            genap++;
            genap++;
            System.out.print(genap + " ");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException ie){
            
            }
        }
        
    }
}
