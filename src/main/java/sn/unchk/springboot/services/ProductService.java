package sn.unchk.springboot.services;

import sn.unchk.springboot.entity.Product;
import sn.unchk.springboot.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> listProducts() {
        return productRepository.findAll();
    }
}