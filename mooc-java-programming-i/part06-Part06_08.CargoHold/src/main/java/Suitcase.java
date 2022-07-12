import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (!((totalWeight() + item.getWeight()) > maxWeight)) {
            items.add(item);
        }
    }

    public String toString() {

        if (items.size() == 0) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)";
        } else {
            return items.size() + " items (" + totalWeight() + " kg)";
        }
    }

    public int totalWeight() {
        Integer currentWeight = 0;

        for (Item item : items) {
            currentWeight += item.getWeight();
        }

        return currentWeight;
    }

    public void printItems () {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public Item heaviestItem () {
        if (items.size() == 0) return null;

        Item heaviest = items.get(0);

        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }
}
