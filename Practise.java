import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practise {

    public static void main(String[] args) {
        //   int a=20;
        //   int b=30;

        //    System.out.println("Before swapping a:"+a + " b:"+b);

        //    a=a^b;
        //    b=a^b;
        //    a=a^b;
        //    System.out.println("After swapping a:"+a + " b:"+b);

       try (Scanner sc = new Scanner(System.in)) {
           System.out.println("Enter a number:");

           int num = sc.nextInt();
           int count = 0;
//            int org_num = num;
//            int rev = 0;
//            while (num != 0) {
//                rev = rev * 10 + num % 10;
//                num = num / 10;
//            }


            //StringBuffer sb = new StringBuffer(String.valueOf(num));

            //     StringBuilder sb = new StringBuilder(String.valueOf(num));


            //    StringBuilder rev = sb.reverse();


           // System.out.println("Reverse of a number : " + rev);

            //  Scanner sc1 = new Scanner(System.in);

            //  System.out.println("Enter a String:");

            //  String s = sc1.nextLine();

            //  String org_s = s;


            //String str = "ILovemyIndia";

            // StringBuffer sb = new StringBuffer(s);

            // sb.reverse();

            // System.out.println(sb);

            //   char c[] = s.toCharArray();

            // String revs = "";
            //     int len = s.length();

            //     for(int i = len-1; i>=0;i-- ){
            //       revs = revs+s.charAt(i);
            //     }
//
//            if (org_num == rev) {
//                System.out.println("It is a palindrome number");
//            } else {
//                System.out.println("Not a palindrome number");

            //     if(org_s.equals(revs))
            //             {
            //         System.out.println("It is a palindrome string");
            //     }else{
            //         System.out.println("Not a palindrome String");

            // }


            while(num>0){
                num=num/10;
                count++;
            }
            System.out.println("Number of digits:"+count);
        }

    }
}


