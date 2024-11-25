package com.daw.despliegue.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Controlador que gestiona las escepciones que ocurren en el backend
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Método que maneja las excepciones generales
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ha ocurrido un error: " + ex.getMessage());
    }
}
