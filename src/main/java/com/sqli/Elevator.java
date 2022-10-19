package com.sqli;

public class Elevator{
    private ElevatorState elevatorState;
    private String id;

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Elevator(String description){
        String[] strings = description.split(":");
        id = strings[0];
        int floor = Integer.parseInt(strings[1]);
        this.elevatorState = (ElevatorState) new RestState(floor);
    };

    public int getDistance(int floor){
        return elevatorState.distanceFormFloor(floor);
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "elevatorState=" + elevatorState +
                ", id='" + id + '\'' +
                '}';
    }

}
