package ex04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupApp {
    public static void main(String[] args) {
        // 1. group
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");

        // Map<Character, List<String>> 기본 리턴타입 형태
        // var로 변경가능 -? var이 형태인지
        var groupData = names.stream()
                .map(name -> name.toUpperCase()) // 모든 글자 대문자 변환
                // 수집 -같은 항목끼리 구분함(map이라 보면 key값)
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(groupData);

        System.out.println(groupData.get('A'));
    }
}
