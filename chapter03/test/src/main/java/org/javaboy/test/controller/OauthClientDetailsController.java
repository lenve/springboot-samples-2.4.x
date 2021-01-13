package org.javaboy.test.controller;

import org.javaboy.test.model.OauthClientDetails;
import org.javaboy.test.service.OauthClientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class OauthClientDetailsController{

    @Autowired
    OauthClientDetailsService oauthClientDetailsService;

    @GetMapping("/oauthclientdetailss")
    public List<OauthClientDetails> getAllOauthClientDetailss(){
        return oauthClientDetailsService.getAllOauthClientDetailss();
    }
}