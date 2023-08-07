public enum Cars {

    Ford(5000), Benz(9000), Tata(4000), Mahindra(3000);

    private int price;
    
    
private Cars(int price) {
        this.price = price;
    }


public int getPrice() {
    return price;
}


public void setPrice(int price) {
    this.price = price;
}

public static void main(String[] args) {
    Cars[] c = Cars.values();
   
     

    for(Cars i : c){
    System.out.println(i+" :"+i.getPrice());
}

}
}

