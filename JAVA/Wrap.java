
 // java not 100% object oriented programming languages.
 // that why we use  wrapper class

//Wrapper class
//The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive. 

public class Wrap {
   public static void main(String[] args) {
       int x = Integer.parseInt("123");
        System.out.println(x);

          Integer i1  =  Integer.valueOf("1000011",2);
         int z = i1.intValue();
         System.out.println(z);

         Double x1 = Double.valueOf("56");
         double y = x1.doubleValue();
         System.out.println(y);
   }  
}
