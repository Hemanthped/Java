import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaCollection {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(92);
        list.add(49);
        list.add(25);
        list.add(63);
      Comparator<Integer> com = new Comparator<Integer>() {

                              public int compare(Integer i, Integer j ){

                                if(i%10>j%10){
                                    return 1;
                                }
                                    else{
                                        return -1;
                                    }
                                

                              }
        
      };

        Collections.sort(list,com);

        Set<Integer> set = new TreeSet<>();
           set.add(5);
           set.add(25);
           set.add(21);
           set.add(8);
           set.add(5);
           System.out.println(list);


    }
    
}
