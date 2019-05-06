package com.xd.repository;

import com.xd.bean.Shop;
import com.xd.bean.ShopRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mac on 2019/5/6.
 */
public interface ShopRecordRepository extends JpaRepository<ShopRecord,String> {

}
