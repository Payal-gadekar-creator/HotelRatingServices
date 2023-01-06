package com.user.service.exception;

import com.user.service.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class globalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex)
    {
    String message = ex.getMessage();
    ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        ApiResponse response = new ApiResponse();
        return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
    }

}
