package com.example.sample.model;

public class Response {

    private Breed message;
    private String status;

    public Breed getMessage() {
        return message;
    }

    public void setMessage(Breed message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
