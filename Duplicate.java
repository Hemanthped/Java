import java.util.HashMap;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        String arr[] = {"java", "c","c++","Java","python","C"};
        // boolean flag = false;
        // for(int i =0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             System.out.println("found duplicate element:"+arr[i]);
        //             flag=true;
        //         }
        //     }
        // }

        // if(flag==false){
        //     System.out.println("Duplicate element not found");
        // }


        HashSet<String> set = new HashSet<>();
        boolean flag = false;


        for(String s : arr){
            if(set.add(s)==false){
                System.out.println("found duplicates:"+s);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("Duplicates not found");
        }
    }
}

    

