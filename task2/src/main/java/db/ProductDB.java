package db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import model.Product;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ProductDB {
    private List<Product> products = new ArrayList<>();

    public void initProductDB(){
        products.add(new Product("Phone",10.0));
        products.add(new Product("Laptop",15.0));
        products.add(new Product("Washing machine",20.0));
        products.add(new Product("Speakers",8.0));
        products.add(new Product("TV",13.0));
    }

    public ProductDB(){
    }

    public void addNewProduct(Product product){
        products.add(product);
    }
}
