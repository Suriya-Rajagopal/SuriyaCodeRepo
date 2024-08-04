package SamplePrograms;

public class ReturnTypesExample {
    Integer amount=10000;
    public ReturnTypesExample(){
    }
    public void getTheAmount(){
        System.out.println("GivenAmount"+this.amount);
    }
    public Integer getTheactualAmount(){
        return this.amount;
    }
    public static void main(String[]args){
        ReturnTypesExample amt=new ReturnTypesExample();
        amt.getTheAmount();
        Integer ColletedAmount =amt.getTheactualAmount();
        System.out.println(ColletedAmount);
    }}



