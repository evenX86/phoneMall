package edu.zisu.phoneMall.service;

import edu.zisu.phoneMall.sku.Phone;

import java.util.List;

public interface SkuService {
    public Boolean insertSku(Phone phone);

    public List<Phone> querySkuList();

}
