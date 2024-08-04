package Constructors;

public class NoArgumentConstructors{

    NoArgumentConstructors(){
        String StudentName="Rajesh";
        Integer age=27;
        int rollno=67;
        System.out.println("Name:"+StudentName+"Age:"+age+"Rollno:"+rollno);
    }
    public static void main(String[]args){
        new NoArgumentConstructors();

    }}
