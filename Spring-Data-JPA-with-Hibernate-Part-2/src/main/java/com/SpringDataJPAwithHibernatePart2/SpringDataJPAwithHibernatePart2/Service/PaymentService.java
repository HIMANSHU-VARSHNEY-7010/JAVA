package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Service;

import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.Cheque;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.CreditCard;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.Payment;
import java.util.List;
public interface PaymentService {

    public Payment createPaymentByCard(CreditCard card);

    public Payment createPaymentByCheque(Cheque cheque);

    public List<Payment> findAllPayment();
}
