package org.vladislava_g;

public class Main {
    public static void main(String[] args) {
        Humans humans = new Humans();
        Thread mainThread = new Thread(new HumanTask(humans));
        mainThread.start();
    }
}