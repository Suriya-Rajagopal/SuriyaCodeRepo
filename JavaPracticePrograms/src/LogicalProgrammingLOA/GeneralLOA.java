package LogicalProgrammingLOA;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GeneralLOA{
    public GeneralLOA(){
    }
    static void SwaaUsing3rdVariable(){
        System.out.println("/***SWAPPINGOFTWONUMBERSUSINGTHIRDVARIABLE***/");
        Scanner  scanner=new Scanner(System.in);
        System.out.println("EnterFirstValue:");
        int firstValue=scanner.nextInt();
        System.out.println("EnterSecondValue:");
        int secondValue=scanner.nextInt();
        System.out.println("ValuesBeforeSwapping:\n FirstValue:"+firstValue+"\n SecondValue:"+secondValue);
        System.out.println("ValuesAfterSwapping:\n FirstValue:"+secondValue+"\nSecondValue:"+firstValue);
    }
    static void SwapWithout3rdVariable()
    {
        System.out.println("/ ***SWAPPINGOFTWONUMBERSWITHOUTUSINGTHIRDVARIABLE***/");
        Scanner scanner=new Scanner(System.in);
        System.out.println("EnterFirstValue:");
        int firstValue=scanner.nextInt();
        System.out.println("EnterSecondValue:");
        int secondValue=scanner.nextInt();
        System.out.println("ValuesBeforeSwapping:\n FirstValue:"+firstValue+"\nSecondValue:"+secondValue);
        firstValue-=secondValue;
        secondValue+=firstValue;
        firstValue=secondValue-firstValue;

        //firstValue=secondValue-firstValue;
        System.out.println("ValuesAfterSwapping:\nFirstValue:"+firstValue+"\nSecondValue:"+secondValue);
    }
    static void reverseGivenNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("EntertheNumbertobeReversed:");
        int  givenNumber=scanner.nextInt();
        int reversedNumber=0;
        System.out.println("GivenNumber:"+givenNumber);
        while(givenNumber!=0){
            reversedNumber=reversedNumber*10+givenNumber%10;
            givenNumber/=10;
        }
        System.out.println("ReversedNumber:"+reversedNumber);
    }
    public void findSmallestUsingLoop(){
        int[]givenArray=new int[]{34,56,78,90,28,67};
        System.out.println("\nFINDINGSMALLESTNUMBERINANARRAYUSINGLOOP");
        int smallestnumber=Integer.MAX_VALUE;
        for(int i=0;i<givenArray.length;++i){
            if(givenArray[i]<smallestnumber){
                smallestnumber=givenArray[i];
            }}
        System.out.print("SmallestNumberusingloop:"+smallestnumber);
        System.out.println();
    }
    public void findSmallestUsingArray(){
        int[]givenArray=new int[]{34,56,78,90,28,67};
        System.out.println("\nFINDINGSMALLESTNUMBERINANARRAYUSINGARRAYSSORT");
        System.out.print("BeforeArraysSorting:"+givenArray[0]);
        Arrays.sort(givenArray);
        System.out.print("\nSmallestNumberAfterSortingUsingArrays:"+givenArray[0]);
        System.out.println();
    }
    public void findSmallestUsingCollections(){
        Integer[]givenArray=new Integer[]{34,56,78,90,28,67};
        System.out.println("\nFINDINGSMALLESTNUMBERINANARRAYUSINGCOLLECTIONSS ORT");
                List<Integer>list=Arrays.asList(givenArray);
        System.out.print("BeforeListSortingSorting:"+list.get(0));
        Collections.sort(list);
        System.out.print("\nSmallestNumberAfterSortingUsingCollections:"+list.get(0));
        System.out.println();
    }

static void findTheGivenNumberIntheArray(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("EntertheNumber:");
    int givenNumber=scanner.nextInt();
    int[]givenArray=new int[]{2,5,6,7,8,9};
    boolean found=false;
    for(int i=0;i<givenArray.length;++i){
        if(givenArray[i]==givenNumber){
            found=true;
            System.out.println("IndexofthegivenNumber:"+i);
            break;
        }
    }
    if(found){
        System.out.println("GivenNumberispresentintheArray");
    }else{
        System.out.println("GivenNumberisnotpresentintheArray");
    }
}
public static void main(String[]args){
}
}