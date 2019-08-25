package com.lisheng.securitydemo.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseResponse {

    private int code;

    private String msg;

    private Object data;

    public static BaseResponse ok(){
        return new BaseResponse(0,"success",null);
    }

    public static BaseResponse ok(Object data){
        return new BaseResponse(0,"success",data);
    }

    public static BaseResponse nok(String msg){
        return new BaseResponse(1,msg,null);
    }

    public static BaseResponse nok(Exception e){
        return new BaseResponse(1,e.getMessage(),null);
    }

}
