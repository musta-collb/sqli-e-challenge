package com.sqli;

public class DownState implements ElevatorState {
    private int floor ;
    private int numberOfFloors;

    public DownState(int numberOfFloors, int floor) {
        this.numberOfFloors = numberOfFloors;
        this.floor = floor;
    }

    @Override
    public int distanceFormFloor(int floor) {
        if(floor > this.floor){
            return floor + this.floor;
        }
        return this.floor-floor;
    }

    @Override
    public int getFloor() {
        return floor;
    }
}
