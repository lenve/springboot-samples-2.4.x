package org.javaboy.test.controller;

import org.javaboy.test.model.AppTabs;
import org.javaboy.test.service.AppTabsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class AppTabsController{

    @Autowired
    AppTabsService appTabsService;

    @GetMapping("/apptabss")
    public List<AppTabs> getAllAppTabss(){
        return appTabsService.getAllAppTabss();
    }
}