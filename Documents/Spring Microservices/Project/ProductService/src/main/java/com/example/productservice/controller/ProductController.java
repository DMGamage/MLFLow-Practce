package com.example.productservice.controller;

import com.example.productservice.dto.ProductRequest;
import com.example.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService  productService;

    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);

    }
}
