package com.example.ecommerce.controller;

import com.example.ecommerce.dto.CartItemDto;
import com.example.ecommerce.model.CartItem;
import com.example.ecommerce.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart-items")
public class CartItemController {
    private final CartItemService cartItemService;

    @Autowired
    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @PostMapping
    public CartItem createCartItem(@RequestBody CartItemDto cartItemDto) {
        Long productId = cartItemDto.getProductId();
        int quantity = cartItemDto.getQuantity();
        return cartItemService.createCartItem(productId, quantity);
    }

    @GetMapping
    public List<CartItem> getAllCartItems() {
        return cartItemService.getAllCartItems();
    }

    @GetMapping("/{id}")
    public CartItem getCartItemById(@PathVariable Long id) {
        return cartItemService.getCartItemById(id);
    }

    @PutMapping("/{id}")
    public CartItem updateCartItem(@PathVariable Long id, @RequestBody CartItemDto cartItemDto) {
        Long productId = cartItemDto.getProductId();
        int quantity = cartItemDto.getQuantity();
        return cartItemService.updateCartItem(id, productId, quantity);
    }

    @DeleteMapping("/{id}")
    public void deleteCartItem(@PathVariable Long id) {
        cartItemService.deleteCartItem(id);
    }
}
