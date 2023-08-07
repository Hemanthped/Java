import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1{
    public static void main(String[] args) {

        // String s = "Welcome to java world";
        //  String splitArray[] = s.split(" ");
        //  for(int i = splitArray.length-1; i>=0;i--){
        //     System.out.print(splitArray[i]+" ");

        int[] originalArray = {1,2,3,4,5};
        int removeElement = 4;

        int[] newArray = remove(originalArray,removeElement);
            System.out.println("Original Array:"+ Arrays.toString(originalArray));
            System.out.println("New Array:"+ Arrays.toString(newArray));
                // char[] ch = s.toCharArray();

                // for(int i=0;i<s.length();i++){
                //     String str = "";
                //     while(i<ch.length&&ch[i]!=' '){
                //         str = str+ch[i];
                //     i++;       
                // }
                //   if(str.length()>0){
                //     System.out.println(str + " ->"+str.length());
                //   }
                // }

              

         }

         public static int[] remove(int[] array, int element){
            int[] newarray = new int[array.length-1];
            int index = 0;
            for(int i=0; i<array.length;i++){
                if(array[i]!=element){
                    newarray[index] = array[i];
                    index++;
                }
              }
              return newarray;
             }
           
    }
  
        
       


        
    
