public class reverse_each_word {
    public static void main(String[] args) {
        String str = "Welcome to java and springboot";

        String words[] = str.split(" ");

        String reverseString = "";

        for(String w : words){
            String reverseWord = "";

            StringBuilder sb = new StringBuilder(w);
            sb.reverse();

            reverseWord = reverseWord + sb.toString()+" ";

            // for(int i= w.length()-1;i>=0;i--){
            //     reverseWord = reverseWord  + w.charAt(i);
            // }
             reverseString = reverseString + reverseWord + " ";
        }
           System.out.println(reverseString); 
    }
}
