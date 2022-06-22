import java.util.ArrayList;
import java.util.List;

public class Stack {
    private ArrayList<String> stack = new ArrayList<>();

    public Stack() {
        this.stack = stack;
    }

    public boolean isEmpty() {
        if (stack.isEmpty()) return true;
        return false;
    }

    public void add(String value) {
        stack.add(value);
    }

    public ArrayList<String> values() {
        return stack;
    }

    public String take() {
        String last = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return last;
    }


}
