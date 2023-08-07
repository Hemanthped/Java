import java.util.Scanner;

public class String_count {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
    
    System.out.println("Enter a String:");

              String s = sc1.nextLine();

              int count = 1;

              for(int i=0;i<s.length();i++){
                if( (s.charAt(i) == ' ') && (s.charAt(i+1)!=' '))
                count++;
              }

              System.out.println("No. of words:"+count);

}
}
