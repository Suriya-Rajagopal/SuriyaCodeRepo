package SamplePrograms;
public class staticKeywordExample{
    static int TotalMarks=500;
    int marksObtained=0;
    public staticKeywordExample(){
    }
    public static void MarksStatic(){
        System.out.println("ItsaStaticMethod");
    }
    public void MarksNonstatic(){
        System.out.println("ItsanonStaticMethod");
        MarksStatic();
    }
    public static void main(String[]args){
        staticKeywordExample sk= new staticKeywordExample();

        MarksStatic();
        sk.MarksNonstatic();
        TotalMarks=1000;
        sk.marksObtained=470;
        staticKeywordExample sk1=new staticKeywordExample();
        TotalMarks=1200;
        sk1.marksObtained=900;
        System.out.println("Object1TotalMarks:"+TotalMarks);
        System.out.println("Object1MarksObtained:"+sk.marksObtained);
        System.out.println("Object2TotalMarks:"+TotalMarks);
        System.out.println("Object2MarksObtained:"+sk1.marksObtained);
    }
    static{
        System.out.println("StaticBlock1");
        System.out.println("StaticBlock2");
    }
}