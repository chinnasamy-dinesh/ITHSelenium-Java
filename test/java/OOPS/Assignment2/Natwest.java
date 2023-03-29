package OOPS.Assignment2;

public class Natwest implements BankOfEngland
{
    // Interface Bank of England is implemented and Natwest Interest rate for Home, Car & Personal Loan is Set
    @Override
    public float homeLoanInterest() {
        return 7.0f;
    }

    @Override
    public float carLoanInterest() {
        return 6.0f;
    }

    @Override
    public float personalLoanInterest() {
        return 7.75f;
    }

}
