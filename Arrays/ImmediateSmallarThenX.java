package Arrays;

public class ImmediateSmallarThenX {
    
    static int nextMin(int arr[], int X){
        int min = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] < X && arr[i] > min)
                min = arr[i];
        }
        return min;

    }
    public static void main(String[] args) {
        int [] arr = {4, 67, 13, 12, 155};
        int X = 16;
        System.out.println(nextMin(arr,X));
    }
}
