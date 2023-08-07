import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_array {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(9,8,2,7,4,5);

        System.out.println(list);
        List<Integer> elist = new ArrayList<>();
        List<Integer> olist = new ArrayList<>();
          
                    
                    int esum=0;
                    int osum=0;
                    for(int i:list){

                        if(i%2==0){
                       
                       elist.add(i);
                        }
                        else{
                        
                        olist.add(i);

                        }
                        
                    }

                    for(int e : elist){
                        esum=esum+e;
                    }

                     for(int o:olist){
                        osum=osum+o;
                    }
                    System.out.println("Even numbers: "+elist+" odd numbers:"+olist);

                    System.out.println("even sum: "+esum+" odd sum: "+osum);

            
    
}
}
