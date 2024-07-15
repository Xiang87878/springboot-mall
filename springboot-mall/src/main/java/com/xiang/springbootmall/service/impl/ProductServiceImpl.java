package com.xiang.springbootmall.service.impl;


import com.xiang.springbootmall.dao.ProductDao;
import com.xiang.springbootmall.model.Product;
import com.xiang.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
