import java.util.Vector;

public class MUI {
    
    private Vector<Item> items;

    public MUI(int count) {
        items = new Vector<Item>(count);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void show() {
        for(int i=0; i<items.size(); ++i) {
            items.elementAt(i).action();
        }
    }

}
