package org.vladislava_g;

import java.util.Scanner;

import static org.vladislava_g.MyValues.*;

public class Floor {
    int floorNumber;
    Scanner scanner = new Scanner(System.in);
    LoadCapacity loadCapacity = new LoadCapacity();

    protected void callButton(int floorNumber) {//кнопка вызова
        System.out.println(FINDING_A_FLOOR + floorNumber);

        if(floorNumber == 1){
            System.out.println(WAITING_ELEVATOR_ONE);
            sleepThread();
            System.out.println(ELEVATOR_DOORS_ONE_OPEN);
            System.out.println(ELEVATOR_SECOND_STATUS);
        }else if (floorNumber > 20) {
            System.out.println(THERE_IS_NO_FLOOR);
        }else {
            System.out.println(ELEVATOR_TWO_IS_CALLED);
            System.out.println(ELEVATOR_ONE_IS_NOT_CALLED);
            sleepThread();
            System.out.println(GOING_DOWN);
        }
    }

    protected void choosingFloor(int floorNumberUser){//выбор этажа юзером

        System.out.println(CHOOSING_FLOOR + floorNumberUser);

        if (floorNumberUser > floorNumber || floorNumberUser < floorNumber){
            System.out.println(SENSOR_FIXES);
            sleepThread();
            System.out.println(SENSOR_DOES_NOT_FIX);
            sleepThread();
            System.out.println("Вы приехали на " + floorNumberUser + " этаж\n");
        }
    }

    protected void functionSelection() {
        System.out.println(FUNCTION_NUMBER);

        System.out.println(ENUMERATION_OF_FUNCTIONS);

        int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(FINDING_A_FLOOR);
                    int floorNumber = scanner.nextInt();

                    while (!((floorNumber >= 1) && (floorNumber <= 20))) {
                        System.out.println(THERE_IS_NO_FLOOR);
                        System.out.print(FINDING_A_FLOOR);
                        floorNumber = scanner.nextInt();
                    }

                    System.out.println(CHOOSING_FLOOR);
                    int floorNumberUser = scanner.nextInt();

                    while (!((floorNumberUser >= 1) && (floorNumberUser <= 20))) {
                        System.out.println(THERE_IS_NO_FLOOR);
                        System.out.print(CHOOSING_FLOOR);
                        floorNumberUser = scanner.nextInt();
                    }

                    loadCapacity.closeTheDoors();
                    System.out.println(SENSOR_FIXES);
                    sleepThread();
                    System.out.println(SENSOR_DOES_NOT_FIX);
                    sleepThread();
                    loadCapacity.openDoors();
                    System.out.println("Вы приехали на " + floorNumberUser + " этаж\n");
                    break;
                case 2:
                    loadCapacity.openDoors();
                    break;
                case 3:
                    loadCapacity.closeTheDoors();
                    break;
                case 4:
                    loadCapacity.callingDispatcher();
                    break;
            }
    }

    public void sleepThread () {
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
