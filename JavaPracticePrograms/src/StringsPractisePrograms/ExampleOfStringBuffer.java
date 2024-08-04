package StringsPractisePrograms;

public class ExampleOfStringBuffer {
    public ExampleOfStringBuffer(){
    }
    public static void main(String[]args){
        System.out.println("StringinImmutable");
        String Text="Good";
        System.out.println("AppendingString:"+Text.concat("Luck!"));
        System.out.println("Stringismutable");
        System.out.println("Stringismutable");
        StringBuffer newtext=new StringBuffer("Good");
        System.out.println("AppendingStringBuffer:"+newtext.append("Luck!"));
        StringBuffer newtext1=new StringBuffer("riya");
        System.out.println("ReplaceStringBuffer:"+newtext1.replace(0,1,"z"));
        System.out.println("deleteStringBuffer:"+newtext1.delete(0,1));
        System.out.println("deleteStringBufferAtIndex:"+newtext1.deleteCharAt(2));
        System.out.println("InsertStringBuffer:"+newtext1.insert(0,"Priya"));
        System.out.println("CapacityofStringBuffer:"+newtext1.capacity());
        System.out.println("ReverseStringBuffer:"+newtext1.reverse());
    }
}