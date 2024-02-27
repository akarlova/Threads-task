package app;

public class VegThread extends Thread {

    public void run() {

        System.out.println("tomato, carrot, onion");
        Constants.vtExecuted = true;

    }
}

