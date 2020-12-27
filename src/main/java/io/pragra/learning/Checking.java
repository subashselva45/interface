package io.pragra.learning;

public interface Checking {
     void print();
    default void display(){
        System.out.println("checking the default keyword call");
    }

    public static void main(String[] args) {

        abc(()->{
            System.out.println("printing");
        });

    }
     static void abc(Checking check){
        check.print();
        check.display();
    }
}
