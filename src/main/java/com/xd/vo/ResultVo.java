package com.xd.vo;

import com.xd.enumeration.MsgEnum;
import lombok.Data;

/**
 * Created by mac on 2019/5/6.
 */
@Data
public class ResultVo<T> {

    private boolean success;
    private String errorCode;
    private String msg;
    private T body;

    public static void initresultVo(ResultVo resultVo) {
        resultVo.setSuccess(true);
        resultVo.setErrorCode("-1");

        resultVo.setMsg(MsgEnum.失败.toString());
    }
}
