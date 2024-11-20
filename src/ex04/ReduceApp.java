package ex04;

import java.util.Arrays;
import java.util.List;

public class ReduceApp {
    public static void main(String[] args) {
        // 1. reduce (조인)
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        int sum = nums.stream()
                .mapToInt(x -> x) // int타입 리턴
                .sum();
        System.out.println(sum);

        // reduce 전까지 map 등 추가 가능
        int sum2 = nums.stream()
                .reduce(5, (prev, next) -> {
                    System.out.println("prev: " + prev);
                    System.out.println("next: " + next);
                    System.out.println("------------------");
                    return prev + next; // {}가 있으면 return이 반드시 있어야 한다
                });
        System.out.println(sum2);
    }
}
