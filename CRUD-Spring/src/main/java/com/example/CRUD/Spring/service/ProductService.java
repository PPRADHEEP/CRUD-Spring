package com.example.CRUD.Spring.service;

import com.example.CRUD.Spring.model.Product;
import com.example.CRUD.Spring.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRespository pr;

    public List<Product> getAllProducts(){
        return pr.findAll();
    }

    public Product add(Product prod) {
        return pr.save(prod);
    }


    public Optional<Product> getProduct(Long id) {
        return pr.findById(id);
    }

    public Product getProductName(String name) {
        return pr.findByName(name);
    }

    public String deleteProduct(Long id) {
        pr.deleteById(id);
        return "delete success";
    }
}
