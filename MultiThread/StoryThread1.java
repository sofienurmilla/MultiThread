/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author ASUS
 */
public class StoryThread1 extends Thread{
    int count=1;
    int pasien = 10;
    public StoryThread1(int count){
        this.count=count;
    }
    @Override
    public void run(){
        try{
            for(;;){
                if(count==1){
                    System.out.println(pasien+" pasien sedang diperiksa oleh dokter");
                    Thread.sleep(2000);
                    break;
                }else if(count==2){
                    Thread.sleep(2000);
                    int pas = pasien/2;
                    System.out.println(pas +" pasien pertama ditangani oleh perawat");
                    Thread.sleep(2000);
                    System.out.println(pas +" pasien kedua ditangani oleh perawat");
                    Thread.sleep(2000);
                    break;
                }else if(count==3){
                    Thread.sleep(15000);
                    System.out.println(pasien+ " pasien membayar di kasir");
                    Thread.sleep(2000);
                    break;
                }
            }
        }catch(InterruptedException ie){
            
        }
    }
    public static void main(String[] args) {
        Thread dokter = new StoryThread1(1);
        dokter.start();
        Thread perawat = new StoryThread1(2);
        perawat.start();
        Thread kasir = new StoryThread1(3);
        kasir.start();
    }
}
