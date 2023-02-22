import java.util.*;
public class SortArray {
    public static void sort(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.sort(list);
// list.toArray(array); // Not necessary
    }
    public static void main(String[] args) {
        String[] s = {"hello","bye","1","5"};
        sort(s);
        for (String str: s) {
            System.out.println(str);
        }
    }
}