package org.javaboy.test.service;

import org.javaboy.test.model.AppCategories;
import org.javaboy.test.mapper.AppCategoriesMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class AppCategoriesService{

    @Autowired
    AppCategoriesMapper appCategoriesMapper;
    public List<AppCategories> getAllAppCategoriess(){
        return appCategoriesMapper.getAllAppCategoriess();
    }
}