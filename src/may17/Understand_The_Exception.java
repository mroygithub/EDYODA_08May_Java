package may17;

public class Understand_The_Exception {


    public static void main(String args[]){

        Understand_The_Exception obj = new Understand_The_Exception();
        //obj.Exception_Example_1();
        obj.Eligible_For_Paragliding(35);

    }

    public void Exception_Example_1(){

        boolean calculation = false;

        try {
            int x = 6;
            int y = 2;
            int z = x / y;
            System.out.println("The value of Z is ==>" + z);
            calculation = true;

        }
        catch(Exception e){
            System.out.println("There is Issue in Calculation , error is ==>"+e);
        }
        finally {
            System.out.println("This Block will always execute ...final block");
        }

        Exception_Example_2();
    }
    public void Exception_Example_2(){
        System.out.println("Hi!  ,This is Exception_Example_2");
    }

    public void Eligible_For_Paragliding(int age){

        if(age<25 || age >40){
            throw new RuntimeException("You are not Eligible for Paragliding");
        }
        else{
            System.out.println("Hurrey! ... You are Eligible ....");
        }
    }



}
