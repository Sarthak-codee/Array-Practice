package Techniques;

public class challenge4_5 {
    public static void main(String[] args) {

        int [] arr = {1, 3, 2, 4, 6, 7};
        int sum = 0; 
        int k = 3;

        for (int i = 0; i < k; i++){
            sum += arr[i];
        }
        
        int max = sum;
        int maxIndex = 0;
        int secondMax = Integer.MIN_VALUE;
        int secondMaxIndex = -1;
        
        for (int i = k; i < arr.length; i++){
            sum = sum - arr[i-k] + arr[i];
            
            if (sum > max) {
                // New max found! Old max becomes second
                secondMax = max;
                secondMaxIndex = maxIndex;
                max = sum;
                maxIndex = i-k+1;
            }
            else if (sum > secondMax) {
                // Not bigger than max, but bigger than second
                secondMax = sum;
                secondMaxIndex = i-k+1;
            }
        }
        
        System.out.println("Max: " + max + " at index " + maxIndex);
        System.out.println("Second Max: " + secondMax + " at index " + secondMaxIndex);
    }
}
