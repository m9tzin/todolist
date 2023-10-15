package br.com.m9tzin.todolist.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {
    /*Customização do erro */

    @ExceptionHandler(HttpMessageNotReadableException.class) /* passar o tipo de exception */
    public ResponseEntity<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException e){

        
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMostSpecificCause().getMessage());

    }
}
