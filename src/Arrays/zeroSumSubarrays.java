package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class zeroSumSubarrays {
    public static int getzeroSumarray(int[] arr){
        int count =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int index =-1;
        int sum =0;
        hm.put(0,1);
        while(index < arr.length-1){
            index++;
            sum+=arr[index];
            if(hm.containsKey(sum)){
                count+=hm.get(sum);
                hm.put(sum,hm.get(sum)+1);
            }else{
                hm.put(sum,1);
            }
        }
        return(count);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getzeroSumarray(arr));
    }
}
