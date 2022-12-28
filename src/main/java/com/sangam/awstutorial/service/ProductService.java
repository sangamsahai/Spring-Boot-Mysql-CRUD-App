package com.sangam.awstutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangam.awstutorial.model.Product;
import com.sangam.awstutorial.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public Product getProduct(long productId) {
		return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Not found !!"));
	}

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	public Product updateProduct(long productId, Product product) {
		Product existingProduct = productRepository.findById(productId)
				.orElseThrow(() -> new RuntimeException("Not found !!"));
		existingProduct.setProductName(product.getProductName());
		existingProduct.setColor(product.getColor());
		existingProduct.setPrice(product.getPrice());
		productRepository.save(existingProduct);
		return existingProduct;
	}

	public Product deleteProduct(long productId) {
		Product existingProduct = productRepository.findById(productId)
				.orElseThrow(() -> new RuntimeException("Not found !!"));
		productRepository.delete(existingProduct);
		return existingProduct;

	}

}
