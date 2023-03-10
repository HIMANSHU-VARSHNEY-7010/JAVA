package QUES_1;
//        Classes should have attributes like Name, headOfficeAddress, chairmanName, branchCount, fdInterestRate,
//        personalLoanInterestRate, homeLoanInterestRate.
//        All 3 should have following methods:
abstract class Bank {

    public String name ;
    public String headOfficeAddress ;
    public String chairmanName ;
    public int branchCount ;
    public int personalLoanInterestRate ;
    public int homeLoanInterestRate;

    public Bank() {
    }
    public Bank(String name, String headOfficeAddress, String chairmanName, int branchCount,
                int personalLoanInterestRate, int homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    public String getName() {
        return name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public int getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public int getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public void setPersonalLoanInterestRate(int personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(int homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    public String toString() {
        return "Details of Bank:- " +
                "Name='" + name + '\'' +
                "; Head Office Address='" + headOfficeAddress + '\'' +
                "; Chairman Name='" + chairmanName + '\'' +
                "; Branch Count=" + branchCount +
                ";\nPersonal Loan Interest Rate=" + personalLoanInterestRate +
                "; Home Loan Interest Rate=" + homeLoanInterestRate ;
    }
}