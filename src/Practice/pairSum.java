package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class pairSum {
    public static void main(String[] args) {
        //getByHashing();
       // getPairBySort();
        getByPair();
    }

    static void getPairBySort(){
        int[] arr = {1, 4, 45, 6, 10, -8};
        int sum = 16;
        Arrays.sort(arr);
        int l=0;
        int r = arr.length-1;

        while (l<r){
            if(arr[l]+arr[r] == sum ){
                System.out.println(arr[l]+ " "+ arr[r]);
                break;
            }else if (arr[l]+arr[r] >sum){
                r=r-1;
            }else{
                l=l+1;
            }
        }
    }
    static void getByHashing(){
        int[] arr = {1, 4, 45, 6, 10, -8};
        int sum = 16;

        HashSet<Integer> sets = new HashSet<>();
        for (int i = 0; i < arr.length-1; i++) {
            int temp = sum - arr[i];
            if (sets.contains(temp)){
                System.out.println(arr[i] + " "+ temp);
            }
            sets.add(arr[i]);
        }

    }
    static void getByPair(){
        int[] arr = {-20,8,-6,-14,0,-19,14,4};

        HashSet<Integer> sets = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            if (sets.contains(arr[i]*2) || (arr[i] % 2 == 0 && sets.contains(arr[i] / 2))){
                System.out.println(arr[i] );
            }
            sets.add(arr[i]);
        }

    }
}
