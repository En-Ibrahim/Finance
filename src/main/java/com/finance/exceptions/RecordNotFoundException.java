package com.finance.exceptions;

import org.springframework.stereotype.Controller;

@Controller
public class RecordNotFoundException extends RuntimeException{

    public RecordNotFoundException() {
        super();
    }

    public RecordNotFoundException(String message) {
        super(message);
    }
}
