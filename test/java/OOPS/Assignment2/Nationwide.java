package OOPS.Assignment2;

public class Nationwide implements BankOfEngland
{
    // Interface Bank of England is implemented and Nationwide Interest rate for Home, Car & Personal Loan is Set
    @Override
    public float homeLoanInterest() {
        return 6.60f;
    }

    @Override
    public float carLoanInterest() {
        return 5.60f;
    }

    @Override
    public float personalLoanInterest() {
        return 7.70f;
    }

}
