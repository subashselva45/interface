package io.pragra.learning;

public interface IEmployee {
    default void hire(){

    }
    default void release(){

    }
    double salary();
    abstract String[] benefits();
}
