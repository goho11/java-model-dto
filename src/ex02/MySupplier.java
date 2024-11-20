package ex02;

// 입력없이 값을 반환 -공급자
// 나(소비자)에게 반환값 준다
@FunctionalInterface // 메서드 2개시 에러
public interface MySupplier<T> {
    T get();
}
