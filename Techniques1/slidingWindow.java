package Techniques;

public class slidingWindow {
    public static void main(String[] args) {
     
        int [] arr = {1,3,2,4,6,7};
        int sum = 0; 
        int k = 3;

        for (int i = 0; i<k; i++){
            sum+=arr[i];
            System.out.println("sum of arr["+i+"]");
        }

        System.out.println("is "+sum);

        for (int i = k;  i<arr.length; i++){
            int removed = arr[i-k];
            int added = arr[i];
            sum += added - removed;
            System.out.println("\nsum of the next sliding fixed windows: "+sum);
        }
        



    }
}
