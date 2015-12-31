package Runner;

import MUI.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello MUI!");
        MUI mui = new MUI();
        mui.addItem(new TestI());
        mui.addItem(new ExitI());
        mui.run();
    }
}
