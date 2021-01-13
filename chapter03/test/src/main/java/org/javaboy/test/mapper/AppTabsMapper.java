package org.javaboy.test.mapper;

import org.javaboy.test.model.AppTabs;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AppTabsMapper{
    List<AppTabs> getAllAppTabss();
}