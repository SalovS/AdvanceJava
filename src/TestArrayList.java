import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.remove(5);
        System.out.println(list);


//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.get(99));
//        System.out.println(list.size());

//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//        for(Integer x: list){
//            System.out.println(x);
//        }

        list = new LinkedList<>();
    }
}
