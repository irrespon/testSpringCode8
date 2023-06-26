package com.example.demoweb.controller;

import com.example.demoweb.model.Product;
import com.example.demoweb.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model){
        model.addAttribute("products",productService.findAll());
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(Product product, Model model){

        productService.addProduct(product);
        model.addAttribute("products", productService.findAll());
        return "products.html";
    }
}
