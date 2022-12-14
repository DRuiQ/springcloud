package com.team.Filter;

import javafx.scene.chart.PieChart;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

//@Component
@Slf4j
public class MyLogGateWayFilter  {   //implements GlobalFilter, Ordered
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        log.info("*********come in MyLogGateWayFilter:"+new Date());
//        String uname = exchange.getRequest().getQueryParams().getFirst("username");//获取参数
//        if(uname==null){
//            log.info("*****用户名为Null 非法用户,(┬＿┬)");
//            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);//如果是空就报错
//            return exchange.getResponse().setComplete();
//        }
//
//            return chain.filter(exchange);
//    }
//
//    @Override
//    public int getOrder() {
//        return 0;
//    }
}
