package com.klef.fsad.exam.service;

import java.util.List;
import com.klef.fsad.exam.model.Payment;

public interface PaymentService 
{
    Payment addPayment(Payment payment);
    List<Payment> getAllPayments();
}