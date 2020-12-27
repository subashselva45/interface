package io.pragra.learning;

public class FullTimeEmployee implements IEmployee {
    @Override
    public void hire() {
        System.out.println("HIRING A FULLTIME EMPLOYEE");
    }

    @Override
    public void release() {
        System.out.println("TERMINATING FULLTIME EMPLOYEE");
    }

    @Override
    public double salary() {
        return 42000;
    }

    @Override
    public String[] benefits() {
        return new String[]{"Medical Insurance", "Education", "Dental Insurance"};
    }


    }

