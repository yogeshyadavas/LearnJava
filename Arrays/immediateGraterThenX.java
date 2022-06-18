package Arrays;

public class immediateGraterThenX {

    static int nextMax(int arr[], int X){
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > X && arr[i] < max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {4, 64, 13, 20, 15};
        int X = 16;
        System.out.println(nextMax(arr,X));
    }
}
