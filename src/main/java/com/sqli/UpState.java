package com.sqli;

public class UpState implements ElevatorState {
    private int floor;
    private int numberOfFloors;

    public UpState(int numberOfFloors, int floor) {
        this.floor = floor;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public int distanceFormFloor(int floor) {
        if(floor > this.floor){
            return Math.abs(floor - this.floor);
        }
        return (numberOfFloors - floor) + numberOfFloors;
    }

    @Override
    public int getFloor() {
        return this.floor;
    }
}
