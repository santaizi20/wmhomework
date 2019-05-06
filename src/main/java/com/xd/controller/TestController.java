package com.xd.controller;

import com.xd.Util.RandomNumUtil;
import com.xd.bean.Shop;
import com.xd.bean.ShopRecord;
import com.xd.enumeration.MsgEnum;
import com.xd.exception.NullException;
import com.xd.repository.ShopRecordRepository;
import com.xd.repository.ShopRepository;
import com.xd.vo.ResultVo;
import com.xd.vo.ShopOrderVo;
import com.xd.vo.ShopRecordListVo;
import com.xd.vo.ShopVo;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 2019/5/6.
 */

@RestController
public class TestController {
    @Autowired
    ShopRepository shopRepository;
    @Autowired
    ShopRecordRepository shopRecordRepository;

    @RequestMapping("aaa")
    public String test1() {
        return "hello";
    }

    @RequestMapping("exe")
    public void test4() {
        throw new NullException("1");
    }

    @RequestMapping("bbb")
    public ShopVo test2() {
        ShopVo shopVo = new ShopVo();
        ShopRecordListVo shopRecordListVo = new ShopRecordListVo();
        List<ShopRecordListVo> ls = new ArrayList<>();
        ls.add(shopRecordListVo);
        shopVo.setShopRecordList(ls);
        return shopVo;
    }



    @RequestMapping("ccc")
    public ResultVo test3(@RequestBody ShopVo shopVo) {
        ResultVo resultVo = new ResultVo();
        ShopOrderVo shopOrderVo = new ShopOrderVo();
        Shop shop = new Shop();
        BeanUtils.copyProperties(shopVo, shop);
        if (shopVo.getShopOrderName().isEmpty()){
            throw new NullException(String.valueOf(shop.getId()));
        }
        List<ShopRecordListVo> ls = shopVo.getShopRecordList();
        for (ShopRecordListVo shopRecordListVo : ls) {
            ShopRecord shopRecord = new ShopRecord();
            BeanUtils.copyProperties(shopRecordListVo, shopRecord);
            shopRecordRepository.save(shopRecord);
        }
        shopRepository.save(shop);
        resultVo.initresultVo(resultVo);
        resultVo.setMsg(MsgEnum.成功.toString());
        shopOrderVo.setShopOrderId(String.valueOf(RandomNumUtil.random()));
        resultVo.setBody(shopOrderVo);
        return resultVo;
    }
}
