package com.serenitydojo.exceptions;

import java.io.IOException;

public class MissingWelcomeFileException extends RuntimeException {
    public MissingWelcomeFileException(String message) {
        super(message);
    }

    public MissingWelcomeFileException(String message, Throwable e) {
        super(message, e);
    }
}
