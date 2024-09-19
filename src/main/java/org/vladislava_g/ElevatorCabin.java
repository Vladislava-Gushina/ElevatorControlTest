package org.vladislava_g;

import java.util.Random;

import static org.vladislava_g.MyValues.*;

public class ElevatorCabin extends Floor{
    int displayFirst;
    int displaySecond;
    Random random = new Random();

    protected void definitionFloor(){//дисплей
        displayFirst = random.nextInt(20);
        displaySecond = random.nextInt(20);

        while (!((displayFirst >= 1) && (displayFirst <= 20))) {
            System.out.println(THERE_IS_NO_FLOOR);
            System.out.print(FINDING_A_FLOOR + EMPTY + displayFirst);
            displayFirst = random.nextInt();
        }
        System.out.println(THERE_ONE_ELEVATOR_ON_THE_FLOOR + displayFirst);

        while (!((displaySecond >= 1) && (displaySecond <= 20))){
            System.out.println(THERE_IS_NO_FLOOR);
            System.out.print(CHOOSING_FLOOR + displayFirst);
            displaySecond = random.nextInt();
        }
        System.out.println("Лифт 2 находится на этаже: " + displaySecond);
    }

    protected void locationElevator(){//сотстояние
        int stateIndexFirst= random.nextInt(4);
        int stateIndexSecond = random.nextInt(4);
        String[] locationArr = {"едет вверх", "едет вниз", "открывает двери", "закрывает двери", "стоит с открытыми дверьми"};

        String currentStateFirst = locationArr[stateIndexFirst];
        String currentStateSecond = locationArr[stateIndexSecond];

        System.out.println("Состояние кабины 1: " + currentStateFirst + "\nСостояние кабины 2: " + currentStateSecond);

    }
}
