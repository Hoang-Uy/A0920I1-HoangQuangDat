package com.codegym.shoppingcart.controller;

import com.codegym.shoppingcart.model.Cart;
import com.codegym.shoppingcart.model.Product;
import com.codegym.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private ProductService productService;

    @ModelAttribute("cart")
    public Cart setUpUserForm(){
        return new Cart();
    }

    @GetMapping("/")
    public ModelAndView showProductList(){
        return new ModelAndView("list", "products", productService.findAll());
    }

    @GetMapping("/view-product/{id}")
    public ModelAndView viewProduct(@PathVariable("id") Integer id){
        System.out.println(productService.findById(id).getId());
        return new ModelAndView("view", "product", productService.findById(id));
    }

    @PostMapping("/view-product/{id}")
    public ModelAndView addViewProduct(@PathVariable("id") Integer id, @ModelAttribute("cart") Cart cart){
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("product",product);
        if(product == null){
            modelAndView.addObject("message","Error");
        }else{
            cart.addToCart(product);
            modelAndView.addObject("message","Add "+product.getProductName()+" to cart successfully! Amount: "+cart.getAmount(product));
        }
        System.out.println("test");
        System.out.println(cart.getCart().toString());
        return modelAndView;
    }

    @GetMapping("/cart")
    public ModelAndView goToCart(@ModelAttribute("cart") Cart cart){
        return new ModelAndView("cart", "list", cart.getCart());
    }

    @GetMapping("/cart/{id}")
    public ModelAndView removeProduct(@ModelAttribute("cart") Cart cart, @PathVariable("id") Integer id){
        cart.removeProduct(productService.findById(id));
        return new ModelAndView("redirect:/cart");
    }

}
