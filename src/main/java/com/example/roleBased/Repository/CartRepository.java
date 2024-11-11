package com.example.roleBased.Repository;

import com.example.roleBased.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart , Long> {
    Cart findByCustomerId(Long userid);
}
