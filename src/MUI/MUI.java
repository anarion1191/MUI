package MUI;

import java.util.Vector;

public class MUI {
    
    private Vector<Item> items;

    public MUI() {
        items = new Vector<Item>();
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
