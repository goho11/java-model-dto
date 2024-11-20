package ex02;

/** 1. 람다는 인터페이스로 만든다
 *  2. 인터페이스 메서드는 하나만 존재해야 한다
 *  3. 메서드가 인터페이스를 매개변수로 받고 있으면, 행위를 주세요
 *  4. 람다에서는 매개변수 타입 생략 가능
 *  5. @FunctionalInterface(런타임) 표시가능
 */

public class App {
    public static void main(String[] args) {
        // 값이 없으면 괄호(매개변수)가 있어야 한다
        // 예) 값 없을 때: () -> {}
       MyConsumer<Integer> r1 = (Integer date) -> {
           System.out.println("소비할 데이터 : " + date);
       };
       r1.accept(1);

//       MySupplier<String> r2 = () -> {return "good";}; // 람다식
        MySupplier<String> r3 = () -> "good"; // 람다표현식. 중괄호 생략가능
        String msg = r3.get();
        System.out.println(msg);
    }
}
