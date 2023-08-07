import java.util.Arrays;

public class Sorted_string {
    public static void main(String[] args) {
        String s = "hemanthcherry";
    char[] ch = s.toCharArray();
    Arrays.sort(ch);
    String sortedString = new String(ch);
    System.out.println(sortedString);


    }
}
