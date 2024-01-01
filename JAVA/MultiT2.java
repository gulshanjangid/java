


 class process1 extends Thread{
    public void run(){
     int i ;
    for(i=0;i<10;i++){
        System.out.println("process1:- "+i);
    }
    }
 }
  class process2 extends Thread{
    public void run(){
    int i ;
    for(i=0;i<10;i++){
        System.out.println("process2:- "+i);
    }
    }
  }

public class MultiT2 {
     public static void main(String[] args) {
        Process1= new Process1();
        process2 = new Process2();
         p1.start();
         p2.start();
     } 
}
