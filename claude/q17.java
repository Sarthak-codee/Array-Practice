package Arrays.one_d_array.claude;

public class q17 {
    public static void main(String[] args) {
        
        int arr[] = {0,1,0,2,2,1,2,0,1,0,2,2,1,1,1,0};
        int countZero = 0, countOne = 0, countTwo = 0; 

        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x : arr){
            if (x==0)
                countZero++;
            else if (x==1)
                countOne++;
            else 
                countTwo++;
        }

        for (int i = 0; i<countZero; i++){
            arr[i] = 0;
        }
        for (int i = countZero; i<countOne+countZero; i++){
            arr[i] = 1;
        }
        for (int i = countOne+countZero; i<countOne + countZero + countTwo; i++){
            arr[i]= 2;
        }
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}
