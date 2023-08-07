import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
          Scanner sc = new Scanner(System.in) ;
          System.out.print("Enter the number of series:");

           int num = sc.nextInt();
           int sum = 0;

        System.out.print(n1+" "+n2);

        for(int i=2;i<num;i++){
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }

    
    
}
}
