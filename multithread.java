class Counter{
     int count;
    public void Increment(){
        count++;
    }
}



public class multithread {
    public static void main(String[] args) throws InterruptedException {

       Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i=1; i<=100; i++){
                c.Increment();
                }
            
        };

            Runnable obj2 = () -> {
            for(int i=1; i<=100; i++){
                c.Increment();
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
