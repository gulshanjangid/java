

class Nokia{
     private int mic;
     private int cam;
      void setValue(){
           mic = 2;
           cam = 40;

      }
       void display(){
     System.out.println(mic);
     System.out.println(cam);  
       }

}


public class ClassesAndObjects {
   public static void main(String[] args) {
     Nokia n1 = new Nokia();
     n1.display();
     n1.setValue();
   //output
     //0
       //0
     n1.display();
   // output
     //0
     //0
     //2
     //40

    

   }  
}
