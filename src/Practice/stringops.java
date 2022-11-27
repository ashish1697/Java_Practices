package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class stringops {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Welcome", "to", "myWorld");

        String newstr= str.stream().map(e->e).collect(Collectors.joining("----"));
        System.out.println(newstr);

        String newstr1= str.stream().filter(e->e.length()>4).map(e->e).collect(Collectors.joining("----"));
        System.out.println(newstr1);

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        Map<String,Integer> newmap = names.stream().collect(Collectors.toMap(e->e,e->1,Integer::sum));
        System.out.println(newmap);
        Map<String,Long> newmap1 = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(newmap1);

        Map<String,Integer> newmap2 = names.stream().filter(x->Collections.frequency(names,x)>1).collect(Collectors.toMap(e->e,e->1,Integer::sum));
        System.out.println(newmap2);
    }
}
