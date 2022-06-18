package Arrays;

public class minAndMax {

    static int [] getMinMax(int arr[]){
        int [] ans = new int[2];
        ans[0] = Integer.MAX_VALUE;
        ans[1] = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < ans[0])
                ans[0] = arr[i];
            if(arr[i] > ans[1])
                ans[1] = arr[i];
        }
        return ans;
    }
    

    public static void main(String[] args) {
        int [] arr = {15, 11, 55, 5, 87, 112};
        int [] ans = getMinMax(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
