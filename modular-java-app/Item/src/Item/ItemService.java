package Item;
import java.util.ArrayList;
import java.util.List;
public class ItemService {
    private List<Item> items = new ArrayList<>();
    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }
    public List<Item> getItems() {
        return items;
    }
}
