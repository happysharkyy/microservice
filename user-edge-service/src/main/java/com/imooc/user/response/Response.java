package com.imooc.user.response;

import java.io.Serializable;

public class Response implements Serializable {
    public static final Response USERNAME_PASSWORD_INVALIN = new Response("1001","username or  password error");
    public static final Response MOBILE_OR_EMAIL = new Response("1002","mobile or email is required");
    public static final Response SEND_VERIFYCODE_FAILED = new Response("1003","send verify code failed");
    public static final Response SUCCESS= new Response();
    public static final Response VERIFYCODE_INVALIN = new Response("1004"," verify code error");


    private String code;
    private String message;
    public Response() {
        this.code = "0";
        this.message = "success";
    }

    public static Response exception(Exception e){
        return new Response("999",e.getMessage());
    }
    public Response(String code, String message) {
        this.code = code;
        this.message = message;
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
