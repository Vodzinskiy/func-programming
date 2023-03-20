import java.util.ArrayList;
import java.util.List;

public class Lab1 {
    public static List<Object> singleton(Object element) {
        List<Object> list = new ArrayList<>();
        list.add(element);
        return list;
    }

    public static boolean isNull(List<Object> list) {
        return list == null || list.isEmpty();
    }

    public static List<Object> snoc(List<Object> list, Object element) {
        List<Object> newList = new ArrayList<>(list);
        newList.add(element);
        return newList;
    }

    public static int length(List<?> list) {
        return list.size();
    }

    public static void main(String[] args) {
        // singleton function
        List<Object> list = singleton(1);
        System.out.println("Singleton function: " + list);

        // isNull function
        List<Object> nullList = new ArrayList<>();
        System.out.println("isNull function: " + isNull(list));
        System.out.println("isNull function: " + isNull(nullList));

        // snoc function
        List<Object> newList = snoc(list, 2);
        System.out.println("snoc function: " + newList);

        // length function
        System.out.println("length function: " + length(newList));
    }
}
