package com.example.ecommerce.model;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
    @Table(name = "orders")
    public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false)
        private User user;

        @Column(name = "order_date", nullable = false)
        private LocalDateTime orderDate;

    public Order(User user, List<Product> products) {
    }

    public void setUser(User user) {
    }

    public void setProducts(List<Product> products) {
    }
}


