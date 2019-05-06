package com.xd.bean;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by mac on 2019/5/6.
 */
@Entity
@DynamicUpdate
@Data
public class Shop {

    @Id
    @GeneratedValue
    private int id;

    private String shopOrderCode;
    private String shopOrderRemarks;
    private String shopOrderUser;
    private String shopOrderTotalprice;
    private String shopOrderStatus;
    private String shopOrderName;
    private String shopOrderCompanyid;
    private String shopOrderUserCard;


}
