package Arrays;

import java.util.Arrays;

public class greatestElementRightSide {
    public static void main(String[] args) {
        int[] arr ={17,18,5,4,6,1};
        int tempvar= arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            int temp = arr[i];
            arr[i]= tempvar;
            if(tempvar< temp){
                tempvar=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
