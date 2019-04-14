package com.halbu.ear.helper;

public class Response {

    private String error;
    private String code;
    private String message;

    public Response(){}
    public Response(String code, String message, String error){
        this.code = code;
        this.message = message;
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}