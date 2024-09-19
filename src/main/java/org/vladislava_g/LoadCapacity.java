package org.vladislava_g;

import java.util.Scanner;

import static org.vladislava_g.MyValues.*;

public class LoadCapacity {
    Scanner scanner = new Scanner(System.in);

    protected void closeTheDoors(){
        System.out.println(CLOSE_THE_DOORS);
    }

    protected void openDoors(){
        System.out.println(OPEN_THE_DOORS);
    }

    protected void callingDispatcher(){
        System.out.println(CALLING_THE_DISPATCHER);
        scanner.nextLine();
        System.out.println(THANKS_MECHANIC);
    }
}
