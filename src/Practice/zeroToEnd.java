package Practice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zeroToEnd {
    public static void main(String[] args) {
        /*List<Integer> numbers = Arrays.asList(1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0);
        List<Integer> newnum = Stream.concat( numbers.stream().filter(e->e>0),numbers.stream().filter(e->e==0)).collect(Collectors.toList());
        System.out.println(newnum);

        int[] arr ={1,9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.print(arr[i]);
            }else{
                count +=1;
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(0);
        }*/
        int[] arr ={1,9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i;j<arr.length;j++){
                    if(arr[j]!=0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        }
        int[] arr1 = new int[arr.length];
        System.out.println(Arrays.toString(arr));

    }
}
