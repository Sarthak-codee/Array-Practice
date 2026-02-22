package Techniques.slidingWIndow;

public class problem10 {
    public static void main(String[] args) {

        int arr [] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int sum = 0;
        int b [] = new int [arr.length-k+1];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i<k; i++){
            if (arr[i]>max)
                max = arr[i];
            if (arr[i]<min)
                min = arr[i];
        }
        sum += max + min;

        b[0] = sum;

        for (int i = k; i<arr.length; i++){
            sum = 0;
            max = arr[i-k+1];
            min = arr[i-k+1];

            for (int j = i-k+1; j<=i; j++){
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);
            }
            sum += max + min;
            b[i-k+1] = sum; 
        }
        for (int x: b)
            System.out.print(x + " ");
    }
}