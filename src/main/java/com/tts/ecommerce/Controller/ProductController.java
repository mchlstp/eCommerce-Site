package com.tts.ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.tts.ecommerce.Model.Product;
import com.tts.ecommerce.Service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/product/{id}")
    public String show(@PathVariable Long id, Model model) {
        Product product = productService.findById(id);
        System.out.println("---------------------------------");
        System.out.println(product);
        model.addAttribute("product", product);
        return "product";
    }

	


}
