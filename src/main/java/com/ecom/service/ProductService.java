package com.ecom.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import com.ecom.dto.ProductDto;
import com.ecom.dto.ProductResponse;
import com.ecom.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public List<Product> getAllProducts();

	public Boolean deleteProduct(Integer id);

	public Product getProductById(Integer id);

	public Product updateProduct(Product product, MultipartFile file);
	
	public List<Product> getAllActiveProducts(String category);
	
	public List<Product> searchProduct(String ch);
	
	
	public Boolean saveProductApi(ProductDto productDto);

	public List<ProductDto> getAllProductsApi();

	public ProductDto getProductByIdApi(Integer id);

	public Boolean deleteProductApi(Integer id);

	public ProductResponse getProductsWithPaginationApi(int pageNo, int pageSize, String sortBy, String sortDir);


}
