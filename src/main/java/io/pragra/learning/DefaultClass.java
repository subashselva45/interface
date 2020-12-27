package io.pragra.learning;

public class DefaultClass{/*implements DefaultChecking {
    @Override
    public void print() {
        System.out.println("printing");
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }*/

    public static void main(String[] args) {

    abc(new DefaultChecking() {
        @Override
        public void show() {
            System.out.println("showing in anonymous class");
        }
    });
    }
    static void abc(DefaultChecking def){
     def.show();
    }
    }