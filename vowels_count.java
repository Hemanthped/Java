import java.util.Scanner;

public class vowels_count {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");

           String s = sc.nextLine();
           int count = 0;
           char[] ch = s.toCharArray();
           for(char c : ch){
            switch(c){
            case 'a': 
            case 'e':  
            case 'i':  
            case 'o':
            case 'u': 
            count++;
            break;   

            }
           }
           System.out.println("No of vowels:"+count);
    }
}
