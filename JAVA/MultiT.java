




 
 class  Process1: implemenets Runnable  {
    public void run(){
    int i ;
    for(i=0;i<10;i++){
        System.out.println("process1:- "+i);
    }
   }
    
 }
  class Process2 :implemenets Runnable {
  public void run(){
    int i ;
    for(i=0;i<10;i++){
        System.out.println("process2:- "+i);
    }
   }
  }

public class MultiT {
     public static void main(String[] args) {
          Process1= new Process1();
          process2 = new Process2();
          Thread t1 = new Thread(p1);
          Thread t2 = new Thread(p2);
          t1.start();
          t2.start();
     } 
}
