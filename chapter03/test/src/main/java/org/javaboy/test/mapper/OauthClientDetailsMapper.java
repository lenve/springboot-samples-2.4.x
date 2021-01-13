package org.javaboy.test.mapper;

import org.javaboy.test.model.OauthClientDetails;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface OauthClientDetailsMapper{
    List<OauthClientDetails> getAllOauthClientDetailss();
}