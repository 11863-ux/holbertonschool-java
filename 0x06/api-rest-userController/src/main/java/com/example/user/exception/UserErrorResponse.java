package com.example.user.exception;

public class UserErrorResponse {
    int status;
    String message;

    public UserErrorResponse(){}

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public UserErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
