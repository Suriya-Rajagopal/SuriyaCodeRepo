package OverRiding;

public class Child extends Parents{
    public Child(){
    }
    public void Studies(){
        System.out.println("IprefertostudyVisualCommunication");
    }
    public static void main(String[]args){
        Parents obj=new Child();
        obj.Properties();
        obj.Studies();
    }}