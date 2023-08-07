 class Mobile {

    String name;
    int price;
    String network;
    static String type;
 
 static {
    type = "smart";
    System.out.println("in static block");
    }
 }
public class demo{
    public static void main(String[] args) {
        
        Mobile mob = new Mobile();
       // mob.name= "sony";
       // mob.network="jio";
       // mob.price=2000;

      //  Mobile.type = "phone";

       // System.out.println(mob.name+": "+mob.network+": "+mob.price+": "+Mobile.type);

    }
}

