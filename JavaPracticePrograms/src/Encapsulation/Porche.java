package Encapsulation;

public class Porche extends Cars implements ExampleInterface{

    @Override
    public void enginesecret()
    {
        System.out.println("Porche Car's engine secret");

    }

    //UnImplemented Abstract Class
    //@Override
    //public void CompanyVault()
    //{
    // System.out.println("Porche Car's CompanyVault");
    //}


    public static void main(String[] args) {
        Cars cs = new Porche();
        cs.enginesecret();
        cs.CompanyVault();


        //Calling a Interface in the main Method
        ExampleInterface EI = new Porche();
        //InterfaceName obj = new ChildClass(which implements the Interface)
        EI.employeedetails();
    }
    //If Child has any unimplemented methods in
    @Override
    public void CompanyVault()
    {System.out.println("Porche Car's CompanyVault");
    }

    @Override
    public void employeedetails()

    {

        System.out.println("Generate Employee details Report");
    }







    }

