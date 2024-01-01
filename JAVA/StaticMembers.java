



//StaticMembers in java

//The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.
//The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.

 class A{
      private int x;
    private static int y;
        void fun1(){
            y=22;
             x = 5;

        }
        void fun2(){
            System.out.println(y);
        }
         void fun3(){
            y = 45;

         }
 }


public class StaticMembers {
    

    public static void main(String[] args) {
          A a1 = new A();
          A a2 = new A();
           a1.fun1();
           a2.fun2();

    }
}
