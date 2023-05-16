package may16;

public class makeMyTrip extends IndigoFlight {

    public static void main(String args[]) throws Exception{

        makeMyTrip obj =  new makeMyTrip();
        //obj.TicketFareDiscount();
        System.out.println("The Actual discount ===>"+obj.getTheActualDiscount());
    }



    public  int TicketFareDiscount(){

        System.out.println("Indigo Airlines is giving .8% discount to book a ticket through MakeMyTrip");
        return 5;
    }


    public int getTheActualDiscount(){

        int actual_discount=0;

        if(TicketFareDiscount_new()>TicketFareDiscount()){
            actual_discount = TicketFareDiscount_new();
        }
        if(TicketFareDiscount()>TicketFareDiscount_new()){
            actual_discount = TicketFareDiscount();
        }
        return actual_discount;
    }
}
