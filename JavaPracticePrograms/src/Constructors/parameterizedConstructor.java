package Constructors;
public  class  parameterizedConstructor{
    String Fruit_Name;
    String Fruit_Colour;
    parameterizedConstructor(String name,String colour){
        this.Fruit_Name=name;
        this.Fruit_Colour=colour;
        System.out.println("FruitName:"+this.Fruit_Name+"FruitColour:"+this.Fruit_Colour);
    }
    public void sayaboutFruits(){
        System.out.println("FruitName:"+this.Fruit_Name+"FruitColour:"+this.Fruit_Colour);
    }
    public static void main(String[]args){
        parameterizedConstructor pc1=new parameterizedConstructor("Apple","Red");
        pc1.sayaboutFruits();
        parameterizedConstructor pc2=new parameterizedConstructor("Grapes","Green");
        pc2.sayaboutFruits();
    }}
