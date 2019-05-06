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
public class ShopRecord {

    @Id
    @GeneratedValue
    private int id;

    private String shopRecordSparesId;
    private String shopRecordPrice;
    private String shopRecordNumber;
    private String shopRecordUnit;
    private String shopRecordDiscount;
    private String mealId;
    private String shopRecordActualprice;


}
