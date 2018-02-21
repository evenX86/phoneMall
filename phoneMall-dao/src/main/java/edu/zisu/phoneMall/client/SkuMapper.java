package edu.zisu.phoneMall.client;

import edu.zisu.phoneMall.sku.Phone;

import java.util.List;
import java.util.Map;

public interface SkuMapper {
    int insert(Phone record);

    List<Phone> querySkuList();

    Phone querySkuBySkuId(Long skuId);

    int update(Phone phone);
}
