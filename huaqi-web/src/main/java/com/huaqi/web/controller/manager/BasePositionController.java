package com.huaqi.web.controller.manager;

import com.huaqi.base.entity.BmPosition;
import com.huaqi.base.service.BmPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/position")
public class BasePositionController {

    @Autowired
    BmPositionService bmPositionService;

    @RequestMapping("/getById")
    @ResponseBody
    public String getById(String code){
        BmPosition positionByCode = bmPositionService.getPositionByCode(code);
        return positionByCode == null ? "null" : positionByCode.getName();
    }

}
