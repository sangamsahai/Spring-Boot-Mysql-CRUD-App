package com.sangam.awstutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sangam.awstutorial.model.Product;
import com.sangam.awstutorial.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		Product savedProduct = productService.saveProduct(product);

		return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	}

	@GetMapping("/product")
	public ResponseEntity<Product> getProduct(@RequestParam(name = "productId") long productId) {
		Product product = productService.getProduct(productId);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}

	@GetMapping("/products")
	public List<Product> getProducts() {
		return productService.getProducts();

	}
	
	
	@PatchMapping("/product")
	public ResponseEntity<Product> updateProduct(@RequestParam(name = "productId") long productId, @RequestBody Product product) {
		Product updatedProduct = productService.updateProduct(productId, product);
		return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
	}
	

	@DeleteMapping("/product")
	public ResponseEntity<Product> deleteProduct(@RequestParam(name = "productId") long productId) {
		Product deletedProduct = productService.deleteProduct(productId);
		return new ResponseEntity<>(deletedProduct, HttpStatus.OK);
	}

}
