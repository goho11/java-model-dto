package ex05;

import java.util.Arrays;
import java.util.List;

public class Repository {
    public List<Integer> findAll() {
        return Arrays.asList(1,2,3,4,5);
    }

    public int findById() {
        // 조회하다가 오류 [숫자를 리턴]
        // -1 오류 (안됨 -타입이 달라질 수 있다)
        // 오류가 난 곳에 서 처리 (안됨 -책임이 분리되어 있어서)

        // 단일 책임 원칙(SRP)와 관련 -메서드가 예외 처리를 책임지지 않고, 호출한 곳에 위임
        // service의 상세보기()에 위임
        throw new RuntimeException("디비 오류 발생");
    }
}
