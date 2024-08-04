package SamplePrograms;


/****
 *
 *
 */
public class ObjectCreationExample {

    Long accountnumber=2281310L;
    String accountHolderName="Suriya";
    int accounBalance=40000;
//    public ObjectCreationExample(){
//    }
    public void getBalance(){
        System.out.println("MyAccountbalanceis :"+this.accounBalance);
    }
    public void getAccountNumber(){
        System.out.println("MyAccountNumberis :"+this.accountnumber);
    }
    public void getAccountHolderName(){
        System.out.println("AccountHolderNameis :"+this.accountHolderName);
    }
    public static void main(String[]args){
        ObjectCreationExample account=new ObjectCreationExample();
        account.getBalance();
        account.getAccountNumber();
        account.getAccountHolderName();
    }
}



