package ex02;

// 입력만 받고 출력이 없는 연산을 수행 -소비자
public interface MyConsumer<T> {
    void accept(T date);
}
