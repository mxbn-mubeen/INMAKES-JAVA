package com.example.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.dao.ProductRepository;
import com.example.model.Product;

@RestController
public class HomeController {
    private  ProductRepository productRepository;

    public HomeController(ProductRepository productRepository) {
        this.productRepository = productRepository;
        System.out.println("front controller object created");
    }

    @RequestMapping("/")
    public String addProduct() {
        return "Registration";
    }

    @PostMapping(path ="/saveProduct",consumes = {"application/json"})
    public Product saveProduct(@RequestBody Product p) {
    	
        productRepository.save(p);
        return p;
    }
    
    @DeleteMapping(path ="/deleteProduct/{pid}",consumes = {"application/json"})
    public String deleteProduct(@PathVariable("pid") int pid) {
    	
    	productRepository.deleteById(pid);
    	System.out.println("deleted");
		return "deleted";
    	
    }

    @GetMapping(path = "/ViewAllProducts",produces = {"application/json"})
    @ResponseBody
    public Iterable<Product> allProducts() {
        return productRepository.findAll();
    }
    
    @GetMapping("/product/{productid}")
    @ResponseBody
    public Product viewOneProduct(@PathVariable("productid")int pid) {
    	
    	return productRepository.findById(pid).orElse(null);
    	
    }
    
    @RequestMapping("/editProduct/{productid}")
    public String editProduct(@PathVariable("productid") int pid, Model m) {
        m.addAttribute("product", productRepository.findById(pid).orElse(null));
        return "ProductEdit";
    }
}
