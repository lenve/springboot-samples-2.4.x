package org.javaboy.test.service;

import org.javaboy.test.model.OauthClientDetails;
import org.javaboy.test.mapper.OauthClientDetailsMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class OauthClientDetailsService{

    @Autowired
    OauthClientDetailsMapper oauthClientDetailsMapper;
    public List<OauthClientDetails> getAllOauthClientDetailss(){
        return oauthClientDetailsMapper.getAllOauthClientDetailss();
    }
}