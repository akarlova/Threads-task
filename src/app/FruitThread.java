package app;


public class FruitThread extends Thread {

    public void run() {
        while (!Constants.vtExecuted) {}
            System.out.println("orange, mango, peach, apple");
        }
    }




