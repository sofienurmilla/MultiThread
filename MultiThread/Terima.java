/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author ASUS
 */
public class Terima extends Thread{
    
    int genap;
    public Terima(int num){
        genap=num;
    }
    public void run(){
        
        for(int i=0; i<10; i++){
            genap++;
            genap++;
            System.out.print(genap + " ");
        }
        try{
            Thread.sleep(5000);
        }catch(InterruptedException ie){
            
        }
    }
}
