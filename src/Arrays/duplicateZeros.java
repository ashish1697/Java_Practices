package Arrays;
import java.util.Arrays;
public class duplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(arr));
        int zeros = 0;

        for (int a : arr)
            if (a == 0)
                ++zeros;

        for (int i = arr.length - 1, j = arr.length + zeros - 1; i < j; --i, --j) {
            if (j < arr.length)
                arr[j] = arr[i];
            if (arr[i] == 0)
                if (--j < arr.length)
                    arr[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
