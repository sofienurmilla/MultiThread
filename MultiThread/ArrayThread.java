/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author ASUS
 */
public class ArrayThread extends Thread{
    int array1[] = {6,9,1,2,3,5};
    int array2[] = {7,11,6,4,3,1};
    int array3[] = {5,4,3,2,1,12};
    int hasil[] = new int[6];
    int index;
    int total;
    public ArrayThread(int index){
        this.index=index;
        
    }

    public void run(){
        hasil[index]=array1[index]+array2[index]+array3[index];
        System.out.println("Hasil dari penjumalahan array per indeks ke "+index+" adalah "+array1[index]+" + "+array2[index]+" + "+array3[index]+" = "+hasil[index]);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ie){
        
        }
    }
    
    public static void main(String[] args) {
        Thread t1 = new ArrayThread(0);
        t1.start();
        Thread t2 = new ArrayThread(1);
        t2.start();
        Thread t3 = new ArrayThread(2);
        t3.start();
        Thread t4 = new ArrayThread(3);
        t4.start();
        Thread t5 = new ArrayThread(4);
        t5.start();
        Thread t6 = new ArrayThread(5);
        t6.start();
        
    }
}
