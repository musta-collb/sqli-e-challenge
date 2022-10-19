package com.sqli;

public class StopState implements ElevatorState{
    private int floor;

    public StopState(int floor) {
        this.floor = floor;
    }

    @Override
    public int distanceFormFloor(int floor) {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getFloor() {
        return this.floor;
    }
}
