package OOPS.Assignment2;

public class BanksInterestRate
{
    // Calling all the class that has implemented the Inheritance by creating a unique object name for all four class in this main class
    public static void main(String[] args)
    {
       BankOfEngland bos = new BankOfScotland();
       BankOfEngland ll = new Lloyds();
       BankOfEngland nat = new Natwest();
       BankOfEngland nw = new Nationwide();

        System.out.println("UK Top Major Bank Interest Compared to Bank Of England Default Rates");
        System.out.println("\nBank of Scotland Interest Rates\n"+"Home Loan: "+bos.homeLoanInterest()+"\nCar Loan: "+bos.carLoanInterest()+"\nPersonal Loan: "+bos.personalLoanInterest());
        System.out.println("\nLloyds Bank Interest Rates\n"+"Home Loan: "+ll.homeLoanInterest()+"\nCar Loan: "+ll.carLoanInterest()+"\nPersonal Loan: "+ll.personalLoanInterest());
        System.out.println("\nNatwest Bank Interest Rates\n"+"Home Loan: "+nat.homeLoanInterest()+"\nCar Loan: "+nat.carLoanInterest()+"\nPersonal Loan: "+nat.personalLoanInterest());
        System.out.println("\nNationwide Building Society Interest Rates\n"+"Home Loan: "+nw.homeLoanInterest()+"\nCar Loan: "+nw.carLoanInterest()+"\nPersonal Loan: "+nw.personalLoanInterest());
    }
}
