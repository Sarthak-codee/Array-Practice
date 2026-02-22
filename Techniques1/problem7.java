package Techniques.slidingWIndow;

public class problem7 {
    public static void main(String[] args) {
        int arr [] = {1,3,4,0,-6,9,-1,-3};
        int k = 3;
        int p = 1;

        for (int i = 0; i<k ; i++){
            p*=arr[i];
        }

        int max = p;

        for (int i = k; i<arr.length; i++){
            p = 1;
            for (int j = i-k+1; j<=i; j++){
                p *= arr[j];
            }
            max = Math.max(max, p);
        }
        System.out.println("Maximum product is "+max);
    }
}
