package Constructors;

public class Default_Constructor {
    String  name;
    int rollNumber;
    Integer age;
    public Default_Constructor(){
    }
    public static void main(String[]args){
        Default_Constructor dc=new Default_Constructor();
        System.out.println(dc.name);
        System.out.println(dc.rollNumber);
        System.out.println(dc.age);
    }
}

