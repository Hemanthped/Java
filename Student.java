import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Student {
    int age;
    String name;

public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }




@Override
public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
}




public static void main(String[] args) {


    List<Student> studs= new ArrayList<>();

     studs.add(new Student(21,"ravi"));
     studs.add(new Student(18,"somu"));
     studs.add(new Student(22,"john"));
     studs.add(new Student(19,"suri"));

      Comparator<Student> com = ( i,  j ) -> i.age>j.age ? 1 : -1; 

      Collections.sort(studs,com);
      System.out.println((studs));


      Stream<Student> s = studs.stream()
      .filter(n -> (n.age)>18);
      
     
  s.forEach(n ->System.out.println(n));

}

}
