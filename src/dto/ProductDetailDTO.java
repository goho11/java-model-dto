package dto;

import lombok.Data;
import model.Product;
import model.ProductOption;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductDetailDTO {
    private int productId;
    private String productName;

    private List<ProductOptionDTO> options = new ArrayList<>();

    public ProductDetailDTO(List<ProductOption> options) {
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
