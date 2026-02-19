package Techniques;

public class challenge4 {
    public static void main(String[] args) {
     
        int [] arr = {1,3,2,4,6,7};
        int sum = 0; 
        int k = 3;

        for (int i = 0; i<k; i++){
            sum+=arr[i];
        }
        int max = sum;
        int index = 0;

        for (int i = k;  i<arr.length; i++){
            int removed = arr[i-k];
            int added = arr[i];
            sum += added - removed;
            if (sum>max){
                max = sum; 
                index = i-k+1;
            }
        }
        System.out.println("The maximum sum is "+max+" at index "+index);
    }
}
