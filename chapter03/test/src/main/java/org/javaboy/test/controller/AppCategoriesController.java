package org.javaboy.test.controller;

import org.javaboy.test.model.AppCategories;
import org.javaboy.test.service.AppCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class AppCategoriesController{

    @Autowired
    AppCategoriesService appCategoriesService;

    @GetMapping("/appcategoriess")
    public List<AppCategories> getAllAppCategoriess(){
        return appCategoriesService.getAllAppCategoriess();
    }
}