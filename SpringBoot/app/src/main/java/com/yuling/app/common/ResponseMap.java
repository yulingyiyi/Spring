package com.yuling.app.common;

import java.util.HashMap;
import java.util.Map;

public class ResponseMap  {

    private int status = 200;
    private String msg = "";
    private Map<String,Object> data = new HashMap<>();


    public void setStatus(int status) {
        this.status = status;
    }


    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getStatus() {
        return status;
    }
    public Map<String, Object> getData() {
        return data;
    }

    public void setResponse(String key,Object object){
        if ( key.isEmpty() || object == null){
            return;
        }
        this.getData().put(key,object);
    }



}
