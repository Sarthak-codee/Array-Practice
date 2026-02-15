package Arrays.one_d_array.practice;

public class copyingarray {
    public static void main(String[] args) {
        int a[] = new int [10];
        int b[] = new int [15];
        int n = 1;
        System.out.print("Original array: ");
        for (int i = 0; i<a.length; i++){
            a[i] = n;
            n++;
            System.out.print(a[i]+",");
        }
        System.out.println();

        System.out.print("Duplicate array: ");
        for (int i = 0; i<a.length; i++){
            b[i]=a[i];
            System.out.print(b[i]+",");
        }
        System.out.println();


    }
}
