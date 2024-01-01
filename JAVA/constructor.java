
 
 //In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.
 //It is a special type of method which is used to initialize the object.
//Every time an object is created using the new() keyword, at least one constructor is called.



 
 class Demo{
     int x,y;
     Demo(){
      x= 5;
      y=6;
     }
      void f1(){
       x= 22;
        y = 23;

 }
}

 public class constructor {
  public static void main(String[] args) {
   
     Demo d1 = new Demo();
     System.out.println(d1.x);  
      System.out.println(d1.y); 
  }   
}
