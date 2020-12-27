package io.pragra.learning;

public interface IEnjoy {
    void enjoy();

    public static void main(String[] args) {
        IEnjoy enjoy = new IEnjoy() {
            @Override
            public void enjoy() {
                System.out.println("Anonymous class Implimentation");
            }
        };
        enjoy.enjoy();
    }
}
