package com.example.demo;

import java.io.IOException;

public class CustomException extends IOException implements AutoCloseable {

    @Override
    public void close() throws CustomException {
        throw new CustomException ();
    }

    public static void main(String[] args) throws Exception {
        try (CustomException c = new CustomException()) {
            throw new CustomException();
        }
    }
}
