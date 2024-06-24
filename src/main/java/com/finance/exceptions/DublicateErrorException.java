package com.finance.exceptions;

public class DublicateErrorException extends RuntimeException{


    public DublicateErrorException() {
        super();
    }

    public DublicateErrorException(String message) {
        super(message);
    }
}
