package com.TMS;

import java.util.Random;

public class Shuttle implements IStart {
    private IStart start;

    @Override
    public boolean SystemCheck() {
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(10);
        if (rndNumber > 3) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void start(IStart launch) {
        System.out.println("Старт Шатла -"+launch);
    }

    @Override
    public void StartEngine() {
        System.out.println("Двигатель Шатла запущен");
    }
}
