import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List<Integer> likedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        measureTime(likedList);
        measureTime(arrayList);


//        likedList.add(1);
//        likedList.get(0);
//        likedList.size();
//        likedList.remove(0);
    }

    private static void measureTime(List<Integer> list) {
//        for (int i = 0; i < 100000; i++) {
//            list.add(i);
//        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i);
//        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
