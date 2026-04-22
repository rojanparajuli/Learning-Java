import java.util.*;

class HighestFrequency {
    public static void main(String[] a) {
        String s = "hello world";
        System.out.println(
                s.chars()
                        .mapToObj(c -> (char) c)
                        .max(Comparator.comparing(c -> s.length() - s.replace(c + "", "").length()))
                        .get());
    }
}