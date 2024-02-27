package app;


public class Main {

    public static void main(String[] args)  {

        FruitThread ft = new FruitThread();
        VegThread vt = new VegThread();

        ft.start();
        vt.start();
    }
}

