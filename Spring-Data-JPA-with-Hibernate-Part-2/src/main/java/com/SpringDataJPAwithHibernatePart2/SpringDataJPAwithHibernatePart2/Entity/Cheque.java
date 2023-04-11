package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity;

import jakarta.persistence.*;

@Entity
//@PrimaryKeyJoinColumn(name="payment_id")  // JOINED
//@DiscriminatorValue(value = "Cheque")   // SINGLE_TABLE
public class Cheque extends Payment{
    @Column(name="cheque_number")
    private long chequeNumber;

    public Cheque(){
    }
    public Cheque(long chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public long getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(long chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "chequeNumber=" + chequeNumber +
                '}';
    }
}

