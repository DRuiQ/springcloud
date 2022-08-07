package com.team.dao;

import com.team.entitles.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    public int create(Payment payment);
    public Payment getPayment(@Param("id") Long id);

}
