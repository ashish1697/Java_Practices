package Practice;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class stringops2 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

        Long count = strList.stream().filter(x->x.length()>0).count();
        System.out.println(count);
        Long count1 = strList.stream().filter(x->x.isEmpty()).count();
        System.out.println(count1);

        List<String>  list1= strList.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
        System.out.println(list1);
        String list2= strList.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(list2);

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> counter = numbers.stream().map(e->e*e).distinct().collect(Collectors.toList());
        System.out.println(counter);

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
        System.out.println(stats);
    }
}
