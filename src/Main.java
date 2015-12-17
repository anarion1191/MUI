public class Main {
    public static void main(String[] args) {
        System.out.println("Hello MUI!");
        MUI mui = new MUI(3); //just a test
        mui.addItem(new ExitI());
        mui.show();
    }
}
