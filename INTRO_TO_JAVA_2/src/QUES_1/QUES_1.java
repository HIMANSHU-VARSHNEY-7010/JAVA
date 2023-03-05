package QUES_1;
//     Q1 Implement a banking system using java. Create 3 sub class of Bank : SBI,BOI,ICICI
//        Classes should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate,
//        personalLoanInterestRate, homeLoanInterestRate.
//        All 3 should have following methods:
//        add getters and setters for the fields
//        print details of every bank (override toString)

import java.util.Scanner;

public class QUES_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        SBI detailsSBI = new SBI("SBI", "Delhi", "Dinesh Kumar",
                25, 24, 9);
        System.out.println("Bank Details stored by Constructor :-");
        System.out.println(detailsSBI);
        System.out.println("Enter the Bank name(BOI, ICICI Bank, BOI): ");
        String BankName = scn.nextLine();
//        Name, headOfficeAddress, chairmanName, branchCount, fdInterestRate,
//        personalLoanInterestRate, homeLoanInterestRate.
        switch (BankName) {
            case "SBI":
                SBI bankDetailsSBI = new SBI();

                bankDetailsSBI.setName(BankName);
                System.out.println("Enter the Head Office Name: ");
                bankDetailsSBI.setHeadOfficeAddress(scn.nextLine());
                System.out.println("Enter the ChairName: ");
                bankDetailsSBI.setChairmanName(scn.nextLine());
                System.out.println("Enter the Branch Count: ");
                bankDetailsSBI.setBranchCount(scn.nextInt());
                System.out.println("Enter the Personal Loan Interest: ");
                bankDetailsSBI.setPersonalLoanInterestRate(scn.nextInt());
                System.out.println("Enter the Home Loan Interest Rate: ");
                bankDetailsSBI.setHomeLoanInterestRate(scn.nextInt());
                System.out.println(bankDetailsSBI);
                break;
            case "BOI":
                BOI bankDetailsBOI = new BOI();

                bankDetailsBOI.setName(BankName);
                System.out.println("Enter the Head Office Name: ");
                bankDetailsBOI.setHeadOfficeAddress(scn.nextLine());
                System.out.println("Enter the ChairName: ");
                bankDetailsBOI.setChairmanName(scn.nextLine());
                System.out.println("Enter the Branch Count: ");
                bankDetailsBOI.setBranchCount(scn.nextInt());
                System.out.println("Enter the Personal Loan Interest: ");
                bankDetailsBOI.setPersonalLoanInterestRate(scn.nextInt());
                System.out.println("Enter the Home Loan Interest Rate: ");
                bankDetailsBOI.setHomeLoanInterestRate(scn.nextInt());
                System.out.println(bankDetailsBOI);
                break;
            case "ICICI Bank":
                ICICI bankDetailsICICI = new ICICI();

                bankDetailsICICI.setName(BankName);
                System.out.println("Enter the Head Office Name: ");
                bankDetailsICICI.setHeadOfficeAddress(scn.nextLine());
                System.out.println("Enter the ChairName: ");
                bankDetailsICICI.setChairmanName(scn.nextLine());
                System.out.println("Enter the Branch Count: ");
                bankDetailsICICI.setBranchCount(scn.nextInt());
                System.out.println("Enter the Personal Loan Interest: ");
                bankDetailsICICI.setPersonalLoanInterestRate(scn.nextInt());
                System.out.println("Enter the Home Loan Interest Rate: ");
                bankDetailsICICI.setHomeLoanInterestRate(scn.nextInt());
                System.out.println(bankDetailsICICI);
                break;
            default:
                System.out.println("Enter a valid option.");
                break;
        }
    }
}