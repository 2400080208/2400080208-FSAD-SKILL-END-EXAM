package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Payment;
import com.klef.fsad.exam.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController 
{
    @Autowired
    private PaymentService service;

    // POST → Add Payment
    @PostMapping("/add")
    public Payment addPayment(@RequestBody Payment payment)
    {
        return service.addPayment(payment);
    }

    // GET → Fetch all payments
    @GetMapping("/all")
    public List<Payment> getAllPayments()
    {
        return service.getAllPayments();
    }
}