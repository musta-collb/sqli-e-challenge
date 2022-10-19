package com.sqli;

public class ElevatorFactory {
    public Elevator getInstance(String description){
        return new Elevator(description);
    }
}
