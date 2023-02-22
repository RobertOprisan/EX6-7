import java.util.*;
public class ShuffleArray {
    public static void shuffle(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
    }
    public static void main(String[] args) {
        String[] s = {"hello","bye","1","5"};
        shuffle(s);
        for (String str: s) {
            System.out.println(str);
        }
    }
}