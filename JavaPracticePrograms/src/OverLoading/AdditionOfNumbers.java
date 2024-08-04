package OverLoading;

public class AdditionOfNumbers {
    /******AdditonOfNumbers************/

        public AdditionOfNumbers(){
        }
        public void Sum(int a,int b){
            int c=a+b;
            System.out.println("AnswerforfirstSumis"+c);
        }
        public void Sum(int a,double b,int c){
            double d=(double)a+b+(double)c;
            System.out.println("AnswerforSecondSumis"+d);
        }
        public void Sum(int b,int c,double a){
            double d=a+(double)b+(double)c;
            System.out.println("AnswerforThirdSumis"+d);
        }
        public static void main(String[] args){
            AdditionOfNumbers add=new AdditionOfNumbers();
            add.Sum(5,10);
            add.Sum(5,10);
            add.Sum(45,78,79.34);
            add.Sum(3,7.5,9);
        }
    }

