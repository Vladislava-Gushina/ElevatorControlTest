package org.vladislava_g;

public class HumanTask implements Runnable{
    private final Humans humans;

    public HumanTask(Humans humans) {
        this.humans = humans;
    }

    @Override
    public void run() {
        humans.firstHumans();
        humans.secondHumans();
    }
}
