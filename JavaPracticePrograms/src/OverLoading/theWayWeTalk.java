package OverLoading;

public class theWayWeTalk {

    public theWayWeTalk(){
    }

    public void talk (Parents styleOfSpeaking ){
        System.out.println("SpeakPoliteandRespectfully");
    }
    public void talk(Friends styleOfSpeaking){
        System.out.println("SpeakwithEnjoymentandshareandeverything");
    }
    public void talk(officeManager styleOfSpeaking){
        System.out.println("SpeakNothingPersonal");
    }

    public static void main(String[]args){
        theWayWeTalk tk =new theWayWeTalk();
        Parents parents =new Parents();

        tk.talk(parents);
        Friends Friends=new Friends();
        tk.talk(Friends);
        officeManager officeManager=new officeManager();
        tk.talk(officeManager);
    }}

