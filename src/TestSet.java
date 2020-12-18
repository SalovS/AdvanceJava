import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        for(int i = 0; i < 6; i++){
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int i = 2; i < 8; i++){
            set2.add(i);
        }

        // union - объединение множеств
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);



//        Set<String> hashSet = new HashSet<>();
//        Set<String> linkedHashSet = new LinkedHashSet<>();
//        Set<String> treeSet = new TreeSet<>();
//        hashSet.add("Mike");
//        hashSet.add("Katy");
//        hashSet.add("Tom");
//        hashSet.add("George");
//        hashSet.add("Donald");
//        hashSet.add("Tom");
//        hashSet.add("Tom");

//        System.out.println(hashSet.contains("Tom"));
//        System.out.println(hashSet.contains("Tim"));
//        System.out.println(hashSet.isEmpty());
//        System.out.println(linkedHashSet.isEmpty());
//        for (String name : hashSet)
//            System.out.println(name);
//        System.out.println(hashSet);

//        linkedHashSet.add("Mike");
//        linkedHashSet.add("Katy");
//        linkedHashSet.add("Tom");
//        linkedHashSet.add("George");
//        linkedHashSet.add("Donald");
//        for (String name : linkedHashSet)
//            System.out.println(name);

//        treeSet.add("Mike");
//        treeSet.add("Katy");
//        treeSet.add("Tom");
//        treeSet.add("George");
//        treeSet.add("Donald");
//        for (String name : treeSet)
//            System.out.println(name);


    }
}
