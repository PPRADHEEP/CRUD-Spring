package com.example.CRUD.Spring.Controller;

import com.example.CRUD.Spring.model.Product;
import com.example.CRUD.Spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    public ProductService ps;

    @GetMapping("/getproduct")
    public List<Product> getAllProducts() {
        return ps.getAllProducts();
    }

    @PostMapping("/create")
    public Product add(@RequestBody Product prod) {
        return ps.add(prod);
    }

    @GetMapping("/id/{id}")
    public Optional<Product> getProduct(@PathVariable Long id) {
        return ps.getProduct(id);
    }

    @GetMapping("/name/{name}")
    public Product getProductName(@PathVariable String name){
        return ps.getProductName(name);
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        return ps.deleteProduct(id);
    }
}
