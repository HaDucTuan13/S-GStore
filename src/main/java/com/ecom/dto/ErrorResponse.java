package com.ecom.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {

    // Fields of the ErrorResponse class
    private Integer status;
    private String message;

    // Private constructor that takes a Builder object
    private ErrorResponse(Builder builder) {
        this.status = builder.status;
        this.message = builder.message;
    }

    // Static nested Builder class
    public static class Builder {
        // Fields matching the ErrorResponse class
        private Integer status;
        private String message;

        // Builder method for setting the status
        public Builder setStatus(Integer status) {
            this.status = status;
            return this; // Return the Builder object to allow method chaining
        }

        // Builder method for setting the message
        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        // Method to build and return the ErrorResponse object
        public ErrorResponse build() {
            return new ErrorResponse(this);
        }
    }
}
