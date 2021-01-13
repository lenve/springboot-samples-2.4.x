package org.javaboy.test.mapper;

import org.javaboy.test.model.AppCategories;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AppCategoriesMapper{
    List<AppCategories> getAllAppCategoriess();
}