package org.javaboy.test.service;

import org.javaboy.test.model.AppTabs;
import org.javaboy.test.mapper.AppTabsMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class AppTabsService{

    @Autowired
    AppTabsMapper appTabsMapper;
    public List<AppTabs> getAllAppTabss(){
        return appTabsMapper.getAllAppTabss();
    }
}