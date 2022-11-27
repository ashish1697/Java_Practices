package Arrays;

import java.util.*;

public class ThirdMax {
    public static void main(String[] args) {
        int[] nums = {1,2,-2147483648};

        TreeSet<Integer> sets = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            sets.add(nums[i]);
        }
        if(sets.size() == 1){
            System.out.println( sets.first());
        }
        else if(sets.size() == 2){
            System.out.println(sets.last());
        }else{
            List<Integer> lists= new ArrayList<Integer>(sets);
            System.out.println(lists.size());
            System.out.println(lists.get(lists.size()-3));
        }

        System.out.println(sets.size());

    }
}
