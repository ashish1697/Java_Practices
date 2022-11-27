package Practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class boxing {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

       List<Integer> newArr =  Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println(newArr);

        List<Integer> newArr1 = IntStream.of(nums).boxed().collect(Collectors.toList());
        System.out.println(newArr1);

        int[] numArr = new int[]{1,2,3,4,5};
        int[] newArr2 =  Arrays.stream(numArr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        System.out.println(newArr2);
    }
}
