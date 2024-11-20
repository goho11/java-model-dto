package ex02;

// 입력을 받아 논리값(참/거짓) 반환
public interface MyPredicate<T> {
     boolean apply(T t);
}
