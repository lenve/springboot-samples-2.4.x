package org.javaboy.test.service;

import org.javaboy.test.model.VmallSeller;
import org.javaboy.test.mapper.VmallSellerMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class VmallSellerService{

    @Autowired
    VmallSellerMapper vmallSellerMapper;
    public List<VmallSeller> getAllVmallSellers(){
        return vmallSellerMapper.getAllVmallSellers();
    }
}