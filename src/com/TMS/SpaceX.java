package com.TMS;

import java.util.Random;
import java.util.Scanner;

public class SpaceX implements IStart {
    private IStart start;

    @Override
    public boolean SystemCheck() {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Для запуска SpaceX введите пароль: ");
        int code = scan.nextInt();
        if (code == 166) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void start(IStart launch) {
        System.out.println("Старт SpaceX -"+launch);
    }

    @Override
    public void StartEngine() {
        System.out.println("Двигатель SpaceX запущен");
    }
}