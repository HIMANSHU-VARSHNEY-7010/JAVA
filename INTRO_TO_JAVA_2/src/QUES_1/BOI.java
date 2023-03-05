package QUES_1;
class BOI extends Bank{
    public BOI(){
    }
    public BOI(String name, String headOfficeAddress, String chairmanName, int branchCount,
               int personalLoanInterestRate, int homeLoanInterestRate) {
        super(name, headOfficeAddress, chairmanName, branchCount, personalLoanInterestRate, homeLoanInterestRate);
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

    public void setHomeLoanInterestRate(int homeLoanInterestRate){
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
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
