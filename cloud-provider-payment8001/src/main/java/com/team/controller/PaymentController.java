package com.team.controller;

import com.netflix.discovery.DiscoveryClient;
import com.team.entitles.CommonResult;
import com.team.entitles.Payment;
import com.team.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Set;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
//    @Resource
//    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        log.info("********插入结果是"+i);
        if (i>0){
            return new CommonResult(200,"插入数据库成功",i);
        }else {
            return new CommonResult(404,"插入数据库失败",null);
        }

    }
    @GetMapping(value ="/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id")Long id){
        Payment payment = paymentService.getPayment(id);
        log.info("********查询结果是"+payment);
        if (payment!=null){
            return new CommonResult(200,"查询成功",payment+"1");
        }else {
            return new CommonResult(404,"没有查询到编号为"+id+"的用户",null);
        }
    }
    @GetMapping("/payment/zipkin")
    public String paymentZipkin()
    {
       return "aaaaaaaaaa";
    }
//    @GetMapping(value = "/payment/discoveryClient")
//    public Object discoveryClient(){
//        Set<String> allKnownRegions = discoveryClient.getAllKnownRegions();
//        for (String a: allKnownRegions){
//            log.info(a);
//        }
//    }

}
