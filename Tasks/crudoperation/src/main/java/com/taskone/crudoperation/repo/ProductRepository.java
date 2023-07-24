package com.taskone.crudoperation.repo;

import com.taskone.crudoperation.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}