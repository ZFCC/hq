package com.huaqi.web.service.impl;

import com.huaqi.base.entity.BmPosition;
import com.huaqi.base.service.BmPositionService;
import com.huaqi.web.dao.BmPositionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bmPositionService")
public class BmPositionServiceImpl implements BmPositionService {

    @Autowired
    private BmPositionMapper bmPositionMapper;

    @Override
    public BmPosition getPositionByCode(String code) {
        BmPosition bmPosition = bmPositionMapper.selectByPrimaryKey(Integer.valueOf(code));
        return bmPosition;
    }
}
