import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int a[]={8,6,4,7,1,2,9};
        System.out.println("Array before sorting: "+Arrays.toString(a));

       int n = a.length;

        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                if(a[i]>a[j]){
                   int temp = a[j];
                   a[j]=a[i];
                   a[i]=temp;

                }
            }
        }
        System.out.println("Array after sorting:"+ Arrays.toString(a));

        
    }
}
