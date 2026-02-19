package Techniques;

public class problem9 {
    public static void main(String[] args) {

       int arr [] = {2, 3, 4, 1, 6, 8, 5};
       int count = 0;
       int k = 3;

       for (int i = 0; i<k; i++){
        if (arr[i]%2!=0)
            count++;
       }
       if (count == 3)
        System.out.println(true);
       else 
        System.out.println(false);

       for (int i = k; i<arr.length; i++){
        count = 0;
        for (int j = i-k+1; j<=i; j++){
            if (arr[j]%2!=0)
                count++;
        }
        if (count == 3)
            System.out.println(true);
        else 
            System.out.println(false);
       }

    }
}

