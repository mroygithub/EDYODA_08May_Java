package may16;

public class goibibo extends IndigoFlight {


    public static void main(String args[]) throws Exception{

        goibibo obj =  new goibibo();
        obj.TicketFareDiscount();
    }



    public  int TicketFareDiscount(){

        System.out.println("Indigo Airlines is giving 1% discount to book a ticket through Goibibo");
        return 1;
    }
}
