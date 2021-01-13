package org.javaboy.test.controller;

import org.javaboy.test.model.BbtMemberInfo;
import org.javaboy.test.service.BbtMemberInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class BbtMemberInfoController{

    @Autowired
    BbtMemberInfoService bbtMemberInfoService;

    @GetMapping("/bbtmemberinfos")
    public List<BbtMemberInfo> getAllBbtMemberInfos(){
        return bbtMemberInfoService.getAllBbtMemberInfos();
    }
}