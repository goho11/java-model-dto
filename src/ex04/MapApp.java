package ex04;

import java.util.Arrays;
import java.util.List;

public class MapApp {
    public static void main(String[] args) {
        // map (가공) -Function. 받아서 돌려줌
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // List 글자 소문자 변환
        // 던짐 > map은 무조건 순회 -수정해도 임시 공간에 남아있음 > toList 수집
        List<String> newNames = names.stream()
                .map(name -> name.toLowerCase())
                .filter(name -> name.length() > 3)
                .toList();

        newNames.forEach(name -> System.out.println(name));
    }
}
