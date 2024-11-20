package ex04;

import java.util.Arrays;
import java.util.List;

public class CountApp {
    public static void main(String[] args) {
        // count
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 뿌리고 중간 정산하고 다시 수집
        // toList로 받아서 리턴타입 List<String>
        List<String> r1 = names.stream()
                .filter(name -> name.length() > 3)
                .toList();

        r1.forEach(s -> System.out.println(s)); // 람다 consumer

        // count라서 리턴타입 long
        long r2 = names.stream()
                .filter(name -> name.length() > 3)
                .count();
        System.out.println(r2);
    }
}
