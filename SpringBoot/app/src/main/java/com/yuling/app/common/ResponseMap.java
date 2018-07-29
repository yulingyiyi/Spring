package com.yuling.app.common;

import java.util.HashMap;
import java.util.Map;

public class ResponseMap  {

    private int code = 200;
    private String message = "";
    private Map<String,Object> data = new HashMap<>();

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Map<String, Object> getData() {
        return data;
    }

}
