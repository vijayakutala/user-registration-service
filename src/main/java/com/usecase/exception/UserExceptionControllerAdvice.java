package com.usecase.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionControllerAdvice {
	
	
	@ExceptionHandler(value = UserCreationException.class)
	public ResponseEntity<Object> exception(UserCreationException exception) {
		return new  ResponseEntity<>("unable to register user", HttpStatus.PARTIAL_CONTENT);
	}
}
