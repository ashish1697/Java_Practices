package Practice;

import java.util.HashSet;

public class tripletSum {
    public static void main(String[] args) {
       int[] array = {1, 2, 3, 4, 5};
       int sum = 9;

        for (int i = 0; i < array.length-1; i++) {
            HashSet<Integer> sets = new HashSet<>();
            for (int j = i+1; j < array.length; j++) {
                int temp = sum - (array[i]+array[j]);
                if (sets.contains(temp)){
                    System.out.println(array[i] + " "+array[j]+" "+temp);
                    break;
                }
                sets.add(array[j]);

            }

        }

    }
}
