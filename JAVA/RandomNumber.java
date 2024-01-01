


//How to Generate random number in java
//Program


import java.util.Random;

public class RandomNumber {
      public static void main(String[] args) {
        int c;
         Random t= new Random();


          for ( c= 1; c <= 10; c++){
            System.out.println(t.nextInt(100));
          }
      }
}
