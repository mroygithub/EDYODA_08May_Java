package controlLoop;

public class JavaControlLoop {


    public static void main(String[] args)throws Exception{

        JavaControlLoop obj = new JavaControlLoop();
        //obj.grade_the_marks(25);
        //obj.run_1_to_100(200);
        obj.learnWhileLoop();


    }


    public void grade_the_marks(int marks){

        if(marks<30){
            System.out.println("FAIL");
        }

        if(marks>60){
            System.out.println("PASS");
        }


    }

    // This is for For loop
    public void run_1_to_100(int num){

        for(int a=1;a<=num;a++){
            System.out.println("The Current number is ==>"+a);
            System.out.println("The Current number is ==>"+a);

        }

    }

    // This is for While Loop ..

    public void learnWhileLoop(){

        int i=1,a=50;

        while (a>i){
            System.out.println("The Current number is While loop==>"+i);
            i++;
        }


    }



}


