package Techniques;

public class challenge2 {
    public static void main(String[] args) {
     
        int [] arr = {1,3,2,4,6,7};
        int sum = 0; 
        int k = 3;
        int [] b = new int [arr.length-k+1];

        for (int i = 0; i<k; i++){
            sum+=arr[i];
        }

        b[0] = sum; 

        for (int i = k;  i<arr.length; i++){
            int removed = arr[i-k];
            int added = arr[i];
            sum += added - removed;
            b[i-k+1] = sum;
        }
        for (int x: b)
            System.out.print( x + " ");
    }
}
