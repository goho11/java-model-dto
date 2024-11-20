package ex03;

import java.util.Optional;

// 옵셔널: (자바) null 처러
public class App {
    public static void main(String[] args) {
        String data1 = null;
        Optional<String> op1 = Optional.ofNullable(data1); // null이 가능한

        if (op1.isPresent()) {
            String r1 = op1.get();
            System.out.println("r1 : " + r1); // 실행안됨
        }

        // 람다 적용하기 -여러개중 람다 인터페이스 이름 있는거
        String data2 = null;
        // null이면 무엇을 공급해줄건지
        // .get 바로 사용불가
        String r2 = Optional.ofNullable(data2).orElseGet(() -> "없어");
        System.out.println("r2 : " + r2);

        String data3 = null;
        // 터트리게 설정 -이때 메세지 출력 설정하기
        // 값을 찾으면 줌. 값이 없으면(null이니) throw해라
        String r3 = Optional.ofNullable(data3).orElseThrow(() -> new RuntimeException("값이 없는데? 조심해 너"));
        System.out.println("r3 : " + r3);
    }
}
