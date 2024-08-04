package Encapsulation;
import java. lang. annotation. Annotation;
public class BMW extends Cars implements ExampleInterface,ExampleInterface3{

    @Override
    public void enginesecret()
    {
        System.out.println("BMW Car's engine secret");

    }
    @Override
            public void CompanyVault()
    {
        System.out.println("BMW Car's CompanyVault");

    }

    public static void main(String[] args){


        Cars cr = new BMW();
        //ParentAbstractClass obj= new ChildClass(Which extends ParentAbstractClass)
        cr.enginesecret();
        cr.CompanyVault();
        cr.Specification(); //Non Abstract Method from Abstract Parent Class


    }

    //Implemented By Interface
    @Override
    public void employeedetails()
    {
        System.out.println("Generate Employee details report" );
    }



}
