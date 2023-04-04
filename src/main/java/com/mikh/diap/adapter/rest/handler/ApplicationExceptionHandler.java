package com.mikh.diap.adapter.rest.handler;

import com.mikh.diap.app.exception.ApplicationInformationException;
import com.mikh.diap.app.exception.ApplicationNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ApplicationExceptionHandler {
    @ExceptionHandler(value = ApplicationNotFoundException.class)
    public ResponseEntity<String> handleApplicationNotFoundException(RuntimeException ex, WebRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Requested application doesn't exist");
    }

    @ExceptionHandler(value = ApplicationInformationException.class)
    public ResponseEntity<String> handleApplicationInformationException(RuntimeException ex, WebRequest request) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Fill in all the required fields");
    }
}
