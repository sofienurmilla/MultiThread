/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author ASUS
 */
public class KirimRunnable implements Runnable{
    
    int ganjil;
    
    public KirimRunnable(int num){
        ganjil = num;
    }
    public void run(){
        for(int i=0; i< 10; i++){
            ganjil++;
            ganjil++;
            System.out.print(ganjil + " ");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException ie){
            
            }
        }
        
    }
}
