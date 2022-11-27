package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class streamObj {
    public static void main(String[] args) {
        List<learn2> noteLst = new ArrayList<>();
        noteLst.add(new learn2(1, "note1", 11));
        noteLst.add(new learn2(2, "note2", 22));
        noteLst.add(new learn2(3, "note3", 33));
        noteLst.add(new learn2(4, "note4", 44));
        noteLst.add(new learn2(5, "note5", 55));
        noteLst.add(new learn2(6, "note4", 66));


        Map<String,Long> newMap = noteLst.stream().collect(Collectors.toMap(learn2->learn2.getTagName(),learn2 -> learn2.getTagId(),(oldValue,newValue)->oldValue));

        System.out.println(newMap);

        Map<String,Long> newMap1 = noteLst.stream().sorted(Comparator.comparingLong(learn2::getTagId).reversed())
                .collect(Collectors.toMap(learn2->learn2.getTagName(),learn2 -> learn2.getTagId(),(oldValue,newValue)->oldValue, LinkedHashMap::new));
        System.out.println(newMap1);
    }

}
