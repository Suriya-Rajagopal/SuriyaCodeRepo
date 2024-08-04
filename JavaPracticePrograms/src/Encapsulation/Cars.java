package Encapsulation;

public abstract class Cars {

            //Class should have an implemented Method and it should be declared abstract
            //if a class has abstract method then itself should be declared as abstract
            //Abstract class may or may not implementation methods other than abstract methods
            //object(instiatio) cannot be created for Abstract class


    //Mandatory Specifications of a car
    public abstract void enginesecret();
    public abstract void CompanyVault();



    public void Specification()
    {
        System.out.println("Car Specifications are mentioned here");
    }

    public static void main(String[] args)
    {
        //Uncomment this and Check this validation
       // Cars ca= new Cars();
    }






}
