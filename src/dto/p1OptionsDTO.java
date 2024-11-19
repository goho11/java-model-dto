package dto;

import java.util.ArrayList;
import java.util.List;

// ProductDTO 모든 데이터 사용시 필드로 포함가능
public class p1OptionsDTO {
    private int id;
    private String name;
    private int price;
    private int qty;
    private List<ProductDTO> productDTO = new ArrayList<ProductDTO>();

    public p1OptionsDTO(int id, String name, int price, int qty, List<ProductDTO> productDTO) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.productDTO = productDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public List<ProductDTO> getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(List<ProductDTO> productDTO) {
        this.productDTO = productDTO;
    }
}
