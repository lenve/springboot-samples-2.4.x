package org.javaboy.test.mapper;

import org.javaboy.test.model.BbtMemberInfo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BbtMemberInfoMapper{
    List<BbtMemberInfo> getAllBbtMemberInfos();
}