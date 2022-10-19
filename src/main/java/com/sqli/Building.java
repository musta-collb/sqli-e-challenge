package com.sqli;

import java.lang.ref.PhantomReference;
import java.util.HashMap;

public class Building {
    private int numberOfFloors;
    private HashMap<String, Elevator>  elevators = new HashMap<>();
    private ElevatorFactory elevatorFactory = new ElevatorFactory();
    private Dispatcher dispatcher = new Dispatcher();

    public Building(int numberOfFloors,String ... elevators){
        this.numberOfFloors = numberOfFloors;
        for(String s: elevators){
            String[] strs = s.split(":");
            this.elevators.put(strs[0], elevatorFactory.getInstance(s));
        }
    }

    public String requestElevator(int level){

        return dispatcher.getCloseElevator(this.elevators, level);
    };
    public String requestElevator(){
        System.out.println(dispatcher.getCloseElevator(this.elevators, numberOfFloors));
        return  dispatcher.getCloseElevator(this.elevators, numberOfFloors);
    }

    public void move(String elevator, String direction){
        //Construct a new Elevator
        dispatcher.changeState(elevators, elevator, direction, this.numberOfFloors);
    }
    public void stopAt(String elevator, int floor){
        dispatcher.changeState(elevators, elevator, "STOP", this.numberOfFloors);
    }
}
