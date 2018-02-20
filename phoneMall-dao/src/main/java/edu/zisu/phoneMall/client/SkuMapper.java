package edu.zisu.phoneMall.client;

import edu.zisu.phoneMall.sku.Phone;

import java.util.List;

public interface SkuMapper {
    int insert(Phone record);

    List<Phone> querySkuList();
}
