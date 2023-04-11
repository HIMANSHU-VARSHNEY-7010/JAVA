package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Controller;

import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.Cheque;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.CreditCard;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.Payment;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @GetMapping("/payment")
    public List<Payment> getPaymentDetails()
    {
        return paymentService.findAllPayment();
    }

    @PostMapping("/payment/card")
    public Payment CreatePaymentUsingCreditCard(@RequestBody CreditCard creditCard)
    {
        return paymentService.createPaymentByCard(creditCard);
    }

    @PostMapping("/payment/cheque")
    public Payment CreatePaymentUsingCheque(@RequestBody Cheque cheque)
    {
        return paymentService.createPaymentByCheque(cheque);
    }
}
