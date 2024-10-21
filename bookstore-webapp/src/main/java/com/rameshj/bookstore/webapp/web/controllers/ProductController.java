package com.rameshj.bookstore.webapp.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @GetMapping
    public String index(){
        return "redirect:/products";
    }

    @GetMapping("/products")
    String productsPage(Model model, @RequestParam(value = "page",defaultValue = "1") int pageNo){
        model.addAttribute("pageNo",pageNo);
        return "products";
    }

}
