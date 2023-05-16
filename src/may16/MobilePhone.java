package may16;

public abstract class MobilePhone {

    //We use abstract keyword to create abstract class/method
    // We can't create an object of abstract class
    // Abstract class can have both abstract and non abstract method
    // ***************

    // This is abstract method ...
    public abstract void mobile_vibration();

    //public abstract void iPhone_15_feature1();
   // public abstract void iPhone_15_feature2();
   // public abstract void iPhone_15_feature3();


    // A non abstract method ...

    public void mobile_company(){
        System.out.println("The Mobile Company Name is Samsung ...");
    }
}
