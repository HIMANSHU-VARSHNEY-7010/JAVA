package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity;

import jakarta.persistence.Embeddable;
//      Component Mapping:
//      Implement and demonstrate Embedded mapping using employee table having the following fields: id, firstName,
//       lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.
@Embeddable
public class Salary {
    public long basicSalary;
    public long bonusSalary;
    public long taxAmount;
    public long specialAllowanceSalary;


    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public long getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(long bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public long getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(long taxAmount) {
        this.taxAmount = taxAmount;
    }

    public long getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(long specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }


}
