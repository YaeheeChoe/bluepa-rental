package com.bluepa.backend.global.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class AlreadyExistsEntityException extends RuntimeException {

    public AlreadyExistsEntityException() {
        super();
    }
}
