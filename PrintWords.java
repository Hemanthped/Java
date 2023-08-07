import java.util.Map;
import java.util.TreeMap;

public class PrintWords {
    public static void main(String[] args) {
        String s = "Learn Java With Hemanth";
        
       
       
        PrintWords p = new PrintWords();
        p.getWordsAndVowelCount(s);
        p.getFrequency(s);
    }

    private void getFrequency(String s) {
        TreeMap<Character, Integer> map=new TreeMap<>(); 
        for(int i=0;i<s.length();i++){ 
          Integer c=map.get(s.charAt(i));

            if(map.get(s.charAt(i))==null) {

                map.put(s.charAt(i), 1); 
            }
                else{
                    map.put(s.charAt(i), ++c);
                }
        }

for (Map.Entry entry : map.entrySet()) { 
    System.out.println("Character="+entry.getKey()); 
    System.out.println("Frequency="+entry.getValue());
    }

}

    
    private void getWordsAndVowelCount(String s) {
         int wordCount = 1;
        int vowelCount = 0;
        int uppercaseCount = 0;

        for(int i =0;i<s.length();i++){

            char c = s.charAt(i);

            switch(c){
            case ' ':
            case '.':
            wordCount++;

            }

            switch(c){
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':

                vowelCount++;
            }

            

                if(c>=65&&c<=90){

                    uppercaseCount++;

                }

            
        }
        System.out.println(wordCount);
        System.out.println(vowelCount);
        System.out.println(uppercaseCount);

    }
}
    

