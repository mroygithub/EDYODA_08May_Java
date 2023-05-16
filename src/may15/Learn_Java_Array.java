package may15;

public class Learn_Java_Array {


    String StudentName="Raj";
    int Roll=1;
    String[] studentsName;
    int age[];

    String StudentSet = "Ravi:1,Ram:2,Vikash:3,Sam:4,Tina:5";

    // If student name is XX then his/her roll is yy

    // An array is a collection of similar type of Data ....


    //How to declare an array ?

    // dataType[] arrayName;
    // dataType arrayName[];

    // String[] studentName;
    // String studentName[];



    public static void main(String[] args) throws Exception{


        Learn_Java_Array obj = new Learn_Java_Array();
        //obj.learning_an_Array(54);
        obj.get_The_Student_Name_With_Roll();


    }

    public void learning_an_Array(int student_index){

         studentsName  = new String[100];
         // initialize an array ..
        for(int i=0;i<100;i++){
            studentsName[i]="Student"+"_"+i;
        }
        System.out.println("The Student Name of Index"+ student_index+"===>"+studentsName[student_index]);
    }

    public void get_The_Student_Name_With_Roll(){

        String[] StudentSetByComma = StudentSet.split(",");

        for(int a=0;a<StudentSetByComma.length;a++) {
            //System.out.println(StudentSetByComma[a]);
            String[] student_Roll = StudentSetByComma[a].split(":");
            System.out.println("If Student name is" + " " + student_Roll[0] + " " + "Then his/her Roll no is ==>" + student_Roll[1]);
        }
    }


    public void get_The_Student_Age(){

        age = new int[5];
        age[0]=17;
        age[1]=15;
        age[2]=14;
        age[3]=20;
        age[4]=11;

    }


















}
