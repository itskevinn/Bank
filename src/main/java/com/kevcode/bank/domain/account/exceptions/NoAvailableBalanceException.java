package com.kevcode.bank.domain.account.exceptions;

public class NoAvailableBalanceException extends Exception {
    public NoAvailableBalanceException() {
        super();
    }

    public NoAvailableBalanceException(String message) {
        super(message);
    }


    public NoAvailableBalanceException(String message, Throwable cause) {
        super(message, cause);
    }


    public NoAvailableBalanceException(Throwable cause) {
        super(cause);
    }


    protected NoAvailableBalanceException(String message, Throwable cause,
                                          boolean enableSuppression,
                                          boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
