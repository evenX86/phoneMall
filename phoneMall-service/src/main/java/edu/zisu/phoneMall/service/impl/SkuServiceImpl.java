package edu.zisu.phoneMall.service.impl;

import edu.zisu.phoneMall.client.SkuMapper;
import edu.zisu.phoneMall.service.SkuService;
import edu.zisu.phoneMall.sku.Phone;
import edu.zisu.phoneMall.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<Phone> querySkuList() {
        List<Phone> tmpResult = skuMapper.querySkuList();
        log.error("查询结果: " + JsonUtils.toString(tmpResult));
        return tmpResult;
    }
}
