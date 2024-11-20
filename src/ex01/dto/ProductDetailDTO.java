package ex01.dto;

import lombok.Data;
import ex01.model.Product;
import ex01.model.ProductOption;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductDetailDTO {
    private int productId;
    private String productName;

    // ProductDetailDTO의 범위 내에서만 사용되는 클래스
    // 다른 클래스에서 직접 사용할 필요가 없다
    private List<ProductOptionDTO> options = new ArrayList<>();

    public ProductDetailDTO(List<ProductOption> options) {
        // 첫번째 옵션의 상품 ID와 이름 출력
        // 모든 옵션의 Product 정보를 가져오려면 역시 반복문 필요
        this.productId = options.get(0).getProduct().getId();
        this.productName = options.get(0).getProduct().getName();

        // models -> dtos
        for (ProductOption option : options) {
            this.options.add(new ProductOptionDTO(option));
        }
    }

    // ProductOption 4개 전부 들고오기
    @Data
    class ProductOptionDTO {
        private int id;
        private String name;
        private int price;
        private int qty;
        private Product product;

        // 초기화를 위한 생성자
        public ProductOptionDTO(ProductOption option) {
            this.id = option.getId();
            this.name = option.getName();
            this.price = option.getPrice();
            this.qty = option.getQty();
        }
    }
}
