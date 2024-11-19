import com.google.gson.Gson;
import dto.OrderDetailDTO;
import dto.ProductDTO;
import dto.ProductDetailDTO;
import lombok.Getter;
import lombok.Setter;
import model.Order;
import model.OrderOption;
import model.ProductOption;
import model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        // 1. 상품 2개
        Product p1 = new Product(1, "바지");
        Product p2 = new Product(2, "티");

        // 2. 옵션 4개 생성 (2-1, 2-2)
        ProductOption op1 = new ProductOption(1, "파란바지", 1000, 10, p1);
        ProductOption op2 = new ProductOption(2, "빨간바지", 2000, 10, p1);
        ProductOption op3 = new ProductOption(3, "노랑티", 1000, 10, p2);
        ProductOption op4 = new ProductOption(4, "하얀티", 2000, 10, p2);

        List<ProductOption> p2Options = Arrays.asList(op3, op4);

        // 3. 구매
        Order or1 = new Order(1);
        OrderOption orOption1 = new OrderOption(1, "파란바지", 2, 2000, p1, or1);
        OrderOption orOption2 = new OrderOption(2, "빨간바지", 2, 4000, p1, or1);
        OrderOption orOption3 = new OrderOption(3, "하얀티", 5, 10000, p2, or1);

        op1.setQty(op1.getQty() - 2);
        op2.setQty(op2.getQty() - 2);
        op4.setQty(op4.getQty() - 5);

        Order or2 = new Order(2);
        OrderOption orOption4 = new OrderOption(4, "노랑티", 7, 7000, p2, or2);

        op3.setQty(op3.getQty() - 7);

        // gson
        Gson gson = new Gson();

        // 4. 상품 목록 화면 (products) -> List<ProductDTO>
        List<Product> products = Arrays.asList(p1, p2); // 1번 문제 -> products DTO로 옮기기

        // 알고리즘
        // 4-1. product -> new ProductDTO(product);
        List<ProductDTO> productDTOs = new ArrayList<>();

        for (Product product : products) {
            productDTOs.add(new ProductDTO(product));
        }
        // 해당 코드 for문 줄이기
//        ProductDTO pDTO1 = new ProductDTO(products.get(0));
//        ProductDTO pDTO2 = new ProductDTO(products.get(1));
//        productDTOs.add(pDTO1);
//        productDTOs.add(pDTO2);

        String r1 = gson.toJson(productDTOs); // json 전송 확인
        System.out.println(r1);

        // 5. 상품 상세 화면 (p1Options) -> ProductDetailDTO
        List<ProductOption> p1Options = Arrays.asList(op1, op2); // 2번 문제 -> p1, p1Options DTO로 옮기기

        ProductDetailDTO productDetailDTO = new ProductDetailDTO(p1Options);
        String r2 = gson.toJson(productDetailDTO); // json 전송 확인
        System.out.println(r2);

        // 6. 주문 확인 상세 화면 (or1Options) -> OrderDetailDTO
        List<OrderOption> or1Options = Arrays.asList(orOption1, orOption2, orOption3);

        OrderDetailDTO orderDetailDTO = new OrderDetailDTO(or1Options);
        String r3 = gson.toJson(orderDetailDTO);
        System.out.println(r3);

    }

}