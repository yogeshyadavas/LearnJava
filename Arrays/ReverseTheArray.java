package Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        for(int i =0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for(int i = 0; i < n;i++)
            System.out.println(arr[i]);
    }
}
