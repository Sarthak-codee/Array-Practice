package Arrays.one_d_array.claude;

public class q13 {
    public static void main(String[] args) {
        
        int [] arr = {0,1,0,2,3};

        for (int x: arr)
        System.out.print(x + " ");
        System.out.println();

        int i = 0; 

        for (int j = 0; j<arr.length; j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
        }
        for (int j = i; j<arr.length; j++ ){
            arr[j]=0;
        }

        for (int x: arr)
            System.out.print(x + " ");

    }

}
