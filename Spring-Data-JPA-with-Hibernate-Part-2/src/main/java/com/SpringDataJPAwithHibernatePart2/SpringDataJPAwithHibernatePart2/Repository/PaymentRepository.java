package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Repository;

import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
