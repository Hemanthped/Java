
class calculator{
    int n1;
    int n2;

    public int add(int n1,int n2){
        return n1+n2;
    }
}

public class oops {

    public static void main(String[] args) {
        
        int data = 10;
        calculator obj = new calculator();
       int r1 =  obj.add(10, 20);
        System.out.println(r1);
    }
    
}
