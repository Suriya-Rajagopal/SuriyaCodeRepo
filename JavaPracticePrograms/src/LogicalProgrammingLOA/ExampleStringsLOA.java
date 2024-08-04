package LogicalProgrammingLOA;
import java.util.Scanner;


public class ExampleStringsLOA{
    String given="Flower";
    public ExampleStringsLOA(){
    }

    static void ReverseAStringUsingStringBuffer(){
        String given="Flower";
        System.out.println("GivenString:"+given);
        StringBuffer  Buffer=new StringBuffer();
        Buffer.append(given);
        System.out.println();
        System.out.println("ReversedString:"+ Buffer.reverse());
    }
    static void ReverseAStringUsingCharArray(){
        String given="Flower";
        System.out.println("GivenString:"+given);
        char[]chararray=given.toCharArray();
        String reversedString="";
        for(int i=chararray.length-1;i>=0;--i){
            reversedString=reversedString+chararray[i];
        }
        System.out.println("ReversedString:"+reversedString);
    }
    static void findLengthOfTheStringWithoutLengthMethod(){
        String FlowerName="Dhalia";
        char[]chararray=FlowerName.toCharArray();
        int charlength=chararray.length;
        System.out.println("StringLengthwithChar:"+charlength);
        int length=0;
        char[]var4=chararray;
        int var5=chararray.length;
        for(int var6=0;var6<var5;++var6){
            char var10000=var4[var6];
            ++length;
        }
        System.out.println("StringLength:"+length);
    }


        static void ReverseWordsInASentence(){
            String given="ILoveMyself";
            String reversed="";
            String[]temp=given.split("");
            System.out.println(temp.length);
            System.out.println(temp[0]);
            System.out.println(temp[1]);
            System.out.println(temp[2]);
            for(int i=temp.length-1;i>=0;--i){
                reversed=reversed+temp[i]+"";
            }
            System.out.println(reversed);
        }
        static void findtheAlphabeticalPositionOfTheGivenCharacter(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("EntertheCharacter:");
            char given=scanner.next().charAt(0);
            given=Character.toLowerCase(given);
            System.out.println(given);
            System.out.println("ASCIIvalueofthegivenQCharcter:"+given);
            int Position=given-96;
            System.out.println("AlphabeticalOrderpositionofthegivenCharacter:"+Position);
        }
        static void findTheNumberofOccurencesOftheLetter() {
            String myName="RajaSuriya";
            char givenletter=97;
            int Occurence=0;
            myName=myName.toLowerCase();
            for(int i=0;i<myName.length();++i){
                if(myName.charAt(i)==givenletter){
                    ++Occurence;
                }}
            System.out.println("NumberOfOccurenceforthegivenLetter:"+Occurence);
        }
        static void replacetheVowelswithSpecialCharacters()
    {
            String givenString="IloveMyself";
            char[]charArray=givenString.toCharArray();
            System.out.println("ReplacedStringUsingloops:");
            int j;
            for(j=0;j<givenString.length();++j){
                if(givenString.charAt(j)=='A'||givenString.charAt(j)=='E'||givenString.charAt(j)=='I'||givenString
                .charAt(j)=='O'||givenString.charAt(j)=='U'||givenString.charAt(j)=='a'||givenString.charAt(j)
                        =='e'||givenString.charAt(j)=='i'||givenString.charAt(j)=='o'||givenString.charAt(j)=='u'){
                    charArray[j]='*';
                }

            }

        for(j=0;j<givenString.length();++j)
        {
            System.out.print(charArray[j]);
        }
        String ReplacedString= givenString.replaceAll("[AEIOUaeiou]","\\$");
        System.out.println("\nReplacedStringUsingRegularExpression:\n"+ReplacedString);
    }
    static void removingLeadingAndTrailingSpaces(){
        String givenInput="PerseverancePaysOff";
        System.out.println("RemovingLeadingandTrailingSpacesUSingTRIMfunction");
        System.out.println(givenInput.trim());
        System.out.println("RemovingLeadingandTrailingSpacesUSingSTRIPfunction");
        System.out.println(givenInput.strip());
        System.out.println("RemovingLeadingandTrailingSpacesUSingSTRIPLEADINGfunction");
        System.out.println(givenInput.strip());
        System.out.println("RemovingLeadingandTrailingSpacesUSingSTRIPTRAILINGfunction");
        System.out.println(givenInput.stripLeading());
        System.out.println("RemovingLeadingandTrailingSpacesUSingSTRIPTRAILINGfunction");
        System.out.println(givenInput.stripTrailing());
        System.out.println("RemovingLeadingandTrailingSpacesUSingREGULAREXPRESSION");
        System.out.println(givenInput.replaceAll("^[\t]+|[\t]+$",""));
        System.out.println("RemovingLeadingSpacesUSingREGULAREXPRESSION");
        System.out.println(givenInput.replaceAll("^[\t]",""));
        System.out.println("RemovingTrailingSpacesUSingREGULAREXPRESSION");
        System.out.println(givenInput.replaceAll("[\t]+$",""));
    }
    static void findingNumberOfVowelsInTheGivenString(){
        String givenString="ILOVEMYSELF";
        givenString=givenString.toUpperCase();
        int occurence=0;
        for(int i=0;i<givenString.length();++i){
            if(givenString.charAt(i)=='A'||givenString.charAt(i)=='E'||givenString.charAt(i)=='I'||givenString
            .charAt(i)=='O'){
                ++occurence;
            }
        }
        System.out.println("NumberOfVowels:"+occurence);
    }
    static void addTheDigitsIntheGivenString(){
        int total=0;
        String GivenString="Suriya20111995";
        for(int i=0;i<GivenString.length();++i){
            char Chac=GivenString.charAt(i);
            if(Character.isDigit(Chac)){
                total+=Character.getNumericValue(Chac);

                total+=Character.getNumericValue(Chac);
            }}
        System.out.println("SUMOFTHEDIGITS:"+total);
    }
    public static void main(String[]args){
        addTheDigitsIntheGivenString();
    }}