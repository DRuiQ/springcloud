package com.team.service;

import com.team.entitles.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPayment( Long id);
}
