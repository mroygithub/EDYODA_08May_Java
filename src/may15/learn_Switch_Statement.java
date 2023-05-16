package may15;

public class learn_Switch_Statement {


    public  void print_The_Day(int num){

        String day=null;

        switch (num){

            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Unknown/Invalid";
                break;
        }
        System.out.println("The day is ==>"+day);
    }












}
