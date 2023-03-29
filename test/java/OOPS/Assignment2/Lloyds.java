package OOPS.Assignment2;

public class Lloyds implements BankOfEngland
{
    // Interface Bank of England is implemented and Lloyds Interest rate for Home, Car & Personal Loan is Set
    @Override
    public float homeLoanInterest() {
        return 7.5f;
    }

    @Override
    public float carLoanInterest() {
        return 6.5f;
    }

    @Override
    public float personalLoanInterest() {
        return 8.75f;
    }

}
