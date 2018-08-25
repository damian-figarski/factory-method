package com.doddlecode;

public class WrongCountryException extends RuntimeException {

    public WrongCountryException() {
    }

    public WrongCountryException(String message) {
        super(message);
    }

    public WrongCountryException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongCountryException(Throwable cause) {
        super(cause);
    }

}
