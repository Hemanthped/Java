import java.util.Scanner;

public class prime {
 
        public static void main(String[] args) {
              Scanner sc = new Scanner(System.in) ;
          System.out.print("Enter the number:");

           int num = sc.nextInt();
           if(num==0){
            System.out.println("Entered number is zero");
           }else{
            boolean isPrime = true; //default
            for (int i=2; i<=Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("This is a prime number");
            } else {
                System.out.println("This number is not prime");
            }
        }
    }
}

