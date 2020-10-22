package com.journals.gsrj.model;

public class ContactResponse {

    /**
     * status : true
     * message : Thank you for your Contact We Will Contact Soon...
     */

    private boolean status;
    private String message;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
