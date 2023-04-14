package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Service.Impl;

import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.Cheque;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.CreditCard;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.Payment;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Repository.PaymentRepository;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public Payment createPaymentByCard(CreditCard card)
    {
        return paymentRepository.save(card);
    }

    public Payment createPaymentByCheque(Cheque cheque)
    {
        return paymentRepository.save(cheque);
    }

    public List<Payment> findAllPayment()
    {
        return (List<Payment>) paymentRepository.findAll();
    }
}
