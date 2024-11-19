package dto;

import model.OrderOption;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailDTO {
    private int orderId;
    private List<ProductDTO> products =new ArrayList<>();
    private int sumPrice;

    publc OrderDetailDTO(List<OrderOption> products) {
        this.orderId = orderId;
        this.products = products;
        this.sumPrice = sumPrice;
    }

    class ProductDTO {
        private int productId;
        private List<OrderOptionDTO> orderOptions = new ArrayList<>();

            public dto.ProductDTO(List<OrderOption> orderOptions) {
                this.orderOptions = orderOptions;
                this.productId = productId;
        }
    }
}
