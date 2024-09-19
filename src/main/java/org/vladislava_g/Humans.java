package org.vladislava_g;

public class Humans {
    Floor floor = new Floor();
    ElevatorCabin elevatorCabin = new ElevatorCabin();

   protected void firstHumans(){
       System.out.println("Пассажир 1");
       elevatorCabin.definitionFloor();
       elevatorCabin.locationElevator();
       floor.callButton(1);
       floor.choosingFloor(14);
       floor.functionSelection();
   }

   protected void secondHumans(){
       System.out.println("Пассажир 2");
       elevatorCabin.definitionFloor();
       elevatorCabin.locationElevator();
       floor.callButton(15);
       floor.choosingFloor(1);
       floor.functionSelection();
   }
}
