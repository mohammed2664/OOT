package com.tourism.exception;

/** Custom exception for domain validation errors. */
public class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}