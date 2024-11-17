package com.ecom.dto;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductResponse {

    // Fields of the ProductResponse class
    private List<ProductDto> products;
    private long totalElements;
    private int totalPages;
    private Boolean isFirst;
    private Boolean isLast;
    private int pageNo;
    private int pageSize;
   
    public ProductResponse() {
		
	}

	// Private constructor that takes a Builder object
    private ProductResponse(Builder builder) {
        this.products = builder.products;
        this.totalElements = builder.totalElements;
        this.totalPages = builder.totalPages;
        this.isFirst = builder.isFirst;
        this.isLast = builder.isLast;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }
    
    public List<ProductDto> getProducts() {
		return products;
	}

	public long getTotalElements() {
		return totalElements;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public Boolean getIsFirst() {
		return isFirst;
	}

	public Boolean getIsLast() {
		return isLast;
	}

	public int getPageNo() {
		return pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}

	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public void setIsFirst(Boolean isFirst) {
		this.isFirst = isFirst;
	}

	public void setIsLast(Boolean isLast) {
		this.isLast = isLast;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	// Static nested Builder class
    public static class Builder {
        // Same fields as in the ProductResponse class
        private List<ProductDto> products;
        private long totalElements;
        private int totalPages;
        private Boolean isFirst;
        private Boolean isLast;
        private int pageNo;
        private int pageSize;

        // Builder method for setting products
        public Builder setProducts(List<ProductDto> products) {
            this.products = products;
            return this; // Return the Builder object to allow method chaining
        }

        // Builder method for setting totalElements
        public Builder setTotalElements(long totalElements) {
            this.totalElements = totalElements;
            return this;
        }

        // Builder method for setting totalPages
        public Builder setTotalPages(int totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        // Builder method for setting isFirst
        public Builder setIsFirst(Boolean isFirst) {
            this.isFirst = isFirst;
            return this;
        }

        // Builder method for setting isLast
        public Builder setIsLast(Boolean isLast) {
            this.isLast = isLast;
            return this;
        }

        // Builder method for setting pageNo
        public Builder setPageNo(int pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        // Builder method for setting pageSize
        public Builder setPageSize(int pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        // Method to build and return the ProductResponse object
        public ProductResponse build() {
            return new ProductResponse(this);
        }
    }
}
