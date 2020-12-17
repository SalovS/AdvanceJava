import java.util.HashMap;
import java.util.Map;

public class TestHeahMap {
    public static void main(String[] agrs) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Единица");
        map.put(2, "Двойка");
        map.put(3, "Тройка");
//        System.out.println(map);
//
//        map.put(3,"Другое значение для ключа три");
//        System.out.println(map);
//
//        System.out.println(map.get(1));
//        System.out.println(map.get(10));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
