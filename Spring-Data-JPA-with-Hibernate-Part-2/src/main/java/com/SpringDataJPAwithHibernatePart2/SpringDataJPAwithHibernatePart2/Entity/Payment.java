package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity;

import jakarta.persistence.*;
//      Inheritance Mapping:
//          Implement and demonstrate Single Table strategy.
//          Implement and demonstrate Joined strategy.
//          Implement and demonstrate Table Per Class strategy.
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "payment_mode",discriminatorType = DiscriminatorType.STRING)  // SINGLE_TABLE
public class Payment {
    @Id
    @Column(name="payment_id")
    private int paymentId;
    private double amount;
    public Payment() {
    }
    public Payment(int id, double amount) {
        this.paymentId = id;
        this.amount = amount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + paymentId +
                ", amount=" + amount +
                '}';
    }
}
