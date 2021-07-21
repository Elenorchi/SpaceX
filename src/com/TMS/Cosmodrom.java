package com.TMS;

public class Cosmodrom {
    private IStart launch;

    public void launch(IStart launch) {
        this.launch = launch;
        if (launch.SystemCheck() == false) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            System.out.println("Предстартовая проверка пройдена");
            launch.StartEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            launch.start(launch);
        }
    }
}

