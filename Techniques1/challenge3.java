package Techniques;

public class challenge3 {
    public static void main(String[] args) {
     
        int [] arr = {1,3,2,4,6,7};
        int sum = 0; 
        int k = 3;

        for (int i = 0; i<k; i++){
            sum+=arr[i];
        }
        int count = 0;

        if(sum>10)
            count++;

        for (int i = k;  i<arr.length; i++){
            int removed = arr[i-k];
            int added = arr[i];
            sum += added - removed;
            if (sum>10)
                count++;
        }
        System.out.println("the number of sum > 10 is "+count );
    }
}
