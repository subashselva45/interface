package io.pragra.learning;

public class Contractor extends Person implements IEmployee,Iprint {
    @Override
    public void hire() {
        System.out.println("Temporary Hire");
    }

    @Override
    public void release() {
        System.out.println("Cancel/Expire Contract");
    }

    @Override
    public double salary() {
        return 50000;
    }

    @Override
    public String[] benefits() {
        return new String[0];
    }

    @Override
    public void printdetails() {

    }
}
