package StringsPractisePrograms;

public class ExampleStringbuilder {

    public ExampleStringbuilder(){
    }
    public static void main(String[]args){
        System.out.println("StringinImmutable");
        String Text="Good";
        System.out.println("AppendingString:"+Text.concat("Luck!"));
        System.out.println("Stringismutable");
        StringBuilder newtext=new StringBuilder("Good");
        System.out.println("AppendingStringBuilder:"+newtext.append("Luck!"));
        StringBuilder newtext1=new StringBuilder("riya");
        System.out.println("ReplaceStringBuilder:"+newtext1.replace(0,1,"z"));
        System.out.println("deleteStringBuilder:"+newtext1.delete(0,1));
        System.out.println("deleteStringBuilderAtIndex:"+newtext1.deleteCharAt(2));
        System.out.println("InsertStringBuilder:"+newtext1.insert(0,"Priya"));
        System.out.println("CapacityofStringBuilder:"+newtext1.capacity());
        System.out.println("ReverseStringBuilder:"+newtext1.reverse());
    }
}



