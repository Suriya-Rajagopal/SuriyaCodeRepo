package Constructors;

public class Constructor_Overloading{
    String  Friutname;
    String FriutColour;
    Constructor_Overloading(){
        System.out.println("DisplayFruitNameandColour");
    }

    Constructor_Overloading(String name,String colour){
        this.Friutname=name;
        this.FriutColour=colour;
        System.out.println("Friutnameis"+this.Friutname);
        System.out.println("Friutcolouris"+this.FriutColour);
    }
    public static void main(String[]args){
        new Constructor_Overloading();
        new Constructor_Overloading("Apple","Red");
    }
}