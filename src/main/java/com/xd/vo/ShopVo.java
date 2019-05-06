package com.xd.vo;

import com.oracle.webservices.internal.api.message.PropertySet;
import com.xd.bean.ShopRecord;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by mac on 2019/5/6.
 */

@Data
public class ShopVo {

    private String shopOrderCode;
    private String shopOrderRemarks;
    private String shopOrderUser;
    private String shopOrderTotalprice;
    private String shopOrderStatus;
    private String shopOrderName;
    private String shopOrderCompanyid;
    private List<ShopRecordListVo> shopRecordList;
    private String shopOrderUserCard;
}
