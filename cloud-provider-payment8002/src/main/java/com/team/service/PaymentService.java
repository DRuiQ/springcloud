package com.team.service;

import com.team.entitles.Payment;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPayment( Long id);
}
