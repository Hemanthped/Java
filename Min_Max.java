public class Min_Max {

    public static void main(String[] args) {
        int a[]= {1,24,0,57,6,99};

        boolean flag = false;
        int search_ele=85;
       int max = a[0];
        int min=a[0];
         for(int i = 0;i<a.length;i++){
             if(a[i]>max){
                 max = a[i];
             }   
         }
        for(int i = 0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }   
        }
         System.out.println("Maximum number is: "+max);
          System.out.println("Minimum number is: "+min);

        // for(int i=0;i<a.length;i++){
        //     if(search_ele==a[i]){
        //         System.out.println("Element found at index :"+i);
        //         flag=true;
        //         break;
        //     }

        // }
        // if(flag==false){
        //     System.out.println("element not found");
        // }



    }
    
}
