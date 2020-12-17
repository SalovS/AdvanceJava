import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHeahMap {
    public static void main(String[] agrs) {
//        Map<String, String> translation = new HashMap<>();
//
//        translation.put("кошка", "cat");
//        translation.put("собака", "dog");
//        translation.put("слон", "elephant");
//
//        for (Map.Entry<String, String> entry : translation.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
        Map<Integer, String> hashMap = new HashMap<>();// не никакого порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();// устанавливается порядок по дабавлению
        Map<Integer, String> treeMap = new TreeMap<>();// автоматическая сортировка по ключу

        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
