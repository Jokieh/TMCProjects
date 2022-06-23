import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftArrayList = new ArrayList<>();

    public Package() {
        this.giftArrayList = giftArrayList;
    }

    public void addGift(Gift gift) {
        giftArrayList.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Gift gift : giftArrayList) {
            totalWeight += gift.getWeight();
        }

        return totalWeight;
    }
}
