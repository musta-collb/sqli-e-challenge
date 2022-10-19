package com.sqli;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Dispatcher {
    public String getCloseElevator(HashMap<String, Elevator> elavotors, int numberOfFloor){
        return Collections.min(elavotors.values(), Comparator.comparingInt(value ->{
                    System.out.println(numberOfFloor);
                    System.out.println(value);
                    System.out.println(value.getDistance(numberOfFloor));
                    return value.getDistance(numberOfFloor);
                })).getId();
    }
    public void changeState(HashMap<String, Elevator> elevatorHashMap ,
                            String elevator, String direction, int numberOfFloors){
        Elevator  elevator1 = elevatorHashMap.get(elevator);
        int floor = elevator1.getElevatorState().getFloor();
        ElevatorState elevatorState;
        switch (direction){
            case "UP": elevatorState = new UpState(numberOfFloors, floor);break;
            case "DOWN": elevatorState = new DownState(numberOfFloors, floor);break;
            case "STOP": elevatorState = new StopState(floor);break;
            default:
                elevatorState = new RestState(floor);
        }
        elevator1.setElevatorState(elevatorState);
        elevatorHashMap.put(elevator, elevator1);
    }
}
