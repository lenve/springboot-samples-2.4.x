package org.javaboy.test.controller;

import org.javaboy.test.model.VmallSeller;
import org.javaboy.test.service.VmallSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class VmallSellerController{

    @Autowired
    VmallSellerService vmallSellerService;

    @GetMapping("/vmallsellers")
    public List<VmallSeller> getAllVmallSellers(){
        return vmallSellerService.getAllVmallSellers();
    }
}