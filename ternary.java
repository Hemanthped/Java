import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        
    

    try (Scanner sc = new Scanner(System.in)) {
           System.out.println("Enter number a:");

           int a = sc.nextInt();
            System.out.println("Enter number b:");

           int b = sc.nextInt();
            System.out.println("Enter number c:");

           int c = sc.nextInt();

           System.out.println(a>b ? a : (b>c ? b : c)+" is the largest number");
    
            }
    }
}