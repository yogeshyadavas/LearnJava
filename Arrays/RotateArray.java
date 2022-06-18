package Arrays;

public class RotateArray {

    static int[] rotateArray(int[] arr, int D) {
        int n = arr.length;
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
            if(i < n - D)
                a[i] = arr[D + i];
            else
                a[i] = arr[i - D - 1];
        }
        return a;

    }



    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int D = 2;
        int [] b = rotateArray(arr,D);
        for(int i = 0; i < b.length;i++){
            System.out.println(b[i]);
        }
    }
}
