package may12;

public class Class_A_Test001 {

    private String accountNumber = null;

    // Java Constructor .....

    // Create a Contructor ...


    public Class_A_Test001(){

        System.out.println("***********************");
    }


    // This is a main function ...

    public static void main(String args[]) throws Exception{



        Class_A_Test001 objA =new Class_A_Test001();

        objA.accountNumber = objA.BankApplicationAccountNumber();

        Class_B_Test002 objB = new Class_B_Test002(objA.accountNumber);
        System.out.println("The Global Account Number To Use ==>"+objB.bankAccountNumber);

        objB.homeLoan();
        objB.BankDetails();
        objB.CarLoan();
    }

    // Create a simple method ...

    public void printTodaysDate(){
        System.out.println("Todays Date is ==> 12-05-2023");
    }

    public String BankApplicationAccountNumber(){
        return "A001BZ10";
    }













}
