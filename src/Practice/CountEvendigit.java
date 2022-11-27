package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountEvendigit {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
       /* int counter =0;
        for(int i=0;i<nums.length;i++){
            int count =0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                count++;
            }
            if(count%2==0 && count !=0){
                counter++;
            }
        }

        System.out.println(counter);*/
    }
}
