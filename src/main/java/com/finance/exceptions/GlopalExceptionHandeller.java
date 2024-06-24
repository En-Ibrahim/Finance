package com.finance.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Arrays;

@ControllerAdvice
public class GlopalExceptionHandeller {

    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<?> handelRecordNotFound(RecordNotFoundException ex){

        ErrorResponse errorResponse= new ErrorResponse(ex.getLocalizedMessage(), Arrays.asList(ex.getMessage()));

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }


    @ExceptionHandler(value = DublicateErrorException.class)
    public ResponseEntity<?> handelDublicateErrorException(DublicateErrorException ex){
        ErrorResponse errorResponse= new ErrorResponse(ex.getLocalizedMessage(), Arrays.asList(ex.getMessage()));

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorResponse);
    }


}
