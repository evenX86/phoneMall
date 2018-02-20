package edu.zisu.phoneMall.client.impl;

import edu.zisu.phoneMall.client.SkuMapper;
import edu.zisu.phoneMall.client.SkuService;
import edu.zisu.phoneMall.sku.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkuServiceImpl implements SkuService{
    private static final Logger log = LoggerFactory.getLogger(SkuServiceImpl.class);

    @Autowired
    private SkuMapper skuMapper;

    @Override
    public Boolean insertSku(Phone phone) {
        int i = skuMapper.insert(phone);
        log.error("插入数据库返回值: " + i);
        return true;
    }
}
