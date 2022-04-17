package com.kevcode.bank.domain.bank.accounts.exceptions;

public class InvalidValueException extends Exception{
    public InvalidValueException() {
        super();
    }

    public InvalidValueException(String message) {
        super(message);
    }


    public InvalidValueException(String message, Throwable cause) {
        super(message, cause);
    }


    public InvalidValueException(Throwable cause) {
        super(cause);
    }


    protected InvalidValueException(String message, Throwable cause,
                                          boolean enableSuppression,
                                          boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
