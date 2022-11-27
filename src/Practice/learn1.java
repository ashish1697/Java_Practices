package Practice;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class learn1 {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(3,4,6,8,2);


        List<Integer> newlist = list1.stream().filter(i-> i%2 == 0).collect(Collectors.toList());
        System.out.println(newlist);
        List<Integer> newlist1 = list1.stream().filter(i->i>3).collect(Collectors.toList());
       System.out.println(newlist1);

         List<String> newlist2 = Arrays.asList("ashish","ranjan","mansi","katare");

         Stream<List<String>> stremobj = Stream.of(newlist2);

        List<String> newlists4 =  newlist2.stream().filter(e-> e.length()>5).collect(Collectors.toList());
        System.out.println(newlists4);
        List<Integer> newcoun = newlist2.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(newcoun);

        String abc = "abc abcd abcde afdcr ashish new abc abcd abcde";

        List<String> listval = Stream.of(abc).map(e->e.split("\\s+")).flatMap(Arrays::stream).collect(Collectors.toList());
        Map<String,Integer> counter = listval.stream().collect(Collectors.toMap(e-> e.toLowerCase(), e->1,Integer::sum));
        System.out.println(counter);


        List<String>  newlist5 = Stream.of(abc).map(e->e.split("\\s+")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(newlist5);
       // newlist5.stream().sorted().forEach(System.out::println);
        Map<String, Integer> newmap = newlist5.stream().collect(Collectors.toMap(e->e.toLowerCase(),e->1,Integer::sum));
        System.out.println(newmap);


        List<Integer> Intstring = Arrays.asList(12,23,54,23,43,43,2,34,35,22,11);

        List<Integer> sortedint = Intstring.stream().filter(e->e>20).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedint);

        List<Integer> sortedint1 = Intstring.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedint1);

        List<String> names = Arrays.asList("aa", "bb", "cc", "dd");

        List<String> namesp = names.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
        System.out.println(namesp);






    }
}
