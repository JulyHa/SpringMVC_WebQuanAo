package com.example.demo.service.impl;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductEntity> getListProduct() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity getProduct(int id) {
        return productRepository.getById(id);
    }

    @Override
    public ProductEntity updateProduct(int id, ProductEntity newProduct) {
        ProductEntity productEntity = productRepository.findById(id).orElse(null);
        if(productEntity == null){
            return null;
        }
        productEntity.setProductName(newProduct.getProductName());
        productEntity.setProductPrice(newProduct.getProductPrice());
        productEntity.setProductQuantity(newProduct.getProductQuantity());
        productEntity.setProductSize(newProduct.getProductSize());
        productEntity.setProductDescription(newProduct.getProductDescription());
        productEntity.setProductRating(newProduct.getProductRating());
        productEntity.setCategoryId(newProduct.getCategoryId());
        productEntity.setAmountSold(newProduct.getAmountSold());
        productEntity.setCreateTime(newProduct.getCreateTime());
        productEntity.setDelete(newProduct.isDelete());

        ProductEntity update = productRepository.save(productEntity);

        return update;
    }

    @Override
    public boolean createProduct(ProductEntity newProduct) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductId(newProduct.getProductId());
        productEntity.setProductName(newProduct.getProductName());
        productEntity.setProductPrice(newProduct.getProductPrice());
        productEntity.setProductQuantity(newProduct.getProductQuantity());
        productEntity.setProductSize(newProduct.getProductSize());
        productEntity.setProductDescription(newProduct.getProductDescription());
        productEntity.setProductRating(newProduct.getProductRating());
        productEntity.setCategoryId(newProduct.getCategoryId());
        productEntity.setAmountSold(newProduct.getAmountSold());
        productEntity.setCreateTime(newProduct.getCreateTime());
        productRepository.save(productEntity);
        return true;
    }

    @Override
    public boolean deleteProduct(int id) {
        ProductEntity product = productRepository.findById(id).orElse(null);
        if(product == null){
            return false;
        }
        if(product.isDelete()){
            return false;
        }
        product.setDelete(true);
        productRepository.save(product);
        return true;
    }


}
