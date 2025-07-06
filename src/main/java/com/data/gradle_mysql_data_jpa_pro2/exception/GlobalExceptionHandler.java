package com.data.gradle_mysql_data_jpa_pro2.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        ResponseEntity<String> responseEntity = ResponseEntity.badRequest().body("IllegalArgumentException : " + ex.getMessage());
        return responseEntity;
    }

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handleArithmeticException(ArithmeticException ex) {
        ResponseEntity<String> responseEntity = ResponseEntity.badRequest().body("ArithmeticException : " + ex.getMessage());
        return responseEntity;
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleCustomException(CustomException ex) {
        ResponseEntity<String> responseEntity = ResponseEntity.badRequest().body("CustomException : " + ex.getMessage());
        return responseEntity;
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException ex) {
        ResponseEntity<String> responseEntity = ResponseEntity.badRequest().body("NullPointerException : " + ex.getMessage());
        return responseEntity;
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handleNumberFormatException(NumberFormatException ex) {
        ResponseEntity<String> responseEntity = ResponseEntity.badRequest().body("NumberFormatException : " + ex.getMessage());
        return responseEntity;
    }
}
