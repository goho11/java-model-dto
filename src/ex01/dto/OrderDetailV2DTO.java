package ex01.dto;

import lombok.Data;
import ex01.model.OrderOption;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class OrderDetailV2DTO {
    private int orderId;
    private List<ProductDTO> products;
    private int sumPrice;

    public OrderDetailV2DTO(List<OrderOption> orderOptions) {
        // 1. orderId
        this.orderId = orderOptions.get(0).getOrder().getId();
        // 2. sumPrice - 활용
        this.sumPrice = orderOptions.stream()
                .mapToInt(value -> value.getTotalPrice())
                .sum();

        // 3. products
        // 3.1 List<OrderOption> options 친구를 물가에 던진다
        // 3.2 product로 그룹핑(같은 객체 or1, or2) (다른 객체 or3) -결과가 Map
        // 3.3 OrderProductDTO를 그룹 개수만큼 생성해서 만들어주기
        // 중간에 사용하기 entrySet() // Map타입을 set타입으로 변경
        this.products = orderOptions.stream()
                .collect(Collectors.groupingBy(option -> option.getProduct().getId())) // productId로 그룹화
                .entrySet().stream()
                .map(entry -> new ProductDTO(entry.getKey(), entry.getValue())) // ProductDTO로 변환
                .toList();
    }

    @Data
    class ProductDTO {
        private int productId;
        private List<OrderOptionDTO> orderOptions;

        public ProductDTO(int productId, List<OrderOption> orderOptions) {
            this.productId = productId;
            this.orderOptions = orderOptions.stream().map(option -> new OrderOptionDTO(option)).toList();
        }

        @Data
        class OrderOptionDTO {
            private int orderOptionId;
            private String orderOptionName;
            private int orderQty;
            private int orderTotalPrice;

            public OrderOptionDTO(OrderOption orderOption) {
                this.orderOptionId = orderOption.getId();
                this.orderOptionName = orderOption.getOptionName();
                this.orderQty = orderOption.getQty();
                this.orderTotalPrice = orderOption.getTotalPrice();
            }
        }
    }
}
