package com.example.demo.Repository;
import com.example.demo.Models.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface customerRepo extends JpaRepository<customer, Integer> {
}
