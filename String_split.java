import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class String_split {
    public static void main(String[] args) {
        String s = "123-093456-88";
       String[] str =  s.split("-");
       printString(str,"String class method");
       List<String> strings = Pattern.compile("-").splitAsStream(s).collect(Collectors.toList());
       System.out.println("using Pattern compile");
       for(String string:strings){
        System.out.println(string);
       }
       
       StringTokenizer stri = new StringTokenizer(s,"-");
       System.out.println("Using String Tokenizer");
       while(stri.hasMoreTokens()){
        String s2 = stri.nextToken();
        System.out.println(s2);
       }

    }
    public static void printString(String[] s, String method){
        for(String string:s){

            System.out.println(string);

        }
    }
}
