import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_data {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Text\\java_text");   
         BufferedReader br = new BufferedReader(fr);

         String str;
         while((str = br.readLine())!= null){

            System.out.println(str);

         }
         br.close();
    }
}
