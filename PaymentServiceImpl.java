package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Payment;
import com.klef.fsad.exam.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService 
{
    @Autowired
    private PaymentRepository repo;

    @Override
    public Payment addPayment(Payment payment) 
    {
        if(payment.getPaymentId() == 0)
        {
            throw new RuntimeException("Payment ID must not be null");
        }
        return repo.save(payment);
    }

    @Override
    public List<Payment> getAllPayments() 
    {
        return repo.findAll();
    }
}