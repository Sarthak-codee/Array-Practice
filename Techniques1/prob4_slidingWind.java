package Techniques;

public class prob4_slidingWind {
    public static void main(String[] args) {
     
        int [] arr = {1,3,2,4,6,7};
        int k = 3;
        int [] b = new int [arr.length-k+1];
        int max = 0;

        for (int i = 0; i<k; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        b[0] = max; 

        for (int i = k;  i<arr.length; i++){
            max = arr[i-k+1];
            for (int j = i-k+2; j<=i; j++){
                max = Math.max(max,arr[j]);
            }
            b[i-k+1] = max;
        }
        for (int x: b)
            System.out.print( x + " ");
    }
}
