package may18;


import java.util.ArrayList;

public class learn_ArrayList {

    public static void main(String args[]) throws Exception{

        learn_ArrayList obj = new learn_ArrayList();
        obj.learn_ArrayList();
    }
    public void learn_ArrayList(){


        ArrayList<Integer> EmpId = new ArrayList<Integer>();

        // Adding data into the ArrayList ...
        EmpId.add(123);
        EmpId.add(124);
        EmpId.add(125);
        EmpId.add(126);
        EmpId.add(127);

        System.out.println("Print EmpId ==>"+EmpId.get(3));

        EmpId.add(301);
        EmpId.add(555);

        System.out.println("Print EmpId ==>"+EmpId.get(5));

        // Remove Data From an ArrayList ..

        System.out.println("Print EmpId of position 0 is==>"+EmpId.get(0));
        EmpId.remove(0);
        System.out.println("Print EmpId of position 0 is ==>"+EmpId.get(0));

        // Replacing / Reset Data ...

        EmpId.set(3 , 521);

        System.out.println("Print EmpId ==>"+EmpId.get(3));

        // Print ArrayList one by one ..

        System.out.println("************************************");

        for(int a :EmpId){
            System.out.println("Print EmpId ==>"+a);
        }

        System.out.println("##############################");


        for (int i = 0; i < EmpId.size(); i++) {
            System.out.println(EmpId.get(i));
        }




    }










}
