package may17;

public class Understand_Method_Overloading {


    public static void main(String args[]) throws Exception{

        Understand_Method_Overloading obj = new Understand_Method_Overloading();
        obj.Addition();
    }

    public void Addition(int a , int b){
        System.out.println("I can add numbers .....");
    }

    public void Addition(int a , int b , int c){
        System.out.println("I can add numbers .....");
    }

    public void Addition(){
        System.out.println("I can add numbers .....");
    }

    public void Addition(String a , String b){
        System.out.println("I can add numbers .....");
    }








}
