package com.yash.product.service.service;

import com.yash.product.service.dto.ProductRequest;
import com.yash.product.service.dto.ProductResponse;
import com.yash.product.service.model.Product;
import com.yash.product.service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    // instead of making all arg constructor manually use annotation - RequiredArgsConstructor
//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    public void createProduct(ProductRequest productRequest){
        Product product=Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);

        log.info("product {} is saved",product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products= productRepository.findAll();
        return products.stream().map(this ::mapToProductResponse).collect(Collectors.toList());
    }

    // to use ModelMapper , added 1 dependency in pom.xml i.e org.modelmapper
    private ProductResponse mapToProductResponse(Product product){
        ProductResponse productResponse = modelMapper.map(product, ProductResponse.class);
        return productResponse;
    }
}
