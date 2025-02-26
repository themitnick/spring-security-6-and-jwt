package ci.app.springsecurity.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private record Product(int id, String name, double price) {}

    List<Product> products = List.of(
            new Product(1,"Laptop", 1000),
            new Product(2,"Mouse", 20),
            new Product(3,"Keyboard", 50)
    );

    @GetMapping
    public List<Product> getProducts() {
        return products;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }
}
