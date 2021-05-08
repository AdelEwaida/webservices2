package com.example.demo.Repository;
import com.example.demo.Models.Order2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order2, Integer> {
}
