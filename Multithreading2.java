// using thread class
class Process3 extends Thread{
    public void run(){
        int i;
        for(i=0;i<5;i++){
            System.out.println("Process3 "+i);
        }
    }
}
class Process4 extends Thread{
    public void run(){
        int i;
        for(i=0;i<5;i++){
            System.out.println("Process4 "+i);
        }
    }
}
public class Multithreading2 {
    public static void main(String args[]){
        Process3 p3 = new Process3();
        Process4 p4 = new Process4();
        p3.start();
        p4.start();
    }
}
