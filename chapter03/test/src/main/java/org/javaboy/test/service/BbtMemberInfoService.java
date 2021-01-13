package org.javaboy.test.service;

import org.javaboy.test.model.BbtMemberInfo;
import org.javaboy.test.mapper.BbtMemberInfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class BbtMemberInfoService{

    @Autowired
    BbtMemberInfoMapper bbtMemberInfoMapper;
    public List<BbtMemberInfo> getAllBbtMemberInfos(){
        return bbtMemberInfoMapper.getAllBbtMemberInfos();
    }
}