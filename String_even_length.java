public class String_even_length {
    public static void main(String[] args) {
        String s = "Hell world go we moved";

        for(String str : s.split(" ")){
            if(str.length()%2==0){
                System.out.println("even numbered words : "+str+" - "+str.length());
            }else{
                System.out.println("odd numbered words : "+str+" - "+ str.length());
            }
        }
    }
}
