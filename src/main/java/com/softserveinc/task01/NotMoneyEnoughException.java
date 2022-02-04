package com.softserveinc.task01;

public class NotMoneyEnoughException extends RuntimeException{
    public NotMoneyEnoughException() {
    }

    public NotMoneyEnoughException(String message) {
        super(message);
    }

    public NotMoneyEnoughException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotMoneyEnoughException(Throwable cause) {
        super(cause);
    }

    public NotMoneyEnoughException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
