package sn.unchk.springboot.controller;

import sn.unchk.springboot.entity.Product;
import sn.unchk.springboot.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.listProducts();
    }
}