package QUES_1;//) Implement a banking system using java. Create 3 sub class of Bank : SBI,BOI,ICICI
//        Classes should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate,
//        personalLoanInterestRate, homeLoanInterestRate.
//        All 3 should have following methods:
//
//        add getters and setters for the fields
//        print details of every bank (override toString)
//
//        2) WAP showing try, multi-catch and finally blocks.
//
//        3) WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
//
//        4) Create a custom exception that do not have any stack trace.


import java.util.Scanner;

public class QUES_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;

//        Name, headOfficeAddress, chairmanName, branchCount, fdInterestRate,
//        personalLoanInterestRate, homeLoanInterestRate.

        SBI b = new SBI();

        System.out.println("Enter the Bank name: ");
        b.setName(scn.nextLine());
        System.out.println("Enter the Head Office Name: ");
        b.setHeadOfficeAddress(scn.nextLine());
        System.out.println("Enter the ChairName: ");
        b.setChairmanName(scn.nextLine());
        System.out.println("Enter the Branch Count: ");
        b.setBranchCount(scn.nextInt());
        System.out.println("Enter the Personal Loan Interest: ");
        b.setPersonalLoanInterestRate(scn.nextInt());
        System.out.println("Enter the Home Loan Interest Rate: ");
        b.setHomeLoanInterestRate(scn.nextInt());

        System.out.println(b);
    }
}