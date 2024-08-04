package LogicalProgrammingLOA;

import java.util.Scanner;
public class PatternsLOA {

    public PatternsLOA(){
    }
    static void Pattern1(){
        System.out.println("EnterNumberOfRowsforPattern1");
        Scanner scanner=new Scanner(System.in);
        int NumberOfRows=scanner.nextInt();
        for(int row=0;row<=NumberOfRows;++row){
            for(int Col=0;Col<row;++Col){
                System.out.print("*");
            }
            System.out.println();
        }

    }

static void Pattern2(){
    System.out.println("EnterNumberOfRowsforPattern2");
    Scanner scanner=new Scanner(System.in);
    int NumberOfRows=scanner.nextInt();
    int StartingNumber=1;
    for(int row=0;row<=NumberOfRows;++row){
        for(int Col=0;Col<row;++Col){
            System.out.print(""+StartingNumber);
            ++StartingNumber;
        }
        System.out.println();
    }
}
public static void main(String[]args){
    Pattern2();
}
}





