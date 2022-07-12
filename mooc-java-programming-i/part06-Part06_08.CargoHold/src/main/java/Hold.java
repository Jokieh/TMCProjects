import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!((totalWeight() + suitcase.totalWeight()) > maxWeight)) {
            suitcases.add(suitcase);
        }
    }

    public String toString() {
        if (suitcases.size() == 0) {
            return "no items (0 kg)";
        } else if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + totalWeight() + " kg)";
        } else {
            return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
        }
    }

    public Integer totalWeight() {
        Integer currentWeight = 0;

        for (Suitcase suitcase : suitcases) {
            currentWeight += suitcase.totalWeight();
        }

        return currentWeight;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
