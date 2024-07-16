package com.xiang.springbootmall.dao;

import com.xiang.springbootmall.dto.ProductRequest;
import com.xiang.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
