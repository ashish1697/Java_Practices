package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class missingNumbers {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,-3,7};
        for(int num : nums){

            while(nums[num-1] != num){//1 at index zero etc
                //num=num*num;
                int temp = nums[num-1]; //this takes O(1) time since a number is found every iteration
                nums[num-1] = num;
                num = temp;

            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
