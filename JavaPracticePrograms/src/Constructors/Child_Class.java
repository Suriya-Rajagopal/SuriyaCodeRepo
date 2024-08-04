package Constructors;

public class Child_Class {

    public class ChildClass extends Parent_Class {
        ChildClass() {
            System.out.println("ChildConstructor");
        }

        public static void main(String[] args) {
            new Child_Class();

        }

    }
}