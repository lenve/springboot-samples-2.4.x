package org.javaboy.test.mapper;

import org.javaboy.test.model.VmallSeller;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface VmallSellerMapper{
    List<VmallSeller> getAllVmallSellers();
}