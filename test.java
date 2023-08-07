public class test{
   static{
     // int a = 5;
      System.out.println("in static block");
   }

   public static void main(String[] args) {
      
   
        test t = new test();

        Double d1 = 0.0/0.0;
         System.out.print(d1.isNaN()+" ");
        System.out.println(d1.isInfinite());
        try 
        {
         int a = args.length;
           int b = 10 / a;
          System.out.print(a);
         }
          catch (ArithmeticException e) 
         {
          System.out.println("Hello World");
          }
    }
   }
