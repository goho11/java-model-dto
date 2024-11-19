package dto;

import lombok.Data;
import model.Product;

@Data // get, set
public class ProductDTO {
    private int id;
    private String name;

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
    }
}
