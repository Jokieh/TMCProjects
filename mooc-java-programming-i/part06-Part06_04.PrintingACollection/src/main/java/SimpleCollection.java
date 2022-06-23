
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString () {
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        } else {
            String returnString = "";
            returnString += "The collection " + name + " has " + elements.size() + " element";
            if (elements.size() > 1) {
                returnString += "s:";
            } else returnString += ":";
            for (String element : elements) {
                returnString += "\n" + element;
            }
            return returnString;
        }
    }
    
}
