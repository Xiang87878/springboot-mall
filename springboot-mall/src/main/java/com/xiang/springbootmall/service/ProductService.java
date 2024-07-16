package com.xiang.springbootmall.service;

import com.xiang.springbootmall.dto.ProductRequest;
import com.xiang.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
