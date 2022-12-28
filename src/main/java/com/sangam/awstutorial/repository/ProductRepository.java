package com.sangam.awstutorial.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sangam.awstutorial.model.Product;

@Repository
public interface  ProductRepository extends JpaRepository<Product,Long> {

}
