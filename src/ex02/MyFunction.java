package ex02;

// 입력을 받아서 결과를 반환 -return, 매개변수 있다
public interface MyFunction<T, R> {
    R apply(T t); // return값은 사용자가 지정
}
