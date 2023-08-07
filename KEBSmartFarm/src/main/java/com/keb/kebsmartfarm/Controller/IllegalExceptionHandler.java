package com.keb.kebsmartfarm.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class IllegalExceptionHandler {
    @ExceptionHandler(value = IllegalStateException.class)
    public ResponseEntity<String> handleIllegalException(IllegalStateException e) {
        // 오류 메시지 출력
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
