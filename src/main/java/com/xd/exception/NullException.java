package com.xd.exception;

import lombok.Data;

/**
 * Created by mac on 2019/5/6.
 */

@Data
public class NullException extends RuntimeException{
    private String id;

    public NullException(String id){
        super("您没有插入信息");
        this.id = id;
    }
}
