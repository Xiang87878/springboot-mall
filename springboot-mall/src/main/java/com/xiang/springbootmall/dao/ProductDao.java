package com.xiang.springbootmall.dao;

import com.xiang.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
