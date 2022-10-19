package com.sqli;

public class RestState implements ElevatorState {
    private int floor;

    public RestState(int floors) {
        this.floor = floors;
    }

    @Override
    public int distanceFormFloor(int i) {
        return Math.abs(i-floor);
    }

    @Override
    public int getFloor() {
        return this.floor;
    }

    @Override
    public String toString() {
        return "RestState{" +
                "floor=" + floor +
                '}';
    }
}
