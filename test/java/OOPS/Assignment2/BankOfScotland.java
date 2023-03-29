package OOPS.Assignment2;

public class BankOfScotland implements BankOfEngland
{
    // Interface Bank of England is implemented and Bank of Scotland Interest rate for Home, Car & Personal Loan is Set
    @Override
    public float homeLoanInterest() {
        return 6.75f;
    }

    @Override
    public float carLoanInterest() {
        return 5.80f;
    }

    @Override
    public float personalLoanInterest() {
        return 7.60f;
    }

}
