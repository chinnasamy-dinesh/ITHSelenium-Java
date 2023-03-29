package OOPS.Assignment2;

public interface BankOfEngland
{
    // Interface is created with Default Interest Charges for Home, Car & Personal Loan by Bank of England
    default float homeLoanInterest()
    {
        return 6.5f;
    }

    default float carLoanInterest()
    {
        return 5.5f;
    }

    default float personalLoanInterest()
    {
        return 7.5f;
    }

}
