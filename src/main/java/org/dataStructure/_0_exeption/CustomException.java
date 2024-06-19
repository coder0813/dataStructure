package org.dataStructure._0_exeption;

public class CustomException extends Exception {


    public int statusCode;

    public String message;


    public CustomException(String message) {
        super(message);
        this.message = message;
    }
    public CustomException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
        this.message = message;

    }
}
