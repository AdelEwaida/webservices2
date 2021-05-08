package com.example.demo.Repository;
import com.example.demo.Models.warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface warehouseRepo extends JpaRepository<warehouse, Integer> {
}
