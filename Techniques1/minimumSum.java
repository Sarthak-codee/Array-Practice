package Techniques;

public class minimumSum {
    public static void main(String[] args) {
     
        int [] arr = {1,3,2,4,6,7};
        int sum = 0; 
        int k = 3;

        for (int i = 0; i<k; i++){
            sum+=arr[i];
        }

        int min = sum;

        for (int i = k;  i<arr.length; i++){
            int removed = arr[i-k];
            int added = arr[i];
            sum += added - removed;
            min = Math.min(min, sum);
        }
        System.out.println("\n minimum sum of the subarray: "+min);
    }
}
