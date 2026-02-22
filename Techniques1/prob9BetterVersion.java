package Techniques.slidingWIndow;

public class prob9BetterVersion {
    public static void main(String[] args) {

       int arr [] = {2, 3, 4, 1, 6, 8, 5};
       int count = 0;
       int k = 3;
       boolean [] result = new boolean [arr.length-k+1];

       for (int i = 0; i<k; i++){
        if (arr[i]%2!=0)
            count++;
       }
       result [0] = (count==k);

       for (int i = k; i<arr.length; i++){
            if (arr[i]%2!=0)
                count++;
            if (arr[i-k]%2!=0)
                count--;
            result [i-k+1] = (count == k);
        }
        for (boolean x : result)
            System.out.print(x + " ");
    }
}

